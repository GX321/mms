/**
 * 
 */
package com.clps.mms.sm.service;

import java.util.List;

import com.clps.mms.sm.pojo.Department;
import com.clps.mms.util.paging.PagingVO;

/**
 * @author kartofeln.fu
 *
 * 2018年5月7日 & 下午2:17:37
 */
public interface IDepartmentService {
	  /**
     * 通过Id查找部门
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
	public Department queryById(int userId); 
	   /**
     * 查找所有部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
	public List<Department> queryAllDepartment(); 
	
	   /**
     * 分页查找所有部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
	public List<Department> queryByPaging(PagingVO pagingVO); 
	  /**
     * 删除所有部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
	public String deleteDepartment(Integer departmentId);
	/**
     * 更新部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
	public String updateDepartment(Department record);
	/**
     * 增加所有部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
	public String insertDepartment(Department record);
	
	
	/**
     * 所有部门信息条数
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
	public int countByDepartment();
}
