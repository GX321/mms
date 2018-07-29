/**   
* @Title: SendmailController.java 
* @Package com.clps.mms.sm.controller 
* @Description: sendmail控制层
* @author martin.dai   
* @date 2018年5月7日 下午3:52:59 
* @version V1.0   
*/
package com.clps.mms.util.controller;



import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clps.mms.util.Md5.Md5;
import com.clps.mms.util.paging.PagingVO;
import com.clps.mms.util.pojo.Sendmail;
import com.clps.mms.util.service.ISendmailService;





/** 
* @ClassName: SendmailController 
* @Description: Sendmail  Controller 
* @author martin.dai
* @date 2018年5月7日 下午3:52:59 
*  
*/
@Controller
@RequestMapping(value="/sm")
public class SendmailController {
	
	@Resource
	private ISendmailService iss;
	
	private PagingVO pagingVO = new PagingVO();
	
	private List<Sendmail> sendmails;
	
	
	/** 
	* @Title: showSendmail 
	* @Description: 返回列表页面
	* @param @param model
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/sendmailList")
	public String showSendmail(Model model,Integer page){
		
        pagingVO.setTotalCount(iss.countByExample());
        
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            sendmails = iss.findByPaging(pagingVO);
        } else {
            pagingVO.setToPageNo(page);
            sendmails = iss.findByPaging(pagingVO);
        }
		
		model.addAttribute("sendmails", sendmails);
		model.addAttribute("pagingVO", pagingVO);
		
		return "sm/sendmail_list";
	}
	
	/** 
	* @Title: toAddMail 
	* @Description: 跳转到新增页面
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/toAddMail")
	public String toAddMail(){
		return "sm/sendmail_add";
	}
	
	/** 
	* @Title: addSendmail 
	* @Description: 新增功能
	* @param @param record
	* @param @param model
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/addMail",method=RequestMethod.POST)
	public String addSendmail(Sendmail record,Model model){
		record.setEmailIsVisable(true);
		record.setEmailStatus(true);
		iss.addSendMail(record);
		return "redirect:/sm/sendmailList";
		
	}
	
	/** 
	* @Title: delSendmail 
	* @Description: 删除功能
	* @param @param emailId
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/delMail",method=RequestMethod.GET)
	public String delSendmail(Integer emailId){
		
		iss.deleteByEmailId(emailId);
		
		return "redirect:/sm/sendmailList";
	}
	
	/** 
	* @Title: getMail 
	* @Description: 获取单个信息
	* @param @param emailId
	* @param @param model
	* @param @param request
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/getMail",method=RequestMethod.GET)
	public String getMail(Integer emailId,Model model){
		Sendmail sendmail = iss.querySendmailByEmailId(emailId);
		model.addAttribute("sendmail",sendmail);
		return "sm/sendmail_update";
	}
	
	/** 
	* @Title: updateMail 
	* @Description: 修改信息
	* @param @param record
	* @param @param model
	* @param @param request
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/updateMail",method=RequestMethod.POST)
	public String updateMail(Sendmail record,Model model){
		iss.updateSendMail(record);	
		record = iss.querySendmailByEmailId(record.getEmailId());
		return "redirect:/sm/sendmailList";
	}
	
	
	/** 
	* @Title: fuzzyQuery 
	* @Description: 模糊查询
	* @param @param emailRecipient
	* @param @param model
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/queryMailByName")
	public String fuzzyQuery(String emailRecipient,Model model){
		List<Sendmail> sendmails = iss.querySendmailByName(emailRecipient);
		model.addAttribute("sendmails", sendmails);
		return "sm/sendmail_list";
	}
	
	
	/** 
	* @Title: toMailSend 
	* @Description: 跳转到发邮件页面
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/toMailSend")
	public String toMailSend(){
		return "sm/sendmail_send";
	}
	
	/** 
	* @Title: send 
	* @Description:发送邮件
	* @param @param hisEmail
	* @param @param subject
	* @param @param content
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/send")
	public String  send(String hisEmail,String subject,String content){
		iss.sendEmail(hisEmail, subject, content);
		return "sm/sendmail_send_success";
	}
	
	/** 
	* @Title: forget 
	* @Description: 忘记密码
	* @param @param request
	* @param @return 
	* @return String 
	* @throws 
	*/
	@RequestMapping(value="/forget")
	public String  forget(HttpServletRequest request){
		try {
                String secretKey = UUID.randomUUID().toString(); // 密钥
                Timestamp outDate = new Timestamp(System.currentTimeMillis() + 30 * 60 * 1000);// 30分钟后过期
                long date = outDate.getTime() / 1000 * 1000;// 忽略毫秒数  mySql 取出时间是忽略毫秒数的
                String account=request.getParameter("account");
                String email=request.getParameter("email");
                
                String key =account + "$" + date + "$" + secretKey;
                String digitalSignature = Md5.md5(key);// 数字签名

                String path = request.getContextPath();
                String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ path+"/";
                String resetPassHref = basePath + "checkLink?account="
                        + digitalSignature +"&acount="+account;
                String emailContent = "请勿回复本邮件.点击下面的链接,重设密码<br/><a href="
                        + resetPassHref + " target='_BLANK'>" + resetPassHref
                        + "</a>  或者    <a href=" + resetPassHref
                        + " target='_BLANK'>点击我重新设置密码</a>"
                        + "<br/>tips:本邮件超过30分钟,链接将会失效，需要重新申请'找回密码'" + key
                        + "\t" + digitalSignature;
                String subject ="忘记密码，密码找回";
                iss.sendEmail(email, subject, emailContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return "sm/sendmail_send_success";
	}
	
	@RequestMapping(value="/checkLink")
	public String  checkLink(){
       return "success";     
            
	}
	

	
	
	
	
	

}
