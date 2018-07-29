
package com.clps.mms.sm.service.impl;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.clps.mms.sm.pojo.Permission;
import com.clps.mms.sm.service.IPermissionService;
import com.clps.mms.util.controller.SpringTestBase;
import com.clps.mms.util.paging.PagingVO;

public class PermissionServiceImplTest extends SpringTestBase {
	
	@Autowired
	private IPermissionService ipers;
	
	private Permission permission = null;
	
	private Logger logger = Logger.getLogger(PermissionServiceImplTest.class);
	/** 
	* @Title: setUp 
	* @Description: 
	* @param @throws java.lang.Exception 
	* @return void 
	* @throws 
	*/
	@Before
	public void setUp() throws Exception {
		
		this.permission =new Permission();
		permission.setPermissionName("111");
		permission.setPermissionComment("1");
		permission.setPermissionCreatedName("1");

	}

	/** 
	* @Title: tearDown 
	* @Description: 
	* @param @throws java.lang.Exception 
	* @return void 
	* @throws 
	*/
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.PermissionServiceImpl#queryAllPermission()}.
	 */
	@Test
	public void testQueryAllPermission() {
		Iterator<Permission> its = ipers.queryAllPermission().iterator();
		while(its.hasNext()){
			logger.info(its.next());
		}
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.PermissionServiceImpl#insertPermission(com.clps.mms.sm.pojo.Permission)}.
	 */
	@Test
	public void testInsertPermission() {
		ipers.insertPermission(permission);
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.PermissionServiceImpl#deleteByPermissionId(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteByPermissionId() {
		ipers.deleteByPermissionId(3);
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.PermissionServiceImpl#updatePermission(com.clps.mms.sm.pojo.Permission)}.
	 */
	@Test
	public void testUpdatePermission() {
		permission.setPermissionId(3);
		ipers.updatePermission(permission);
	}
	@Test
	public void getCountPostion() {							//查询当前所有有效职位条数
		int count=this.ipers.getCountPermission();

			logger.info(count);

	}
	@Test
	public void getPermissionPaging() throws Exception {						//分页查询有效职位信息
		PagingVO vo=new PagingVO();
		vo.setToPageNo(1);
	
		Iterator<Permission> permissions=this.ipers.findByPaging(vo).iterator();
		if(permissions!=null){

			while(permissions.hasNext()){
				logger.info(permissions.next());
				}
		}
	}
}
