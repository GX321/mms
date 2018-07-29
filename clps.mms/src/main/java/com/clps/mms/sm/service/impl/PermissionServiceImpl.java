/**   
* @Title: IPermission.java 
* @Package com.clps.mms.sm.service.impl 
* @Description: 
* @author gzf   
* @date 2018年5月7日 上午9:29:14 
* @version V1.0   
*/
package com.clps.mms.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clps.mms.common.SupportConstant;
import com.clps.mms.sm.dao.PermissionMapper;
import com.clps.mms.sm.pojo.Permission;
import com.clps.mms.sm.service.IPermissionService;
import com.clps.mms.util.paging.PagingVO;


@Service("permissionService")
public class PermissionServiceImpl implements IPermissionService{
	
	@Autowired
    private PermissionMapper permissionMapper;
	/* 
	*  
	*  
	* @return 
	* @see com.clps.mms.sm.service.IPermission#queryAllPermission() 
	*/

	public List<Permission> queryAllPermission() {
		
		return permissionMapper.queryAllPermission();
	
	}
	/* 
	*  
	*  
	* @param record
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#insertPermission(com.clps.mms.sm.pojo.Permission) 
	*/

	public String insertPermission(Permission record) {
		
		if(permissionMapper.insertPermission(record)>0){
			return SupportConstant.ADD_SUCCESS;
		}
		return SupportConstant.ADD_FAILURE;
	}
	/* 
	*  
	*  
	* @param permissionId
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#deleteByPermissionId(java.lang.Integer) 
	*/

	public String deleteByPermissionId(Integer permissionId) {
		if(permissionMapper.deleteByPermissionId(permissionId)>0){
			return SupportConstant.DELETE_SUCESS;
		}
		return SupportConstant.DELETE_FAILURE;
	}
	/* 
	*  
	*  
	* @param record
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#updatePermission(com.clps.mms.sm.pojo.Permission) 
	*/

	public String updatePermission(Permission record) {
		
		if(permissionMapper.updatePermission(record)>0){
			return SupportConstant.UPDATE_SUCESS;
		}
		return SupportConstant.UPDATE_FAILURE;
	}
	/* 
	*  
	*  
	* @param permissionId
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#queryPermissionByPermissionId(java.lang.Integer) 
	*/

	public Permission queryPermissionByPermissionId(Integer permissionId) {
		return permissionMapper.queryPermissionByPermissionId(permissionId);
	
	}
	/* 
	*  
	*  
	* @param permissionRecipient
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#queryPermissionByName(java.lang.String) 
	*/

	public List<Permission> queryPermissionByName(String permissionName) {
		
		return permissionMapper.queryPermissionByName(permissionName);
	}

	
	public int getCountPermission() {
		int count = this.permissionMapper.getCountPermission();
		return count;
	}


	public List<Permission> findByPaging(PagingVO pagingVO) throws Exception {
      List<Permission> permissions = this.permissionMapper.findByPaging(pagingVO);
		return permissions;
	}

}
