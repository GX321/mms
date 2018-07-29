/**   
* @Title: ISendMailImpl.java 
* @Package com.clps.mms.sm.service.impl 
* @Description: sendmail service层实现
* @author martin   
* @date 2018年5月7日 上午9:29:14 
* @version V1.0   
*/
package com.clps.mms.util.service.impl;

import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clps.mms.common.SupportConstant;
import com.clps.mms.util.dao.SendmailMapper;
import com.clps.mms.util.paging.PagingVO;
import com.clps.mms.util.pojo.Sendmail;
import com.clps.mms.util.service.ISendmailService;



/** 
* @ClassName: ISendMailImpl 
* @Description: sendmail service层实现
* @author martin
* @date 2018年5月7日 上午9:29:14 
*  
*/
@Service("sendmailService")
public class SendmailServiceImpl implements ISendmailService{
	
	@Autowired
    private SendmailMapper sendmailMapper;
	/* 
	*  
	*  
	* @return 
	* @see com.clps.mms.sm.service.ISendMail#queryAllSendmail() 
	*/
	public List<Sendmail> queryAllSendmail() {
		
		return sendmailMapper.queryAllSendmail();
	
	}
	/* 
	*  
	*  
	* @param record
	* @return 
	* @see com.clps.mms.sm.service.ISendmailService#insertSendMail(com.clps.mms.sm.pojo.Sendmail) 
	*/
	public String addSendMail(Sendmail record) {
		
		if(sendmailMapper.addSendMail(record)>0){
			return SupportConstant.ADD_SUCCESS;
		}
		return SupportConstant.ADD_FAILURE;
	}
	/* 
	*  
	*  
	* @param emailId
	* @return 
	* @see com.clps.mms.sm.service.ISendmailService#deleteByEmailId(java.lang.Integer) 
	*/
	public String deleteByEmailId(Integer emailId) {
		if(sendmailMapper.deleteByEmailId(emailId)>0){
			return SupportConstant.DELETE_SUCESS;
		}
		return SupportConstant.DELETE_FAILURE;
	}
	/* 
	*  
	*  
	* @param record
	* @return 
	* @see com.clps.mms.sm.service.ISendmailService#updateSendMail(com.clps.mms.sm.pojo.Sendmail) 
	*/
	public String updateSendMail(Sendmail record) {
		if(sendmailMapper.updateSendMail(record)>0){
			return SupportConstant.UPDATE_SUCESS;
		}
		return SupportConstant.UPDATE_FAILURE;
	}
	/* 
	*  
	*  
	* @param emailId
	* @return 
	* @see com.clps.mms.sm.service.ISendmailService#querySendmailByEmailId(java.lang.Integer) 
	*/
	public Sendmail querySendmailByEmailId(Integer emailId) {
		return sendmailMapper.querySendmailByEmailId(emailId);
	
	}
	/* 
	*  
	*  
	* @param emailRecipient
	* @return 
	* @see com.clps.mms.sm.service.ISendmailService#querySendmailByName(java.lang.String) 
	*/
	public List<Sendmail> querySendmailByName(String emailRecipient) {
		
		return sendmailMapper.querySendmailByName(emailRecipient);
	}
	/* 
	*  
	*  
	* @return 
	* @see com.clps.mms.util.service.ISendmailService#countByExample() 
	*/
	@Override
	public int countByExample() {
		return sendmailMapper.countByExample();
	}
	/* 
	*  
	*  
	* @param pagingVO
	* @return 
	* @see com.clps.mms.util.service.ISendmailService#findByPaging(com.clps.mms.util.pojo.PagingVO) 
	*/
	@Override
	public List<Sendmail> findByPaging(PagingVO pagingVO) {
		
        List<Sendmail> sendmail = sendmailMapper.findByPaging(pagingVO);
        if (sendmail != null) {
			return sendmail;
		} else{
			return null;
		}

	}

	    // 发件人的 邮箱 和 密码（替换为自己的邮箱和密码）
	    // 对于开启了独立密码的邮箱, 这里的邮箱密码必需使用这个独立密码（授权码）。
	    public static String myEmailAccount = "djxsyy@126.com";
	    public static String myEmailPassword = "96248449494DJX";
	    public static String myEmailName = "阑珊听雪";
	    // qq邮箱的SMTP服务器地址：smtp.qq.com
	    public static String myEmailSMTPHost = "smtp.126.com";
	/* 
	*  
	*  
	* @param hisEmail
	* @param subject
	* @param content 
	* @see com.clps.mms.util.service.ISendmailService#sendEmail(java.lang.String, java.lang.String, java.lang.String) 
	*/
	public void sendEmail(String hisEmail, String subject, String content) {
        try {
            // 1. 创建参数配置, 用于连接邮件服务器的参数配置
            final Properties props = new Properties(); // 参数配置
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.host", "smtp.126.com");

            // 发件人的账号
            props.put("mail.user", myEmailAccount);
            // 发件人的密码
            props.put("mail.password", myEmailPassword);
            //网易邮箱必须这样，使用Authenticator，进行一系列的验证。不然就是给你504，验证失败或者辣鸡邮件发不出去
            Authenticator authenticator = new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    String userName = props.getProperty("mail.user");
                    String password = props.getProperty("mail.password");
                    return new PasswordAuthentication(userName, password);
                }
            };

            // 使用环境属性和授权信息，创建邮件会话
            Session mailSession = Session.getInstance(props, authenticator);
            // 创建邮件消息
            MimeMessage message = new MimeMessage(mailSession);
            // 设置发件人
            String username = props.getProperty("mail.user");
            InternetAddress form = new InternetAddress(username);
            message.setFrom(form);

            // 设置收件人
            InternetAddress to = new InternetAddress(hisEmail);
            message.setRecipient(RecipientType.TO, to);

            // 设置邮件标题
            message.setSubject(subject);

            // 设置邮件的内容体
            message.setContent(content, "text/html;charset=UTF-8");
            // 发送邮件
            Transport.send(message);
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
		
		
}


