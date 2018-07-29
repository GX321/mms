package com.clps.mms.sm.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * ]
	* @desc: clps.mms
	* @author: Harley.gu
	* @createTime: 2018年5月14日 上午9:46:21
	* @version: v1.0
 */
public class Permission implements Serializable{


   /**
	 * @Fields serialVersionUID : 串行化参数
	 */
	private static final long serialVersionUID = 8589087014163560356L;

		private Integer permissionId;//权限id
	
	    private String permissionName;//权限名称
	
	    private String permissionComment;//权限描述
	
	    private Date permissionCreatedDatetime;//创建时间
	
	    private String permissionCreatedName;//创建人姓名
	
	    private Date permissionUpdatedDatetime;//修改时间
	
	    private String permissionUpdatedName;//修改人姓名
	
	    private Integer permissionIsvisible;//
	
	    private String permissionDefault;//
		/**
		 * 无参构造方法
		 */
	    public Permission() {
			super();
		}

		public final Integer getPermissionId() {
	        return permissionId;
	    }
	
	    public final void setPermissionId(Integer permissionId) {
	        this.permissionId = permissionId;
	    }
	
	    public final String getPermissionName() {
	        return permissionName;
	    }
	
	    public final void setPermissionName(String permissionName) {
	        this.permissionName = permissionName;
	    }
	
	    public final String getPermissionComment() {
	        return permissionComment;
	    }
	
	    public final void setPermissionComment(String permissionComment) {
	        this.permissionComment = permissionComment;
	    }
	
	    public final Date getPermissionCreatedDatetime() {
	        return permissionCreatedDatetime;
	    }
	
	    public final void setPermissionCreatedDatetime(Date permissionCreatedDatetime) {
	        this.permissionCreatedDatetime = permissionCreatedDatetime;
	    }
	
	    public final String getPermissionCreatedName() {
	        return permissionCreatedName;
	    }
	
	    public final void setPermissionCreatedName(String permissionCreatedName) {
	        this.permissionCreatedName = permissionCreatedName;
	    }
	
	    public final Date getPermissionUpdatedDatetime() {
	        return permissionUpdatedDatetime;
	    }
	
	    public final void setPermissionUpdatedDatetime(Date permissionUpdatedDatetime) {
	        this.permissionUpdatedDatetime = permissionUpdatedDatetime;
	    }
	
	    public final String getPermissionUpdatedName() {
	        return permissionUpdatedName;
	    }
	
	    public final void setPermissionUpdatedName(String permissionUpdatedName) {
	        this.permissionUpdatedName = permissionUpdatedName;
	    }
	
	    public final Integer getPermissionIsvisible() {
	        return permissionIsvisible;
	    }
	
	    public final void setPermissionIsvisible(Integer permissionIsvisible) {
	        this.permissionIsvisible = permissionIsvisible;
	    }
	
	    public final String getPermissionDefault() {
	        return permissionDefault;
	    }
	
	    public final void setPermissionDefault(String permissionDefault) {
	        this.permissionDefault = permissionDefault;
	    }
	
		@Override
		public String toString() {
			return "Permission [permissionId=" + permissionId + ", permissionName=" + permissionName
					+ ", permissionComment=" + permissionComment + ", permissionCreatedDatetime="
					+ permissionCreatedDatetime + ", permissionCreatedName=" + permissionCreatedName
					+ ", permissionUpdatedDatetime=" + permissionUpdatedDatetime + ", permissionUpdatedName="
					+ permissionUpdatedName + ", permissionIsvisible=" + permissionIsvisible + ", permissionDefault="
					+ permissionDefault + "]";
		}
    
}