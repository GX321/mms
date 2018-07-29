package com.clps.mms.sm.dao;

import java.util.List;

import com.clps.mms.sm.pojo.Department;
import com.clps.mms.util.paging.PagingVO;
/** 
 * <p>Title: DepartmentMapper.java</p>  
 * <p>Description:clps.mms </p>  
 * @author kartoffeln.fu
 * 2018年5月14日 & 上午9:36:19
 */
public interface DepartmentMapper {
	

   

    /**
     * 插入部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
    int insertDepartment(Department record);

    /**
     * 根据id查找部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
    Department queryById(Integer departmentId);
    
    /**
     * 查找哦所有部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
    List<Department> queryDepartment(); 
    
    /**
     * 分页查找所有部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
    
    
    List<Department> queryByPaging(PagingVO pagingVO); 
    /**
     *逻辑 删除部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
    int deleteDepartment(Integer departmentId);
    /**
     * 更新部门信息
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
    int updateDepartment(Department record);
    
    
    
      /**
     * 部门信息条数
		* @author: kartoffeln.fu
		* @createTime: 2018年5月8日 下午2:25:50
		* @history:
		* @return List<Account> 账户列表
		*/
    int getCountDepartment();
  
}