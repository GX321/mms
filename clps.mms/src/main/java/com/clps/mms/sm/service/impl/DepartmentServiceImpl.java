/**
 * 
 */
package com.clps.mms.sm.service.impl;

import com.clps.mms.sm.service.IDepartmentService;
import com.clps.mms.util.paging.PagingVO;
import com.clps.mms.common.SupportConstant;
import com.clps.mms.sm.dao.DepartmentMapper;
import com.clps.mms.sm.pojo.Department;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Title: DepartmentServiceImpl.java
 * </p>
 * <p>
 * Description:clps.mms
 * </p>
 * 
 * @author kartoffeln.fu 2018年5月14日 & 上午9:44:38
 */
@Service("DepartmentService")
public class DepartmentServiceImpl implements IDepartmentService {
	@Autowired
	private DepartmentMapper department;
	private PagingVO pagingVO ;

	public Department queryById(int departmentId) {
		return this.department.queryById(departmentId);
	}

	/*
	 * (查询所有信息)
	 * 
	 * @see com.clps.mms.sm.service.impl.departmentservice#findAll()
	 */
	public List<Department> queryAllDepartment() {
		return this.department.queryDepartment();
	}

	/*
	 * (删除部门信息)
	 * 
	 * @see
	 * com.clps.mms.sm.service.impl.departmentservice#deleteDepartment(java.lang.
	 * Integer)
	 */
	public String deleteDepartment(Integer departmentId) {
		if (departmentId != null) {
			this.department.deleteDepartment(departmentId);
			return SupportConstant.DELETE_SUCESS;
		} else
			return SupportConstant.DELETE_FAILURE;
	}

	/*
	 * (更新部门信息)
	 * 
	 * @see
	 * com.clps.mms.sm.service.impl.departmentservice#updateByPrimaryKeySelective(
	 * com.clps.mms.sm.pojo.department)
	 */
	public String updateDepartment(Department record) {
		if (record != null) {
			this.department.updateDepartment(record);
			return SupportConstant.UPDATE_SUCESS;
		} else
			return SupportConstant.UPDATE_FAILURE;

	}

	/*
	 * (插入部门信息)
	 * 
	 * @see
	 * com.clps.mms.sm.service.impl.departmentservice#insertSelective(com.clps.mms.
	 * sm.pojo.department)
	 */
	public String insertDepartment(Department record) {
		if (record != null) {
			this.department.insertDepartment(record);
			return SupportConstant.ADD_SUCCESS;
		} else {
			return SupportConstant.ADD_FAILURE;
		}
	}

	/* (non-Javadoc)
	 * @see com.clps.mms.sm.service.IDepartmentService#findByPaging()
	 */
	@Override
	public List<Department> queryByPaging(PagingVO pagingVO) {
		return this.department.queryByPaging(pagingVO);
	}

	/* (non-Javadoc)
	 * @see com.clps.mms.sm.service.IDepartmentService#countByDepartment()
	 */
	@Override
	public int countByDepartment() {
		int count=this.department.getCountDepartment();
		if(count>0){
			
			return count;
		}
		else{
		
			return 0;
		}
	}

}
