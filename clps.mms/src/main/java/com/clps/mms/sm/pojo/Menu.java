package com.clps.mms.sm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
* @desc: clps.mms
* @author: victor.gu
* @createTime: 2018年5月14日 下午2:01:03
* @version: v1.0
*/
	
public class Menu implements Serializable {

	private static final long serialVersionUID = -2071460034066737916L;

	private Integer menuId;//菜单id

	private String menuName;//菜单名称

	private Integer menuParent;//父级菜单

	private String menuUrl;//菜单链接

	private Date menuCreatedDate;//菜单创建日期

	private String menuCreatedBy;//创建人

	private Boolean isVisable;//是否显示

	private String menuComment;//菜单注释

	private Date menuUpdatedDate;//菜单修改日期

	private String menuUpdatedBy;//修改人

	private String menuTarget;//菜单目标

	private String menuDefault1;//默认字段1

	private String menuDefault2;//默认字段2

	public Menu() {

		super();

	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Integer getMenuParent() {
		return menuParent;
	}

	public void setMenuParent(Integer menuParent) {
		this.menuParent = menuParent;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public Date getMenuCreatedDate() {
		return menuCreatedDate;
	}

	public void setMenuCreatedDate(Date menuCreatedDate) {
		this.menuCreatedDate = menuCreatedDate;
	}

	public String getMenuCreatedBy() {
		return menuCreatedBy;
	}

	public void setMenuCreatedBy(String menuCreatedBy) {
		this.menuCreatedBy = menuCreatedBy;
	}

	public Boolean getIsVisable() {
		return isVisable;
	}

	public void setIsVisable(Boolean isVisable) {
		this.isVisable = isVisable;
	}

	public String getMenuComment() {
		return menuComment;
	}

	public void setMenuComment(String menuComment) {
		this.menuComment = menuComment;
	}

	public Date getMenuUpdatedDate() {
		return menuUpdatedDate;
	}

	public void setMenuUpdatedDate(Date menuUpdatedDate) {
		this.menuUpdatedDate = menuUpdatedDate;
	}

	public String getMenuUpdatedBy() {
		return menuUpdatedBy;
	}

	public void setMenuUpdatedBy(String menuUpdatedBy) {
		this.menuUpdatedBy = menuUpdatedBy;
	}

	public String getMenuTarget() {
		return menuTarget;
	}

	public void setMenuTarget(String menuTarget) {
		this.menuTarget = menuTarget;
	}

	public String getMenuDefault1() {
		return menuDefault1;
	}

	public void setMenuDefault1(String menuDefault1) {
		this.menuDefault1 = menuDefault1;
	}

	public String getMenuDefault2() {
		return menuDefault2;
	}

	public void setMenuDefault2(String menuDefault2) {
		this.menuDefault2 = menuDefault2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", menuParent=" + menuParent + ", menuUrl="
				+ menuUrl + ", menuCreatedDate=" + menuCreatedDate + ", menuCreatedBy=" + menuCreatedBy + ", isVisable="
				+ isVisable + ", menuComment=" + menuComment + ", menuUpdatedDate=" + menuUpdatedDate
				+ ", menuUpdatedBy=" + menuUpdatedBy + ", menuTarget=" + menuTarget + ", menuDefault1=" + menuDefault1
				+ ", menuDefault2=" + menuDefault2 + "]";
	}
}
