package com.clps.mms.sm.vo;

import java.sql.Timestamp;

public class AccountVo {
 	private Integer accountId;
 	
 	private String accountName;
 	
 	private String account;
 	
 	private String accountPass;
 	
 	private String accountMail;
 	
 	private String accountPosition;
 	
 	private String accountDepartment;
 	
 	private String accountRole;
 	
 	private String accountCompany;
 	
 	private String accountPhone;
 	
 	private String accountTelephone;
 	
 	private String accountComment;

 	private  Timestamp accountCreatedDatetime;
	
	private String accountCreatedName;
	
	private Timestamp accountUpdatedDatetime;
	
	private String accountUpdatedName;

	public AccountVo() {
		super(); 
			
	}
	
	
	public AccountVo(Integer accountId, String accountName, String account, String accountPass, String accountMail,
			String accountPosition, String accountDepartment, String accountRole, String accountCompany,
			String accountPhone, String accountTelephone, String accountComment, Timestamp accountCreatedDatetime,
			String accountCreatedName, Timestamp accountUpdatedDatetime, String accountUpdatedName) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.account = account;
		this.accountPass = accountPass;
		this.accountMail = accountMail;
		this.accountPosition = accountPosition;
		this.accountDepartment = accountDepartment;
		this.accountRole = accountRole;
		this.accountCompany = accountCompany;
		this.accountPhone = accountPhone;
		this.accountTelephone = accountTelephone;
		this.accountComment = accountComment;
		this.accountCreatedDatetime = accountCreatedDatetime;
		this.accountCreatedName = accountCreatedName;
		this.accountUpdatedDatetime = accountUpdatedDatetime;
		this.accountUpdatedName = accountUpdatedName;
	}

	public Integer getAccountId() {
		return accountId;
	}


	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getAccountPass() {
		return accountPass;
	}


	public void setAccountPass(String accountPass) {
		this.accountPass = accountPass;
	}


	public String getAccountMail() {
		return accountMail;
	}


	public void setAccountMail(String accountMail) {
		this.accountMail = accountMail;
	}


	public String getAccountPosition() {
		return accountPosition;
	}


	public void setAccountPosition(String accountPosition) {
		this.accountPosition = accountPosition;
	}


	public String getAccountDepartment() {
		return accountDepartment;
	}


	public void setAccountDepartment(String accountDepartment) {
		this.accountDepartment = accountDepartment;
	}


	public String getAccountRole() {
		return accountRole;
	}


	public void setAccountRole(String accountRole) {
		this.accountRole = accountRole;
	}


	public String getAccountCompany() {
		return accountCompany;
	}


	public void setAccountCompany(String accountCompany) {
		this.accountCompany = accountCompany;
	}


	public String getAccountPhone() {
		return accountPhone;
	}


	public void setAccountPhone(String accountPhone) {
		this.accountPhone = accountPhone;
	}


	public String getAccountTelephone() {
		return accountTelephone;
	}


	public void setAccountTelephone(String accountTelephone) {
		this.accountTelephone = accountTelephone;
	}


	public String getAccountComment() {
		return accountComment;
	}


	public void setAccountComment(String accountComment) {
		this.accountComment = accountComment;
	}


	public Timestamp getAccountCreatedDatetime() {
		return accountCreatedDatetime;
	}


	public void setAccountCreatedDatetime(Timestamp accountCreatedDatetime) {
		this.accountCreatedDatetime = accountCreatedDatetime;
	}


	public String getAccountCreatedName() {
		return accountCreatedName;
	}


	public void setAccountCreatedName(String accountCreatedName) {
		this.accountCreatedName = accountCreatedName;
	}


	public Timestamp getAccountUpdatedDatetime() {
		return accountUpdatedDatetime;
	}


	public void setAccountUpdatedDatetime(Timestamp accountUpdatedDatetime) {
		this.accountUpdatedDatetime = accountUpdatedDatetime;
	}


	public String getAccountUpdatedName() {
		return accountUpdatedName;
	}


	public void setAccountUpdatedName(String accountUpdatedName) {
		this.accountUpdatedName = accountUpdatedName;
	}


	@Override
	public String toString() {
		return "AccountVo [accountId=" + accountId + ", accountName=" + accountName + ", account=" + account
				+ ", accountPass=" + accountPass + ", accountMail=" + accountMail + ", accountPosition="
				+ accountPosition + ", accountDepartment=" + accountDepartment + ", accountRole=" + accountRole
				+ ", accountCompany=" + accountCompany + ", accountPhone=" + accountPhone + ", accountTelephone="
				+ accountTelephone + ", accountComment=" + accountComment + ", accountCreatedDatetime="
				+ accountCreatedDatetime + ", accountCreatedName=" + accountCreatedName + ", accountUpdatedDatetime="
				+ accountUpdatedDatetime + ", accountUpdatedName=" + accountUpdatedName + "]";
	}
	
 	

 }

 	
	