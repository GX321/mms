/**  
* <p>Title: DepartmentServiceImplTest.java</p>  
* <p>Description:clps.mms </p>  
* @author kartoffeln
* @date 2018年5月15日  
* @version 1.0  
*/
package com.clps.mms.sm.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clps.mms.sm.pojo.Department;
import com.clps.mms.sm.service.impl.DepartmentServiceImpl;
import com.clps.mms.util.paging.PagingVO;

/**
 * <p>
 * Title: DepartmentMapperTest.java
 * </p>
 * <p>
 * Description:clps.mms
 * </p>
 * 
 * @author kartoffeln.fu 2018年5月14日 & 下午4:38:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class DepartmentServiceImplTest {
	@Resource
	private DepartmentServiceImpl departmentService = null;
	private ApplicationContext ac = null;
	private Department user = new Department();
	private Logger logger = Logger.getLogger(Logger.class);

	@Test
	public void testfindAll() { // 查找所有部门信息
		PagingVO pagingVO=new PagingVO();
		 List<Department> list = departmentService.queryByPaging(pagingVO);
		int i=departmentService.countByDepartment();
		// logger.info("部门名称："+list.getDepartmentName());
		System.out.println(i);
	}

}
