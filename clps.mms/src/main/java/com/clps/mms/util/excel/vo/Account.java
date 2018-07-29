
package com.clps.mms.util.excel.vo;


/**
 * 
* @ClassName: PoiExportTest  
* @Description: Account 
* @author Clement.chen  
* @date 2018年5月21日 下午3:18:23  
*
 */

public class Account {


	private String accountId;				//账户编号

	private String accountName;				//账户姓名

	private String accountRealName;			//账户

	private String accountPosition;		    //用户职位

	private String accountDepartment;		//用户部门

	private String accountRole;			   //用户角色

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountRealName() {
		return accountRealName;
	}

	public void setAccountRealName(String accountRealName) {
		this.accountRealName = accountRealName;
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

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", accountRealName="
				+ accountRealName + ", accountPosition=" + accountPosition + ", accountDepartment=" + accountDepartment
				+ ", accountRole=" + accountRole + "]";
	}

	

	
}
