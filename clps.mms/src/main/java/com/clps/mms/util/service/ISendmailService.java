/**   
* @Title: ISendMail.java 
* @Package com.clps.mms.util.service 
* @Description: sendmail service层
* @author martin.dai   
* @date 2018年5月7日 上午9:28:39 
* @version V1.0   
*/
package com.clps.mms.util.service;

import java.util.List;

import com.clps.mms.util.paging.PagingVO;
import com.clps.mms.util.pojo.Sendmail;



/** 
* @ClassName: ISendMail 
* @Description: sendmail service层实现接口
* @author martin.dai
* @date 2018年5月7日 上午9:28:39 
*  
*/
public interface ISendmailService {
	
	/** 
	* @Title: queryAllSendmail 
	* @Description: 查询所有邮件
	* @param @return 
	* @return List<Sendmail> 
	* @throws 
	*/
	List<Sendmail> queryAllSendmail();
	
	
	/** 
	* @Title: querySendmailByEmailId 
	* @Description: 根据邮件id号查询邮件信息
	* @param @param emailId
	* @param @return 
	* @return Sendmail 
	* @throws 
	*/
	Sendmail querySendmailByEmailId(Integer emailId);
	
	
	/** 
	* @Title: querySendmailByName 
	* @Description: 根据收件人名查询邮件信息
	* @param @param emailRecipient
	* @param @return 
	* @return List<Sendmail> 
	* @throws 
	*/
	List<Sendmail> querySendmailByName(String emailRecipient);
	
	
	/** 
	* @Title: insertSendMail 
	* @Description: 插入邮件
	* @param @param record
	* @param @return 
	* @return int 
	* @throws 
	*/
	String addSendMail(Sendmail record);
	
	
	/** 
	* @Title: deleteByEmailId 
	* @Description: 根据邮件id号删除邮件
	* @param @param emailId
	* @param @return 
	* @return int 
	* @throws 
	*/
	String deleteByEmailId(Integer emailId);
	
	/** 
	* @Title: updateSendMail 
	* @Description: 修改邮件信息
	* @param @param record
	* @param @return 
	* @return int 
	* @throws 
	*/
	String updateSendMail(Sendmail record);
	
	/** 
	* @Title: countByExample 
	* @Description: 计算数据库总共有多少条数据
	* @param @return 
	* @return int 
	* @throws 
	*/
	int countByExample();
	
	/** 
	* @Title: findByPaging 
	* @Description: 分页查询
	* @param @param pagingVO
	* @param @return 
	* @return List<Sendmail> 
	* @throws 
	*/
	List<Sendmail> findByPaging(PagingVO pagingVO);
	
	
	/*
	 * hisEmail收件人email
	 * subject主题（标题）
	 * content内容（文本）
	 */
	/** 
	* @Title: sendEmail 
	* @Description: 发送邮件
	* @param @param hisEmail
	* @param @param subject
	* @param @param content 
	* @return void 
	* @throws 
	*/
	void sendEmail(String hisEmail, String subject, String content);

}
