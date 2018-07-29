
package com.clps.mms.util.excel.vo;

/**
 * 
* @ClassName: PoiExportTest  
* @Description: Department  
* @author Clement.chen  
* @date 2018年5月21日 下午3:18:23  
*
 */
public class Department {

	private String depaNumber;					//部门编号

	private String depaName;					//部门名称

	private String depaFatherNumber;			//父编号

	private String depaChildNumber;				//子编号

	private String depaLevel;					//等级

	private String depaEmail;					//部门邮箱

	private String depaComment;					//部门描述

	/**
	 * @return the depaNumber
	 */
	public String getDepaNumber() {
		return depaNumber;
	}

	/**
	 * @param depaNumber
	 *            the depaNumber to set
	 */
	public void setDepaNumber(String depaNumber) {
		this.depaNumber = depaNumber;
	}

	/**
	 * @return the depaName
	 */
	public String getDepaName() {
		return depaName;
	}

	/**
	 * @param depaName
	 *            the depaName to set
	 */
	public void setDepaName(String depaName) {
		this.depaName = depaName;
	}

	/**
	 * @return the depaFatherNumber
	 */
	public String getDepaFatherNumber() {
		return depaFatherNumber;
	}

	/**
	 * @param depaFatherNumber
	 *            the depaFatherNumber to set
	 */
	public void setDepaFatherNumber(String depaFatherNumber) {
		this.depaFatherNumber = depaFatherNumber;
	}

	/**
	 * @return the depaChildNumber
	 */
	public String getDepaChildNumber() {
		return depaChildNumber;
	}

	/**
	 * @param depaChildNumber
	 *            the depaChildNumber to set
	 */
	public void setDepaChildNumber(String depaChildNumber) {
		this.depaChildNumber = depaChildNumber;
	}

	/**
	 * @return the depaLevel
	 */
	public String getDepaLevel() {
		return depaLevel;
	}

	/**
	 * @param depaLevel
	 *            the depaLevel to set
	 */
	public void setDepaLevel(String depaLevel) {
		this.depaLevel = depaLevel;
	}

	/**
	 * @return the depaEmail
	 */
	public String getDepaEmail() {
		return depaEmail;
	}

	/**
	 * @param depaEmail
	 *            the depaEmail to set
	 */
	public void setDepaEmail(String depaEmail) {
		this.depaEmail = depaEmail;
	}

	/**
	 * @return the depaComment
	 */
	public String getDepaComment() {
		return depaComment;
	}

	/**
	 * @param depaComment
	 *            the depaComment to set
	 */
	public void setDepaComment(String depaComment) {
		this.depaComment = depaComment;
	}

	/*
	 * (non-Javadoc) <p>Title: toString</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [depaNumber=" + depaNumber + ", depaName=" + depaName + ", depaFatherNumber="
				+ depaFatherNumber + ", depaChildNumber=" + depaChildNumber + ", depaLevel=" + depaLevel
				+ ", depaEmail=" + depaEmail + ", depaComment=" + depaComment + "]";
	}

}
