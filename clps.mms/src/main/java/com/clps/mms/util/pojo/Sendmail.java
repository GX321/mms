/**   
* @Title: ISendMail.java 
* @Package com.clps.mms.util.pojo
* @Description: sendmail 实体层
* @author martin.dai   
* @date 2018年5月7日 上午9:28:39 
* @version V1.0   
*/
package com.clps.mms.util.pojo;

import java.io.Serializable;
import java.util.Date;



/** 
* @ClassName: Sendmail 
* @Description: 发件箱邮件实体对象
* @author martin.dai
* @date 2018年5月14日 上午9:46:41 
*  
*/
public class Sendmail implements Serializable{
	/** 
	* @Fields serialVersionUID : 串行化参数
	*/ 
	private static final long serialVersionUID = 3043202227193624370L;

	private Integer emailId;  			//邮件id

    private String emailSubject;		//邮件主题

    private String emailRecipient;		//邮件收件人

    private String emailAddresser;	//邮件收件人id

    private Date emailSendtime;			//邮件发送时间

    private Boolean emailStatus;		//邮件发送状态

    private String emailDefault1;		//默认字段1

    private String emailDefault2;		//默认字段2

    private Boolean emailIsVisable;		//有效标志

    private String emailLetter;			//邮件内容

	/**
	 * 无参构造方法
	 */
	public Sendmail() {
		super();
	}

	/**
	 * @return the emailId
	 */
	public final Integer getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public final void setEmailId(Integer emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the emailSubject
	 */
	public final String getEmailSubject() {
		return emailSubject;
	}

	/**
	 * @param emailSubject the emailSubject to set
	 */
	public final void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	/**
	 * @return the emailRecipient
	 */
	public final String getEmailRecipient() {
		return emailRecipient;
	}

	/**
	 * @param emailRecipient the emailRecipient to set
	 */
	public final void setEmailRecipient(String emailRecipient) {
		this.emailRecipient = emailRecipient;
	}


	/**
	 * @return the emailAddresser
	 */
	public final String getEmailAddresser() {
		return emailAddresser;
	}

	/**
	 * @param emailAddresser the emailAddresser to set
	 */
	public final void setEmailAddresser(String emailAddresser) {
		this.emailAddresser = emailAddresser;
	}

	/**
	 * @return the emailSendtime
	 */
	public final Date getEmailSendtime() {
		return emailSendtime;
	}

	/**
	 * @param emailSendtime the emailSendtime to set
	 */
	public final void setEmailSendtime(Date emailSendtime) {
		this.emailSendtime = emailSendtime;
	}

	/**
	 * @return the emailStatus
	 */
	public final Boolean getEmailStatus() {
		return emailStatus;
	}

	/**
	 * @param emailStatus the emailStatus to set
	 */
	public final void setEmailStatus(Boolean emailStatus) {
		this.emailStatus = emailStatus;
	}

	/**
	 * @return the emailDefault1
	 */
	public final String getEmailDefault1() {
		return emailDefault1;
	}

	/**
	 * @param emailDefault1 the emailDefault1 to set
	 */
	public final void setEmailDefault1(String emailDefault1) {
		this.emailDefault1 = emailDefault1;
	}

	/**
	 * @return the emailDefault2
	 */
	public final String getEmailDefault2() {
		return emailDefault2;
	}

	/**
	 * @param emailDefault2 the emailDefault2 to set
	 */
	public final void setEmailDefault2(String emailDefault2) {
		this.emailDefault2 = emailDefault2;
	}

	/**
	 * @return the emailIsVisable
	 */
	public final Boolean getEmailIsVisable() {
		return emailIsVisable;
	}

	/**
	 * @param emailIsVisable the emailIsVisable to set
	 */
	public final void setEmailIsVisable(Boolean emailIsVisable) {
		this.emailIsVisable = emailIsVisable;
	}

	/**
	 * @return the emailLetter
	 */
	public final String getEmailLetter() {
		return emailLetter;
	}

	/**
	 * @param emailLetter the emailLetter to set
	 */
	public final void setEmailLetter(String emailLetter) {
		this.emailLetter = emailLetter;
	}

	/* 
	*  
	*  
	* @return 
	* @see java.lang.Object#toString() 
	*/
	@Override
	public String toString() {
		return "Sendmail [emailId=" + emailId + ", emailSubject=" + emailSubject + ", emailRecipient=" + emailRecipient
				+ ", emailAddresser=" + emailAddresser + ", emailSendtime=" + emailSendtime + ", emailStatus="
				+ emailStatus + ", emailDefault1=" + emailDefault1 + ", emailDefault2=" + emailDefault2
				+ ", emailIsVisable=" + emailIsVisable + ", emailLetter=" + emailLetter + "]";
	}

	

	
	
    
}