package com.clps.mms.sm.dao;

import java.util.List;

import com.clps.mms.sm.pojo.Role;



/**
 * 
 * @author Sail.Zhang
 *
 */
public interface RoleMapper {

	/**
	 * 
			* @author: Sail.Zhang
			* @createTime: 2018年5月7日 下午9:05:34
			* @param roleId
			* @return int
	 */
	int deleteRoleById(Integer roleId);

    /**
     * 
    		* @author: Sail.Zhang
    		* @createTime: 2018年5月7日 下午9:05:42
    		* @param record
    		* @return int
     */
    int addRole(Role record);
    /**
     * 
    		* @author: Sail.Zhang
    		* @createTime: 2018年5月7日 下午9:05:47
    		* @param roleId
    		* @return Role
     */
    Role queryRoleById(Integer roleId);
    /**
     * 
    		* @author: Sail.Zhang
    		* @createTime: 2018年5月7日 下午9:05:51
    		* @param record
    		* @return int
     */
    int updateRole(Role record);

    /**
     * 
    		* @author: Sail.Zhang
    		* @createTime: 2018年5月7日 下午9:06:03
    		* @return List<Role>
     */
    List<Role> queryAllRoles();
}