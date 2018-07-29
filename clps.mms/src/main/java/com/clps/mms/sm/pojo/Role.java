package com.clps.mms.sm.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer roleId;				//角色编号

	private String roleName;			//角色名称

	private String roleGroupId;			//角色组编号

	private String roleGroupName;		//角色组名称

	private Timestamp roleUpdateTime;	//角色维护时间

	private String roleMaker;			//角色维护人

	private String roleComment;			//角色描述

	private Integer isVisible;			//角色有效性

	public Role() {
		super();

	}

	/**
	 * getRoleId
	 * 
	 * @return getRoleId
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * 
	 * @param roleId
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * 
	 * @return
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * 
	 * @param roleName
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	/**
	 * 
	 * @return
	 */
	public String getRoleGroupId() {
		return roleGroupId;
	}
	/**
	 * 
	 * @param roleGroupId
	 */
	public void setRoleGroupId(String roleGroupId) {
		this.roleGroupId = roleGroupId;
	}
	/**
	 * 
	 * @return
	 */
	public String getRoleGroupName() {
		return roleGroupName;
	}
	/**
	 * 
	 * @param roleGroupName
	 */
	public void setRoleGroupName(String roleGroupName) {
		this.roleGroupName = roleGroupName;
	}
	/**
	 * 
	 * @return
	 */
	public Timestamp getRoleUpdateTime() {
		return roleUpdateTime;
	}
	/**
	 * 
	 * @param roleUpdateTime
	 */
	public void setRoleUpdateTime(Timestamp roleUpdateTime) {
		this.roleUpdateTime = roleUpdateTime;
	}
	/**
	 * 
	 * @return
	 */
	public String getRoleMaker() {
		return roleMaker;
	}
	/**
	 * 
	 * @param roleMaker
	 */
	public void setRoleMaker(String roleMaker) {
		this.roleMaker = roleMaker;
	}
	/**
	 * 
	 * @return
	 */
	public String getRoleComment() {
		return roleComment;
	}
	/**
	 * 
	 * @param roleComment
	 */
	public void setRoleComment(String roleComment) {
		this.roleComment = roleComment;
	}
	/**
	 * 
	 * @return
	 */
	public Integer getIsVisible() {
		return isVisible;
	}
	/**
	 * 
	 * @param isVisible
	 */
	public void setIsVisible(Integer isVisible) {
		this.isVisible = isVisible;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleGroupId=" + roleGroupId + ", roleGroupName="
				+ roleGroupName + ", roleUpdateTime=" + roleUpdateTime + ", roleMaker=" + roleMaker + ", roleComment="
				+ roleComment + "]";
	}

}