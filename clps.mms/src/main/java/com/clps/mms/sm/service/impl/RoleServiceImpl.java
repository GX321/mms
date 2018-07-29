
/*
* Copyright @ 2018 com.jit
* clps.mms 下午6:50:56
* All right reserved.
*
*/

package com.clps.mms.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clps.mms.common.SupportConstant;
import com.clps.mms.sm.dao.RoleMapper;
import com.clps.mms.sm.pojo.Role;
import com.clps.mms.sm.service.IRoleService;

/**
 * 
 * @author Sail.Zhang
 *
 */
@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private RoleMapper dao;

	@Override
	public String addRole(Role role) {
		if (role != null) {
			if (this.dao.addRole(role) > 0) {
				return SupportConstant.ADD_SUCCESS;
			} else
				return SupportConstant.ADD_FAILURE;
		}
		return SupportConstant.ADD_FAILURE;
	}

	@Override
	public String updateRole(Role role) {
		if (role != null) {
			if (this.dao.updateRole(role) > 0) {
				return SupportConstant.UPDATE_SUCESS;
			} else
				return SupportConstant.UPDATE_FAILURE;
		}
		return SupportConstant.UPDATE_FAILURE;
	}

	@Override
	public String deleteRole(int roleId) {
		if (this.dao.deleteRoleById(roleId) > 0) {
			return SupportConstant.DELETE_SUCESS;
		} else
			return SupportConstant.DELETE_FAILURE;
	}

	@Override
	public Role queryRoleById(int roleId) {
		Role role = null;
		if (this.dao.queryRoleById(roleId) != null) {
			role = this.dao.queryRoleById(roleId);
			return role;
		} else
			return null;
	}

	@Override
	public List<Role> showRole() {
		List<Role> roles = null;
		if (this.dao.queryAllRoles() != null) {
			roles = this.dao.queryAllRoles();
			return roles;
		} else
			return null;
	}

}
