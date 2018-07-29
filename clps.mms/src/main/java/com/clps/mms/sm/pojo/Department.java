package com.clps.mms.sm.pojo;

import java.util.Date;

/** 
 * <p>Title: Department.java</p>  
 * <p>Description:clps.mms </p>  
 * @author kartoffeln.fu
 * 2018年5月14日 & 上午9:36:51
 */
public class Department {
    private Integer departmentId;//部门ID

    private String departmentName;//部门名称

	private String departmentAddress;//部门地址

    private String departmentTelephone;//部门电话

    private Integer departmentRole;//部门主管

    private String departmentIntroduction;//部门介绍

    private Integer departmentSuperior;//上级部门ID

    private Integer departmentCreatedid;//创建人Id

    private Date departmentCreatedtime;//创建时间

    private Integer departmentUpdatedid;//更新人Id

    private Date departmentUpdatedtime;//更新时间

    private Integer departmentIsvisible;//是否有效

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentTelephone() {
        return departmentTelephone;
    }

    public void setDepartmentTelephone(String departmentTelephone) {
        this.departmentTelephone = departmentTelephone;
    }

    public Integer getDepartmentRole() {
        return departmentRole;
    }

    public void setDepartmentRole(Integer departmentRole) {
        this.departmentRole = departmentRole;
    }

    public String getDepartmentIntroduction() {
        return departmentIntroduction;
    }

    public void setDepartmentIntroduction(String departmentIntroduction) {
        this.departmentIntroduction = departmentIntroduction;
    }

    public Integer getDepartmentSuperior() {
        return departmentSuperior;
    }

    public void setDepartmentSuperior(Integer departmentSuperior) {
        this.departmentSuperior = departmentSuperior;
    }

    public Integer getDepartmentCreatedid() {
        return departmentCreatedid;
    }

    public void setDepartmentCreatedid(Integer departmentCreatedid) {
        this.departmentCreatedid = departmentCreatedid;
    }

    public Date getDepartmentCreatedtime() {
        return departmentCreatedtime;
    }

    public void setDepartmentCreatedtime(Date departmentCreatedtime) {
        this.departmentCreatedtime = departmentCreatedtime;
    }

    public Integer getDepartmentUpdatedid() {
        return departmentUpdatedid;
    }

    public void setDepartmentUpdatedid(Integer departmentUpdatedid) {
        this.departmentUpdatedid = departmentUpdatedid;
    }

    public Date getDepartmentUpdatedtime() {
        return departmentUpdatedtime;
    }

    public void setDepartmentUpdatedtime(Date departmentUpdatedtime) {
        this.departmentUpdatedtime = departmentUpdatedtime;
    }

    public Integer getDepartmentIsvisible() {
        return departmentIsvisible;
    }

    public void setDepartmentIsvisible(Integer departmentIsvisible) {
        this.departmentIsvisible = departmentIsvisible;
    }
    
    
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentTelephone=" + departmentTelephone
				+ ", departmentRole=" + departmentRole + ", departmentIntroduction=" + departmentIntroduction
				+ ", departmentSuperior=" + departmentSuperior + ", departmentCreatedid=" + departmentCreatedid
				+ ", departmentCreatedtime=" + departmentCreatedtime + ", departmentUpdatedid=" + departmentUpdatedid
				+ ", departmentUpdatedtime=" + departmentUpdatedtime + ", departmentIsvisible=" + departmentIsvisible
				+ "]";
	}
}