
package com.clps.mms.sm.service;

import java.util.List;

import com.clps.mms.sm.pojo.Role;

/**
 * 
		* @author: Sail.Zhang
		* @createTime: 2018年5月8日 上午10:35:15
 */
public interface IRoleService {
	/**
	 * 
	 * @param role
	 * @return
	 */
	public String addRole(Role role);
	/**
	 * 
	 * @param role
	 * @return
	 */
	public String updateRole(Role role);
	/**
	 * 
	 * @param roleId
	 * @return
	 */
	public String deleteRole(int roleId);
	/**
	 * 
	 * @param roleId
	 * @return
	 */
	public Role queryRoleById(int roleId);
	/**
	 * 
	 * @return
	 */
	public List<Role> showRole();
}