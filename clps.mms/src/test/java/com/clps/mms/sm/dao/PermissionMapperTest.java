package com.clps.mms.sm.dao;



import java.util.Iterator;
import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clps.mms.sm.pojo.Permission;

import com.clps.mms.util.controller.MyBatisUtil;



/**
 * 
	* @desc: clps.mms
	* @author: Harley.gu
	* @createTime: 2018年5月14日 上午10:41:28 
	* @version: v1.0
 */
public class PermissionMapperTest {

	private SqlSessionFactory sf = null;
	private SqlSession session = null;
	private PermissionMapper permissionDao = null;
	private List<Permission> permissions = null;
	private Logger logger = Logger.getLogger(PermissionMapperTest.class);
	
	@Before
	public void setUp() throws Exception {
		this.sf = MyBatisUtil.getSqlSessionFactory();
		this.session = sf.openSession();
		this.permissionDao = session.getMapper(PermissionMapper.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testQueryAllPermission() {
		try {
			this.permissions = this.permissionDao.queryAllPermission();
			logger.info("查询成功");
			Iterator<Permission> its = permissions.iterator();
			while(its.hasNext()){
				System.out.println(its.next());
			}
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("查询失败");
			session.rollback();
		}finally{
			if(session !=null){
				session.close();
			}
		}
	}

	@Test
	public void testInsertPermission() {
		Permission permission = new Permission();
		permission.setPermissionId(20);
		permission.setPermissionName("select");
		permission.setPermissionComment("12");
		permission.setPermissionCreatedName("11");
		permission.setPermissionUpdatedName("1");
		logger.info("插入开始");
		try {
			int i = this.permissionDao.insertPermission(permission);
			System.out.println(i+"       ");
			if (i > 0) {
				logger.info("插入成功");
				session.commit();
			}
		} catch (Exception e) {
			logger.error("插入失败");
			e.printStackTrace();
			session.rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	
	@Test
	public void testDeleteByPermissionId() {
			try {
				int i = this.permissionDao.deleteByPermissionId(2);
				if (i > 0) {
					logger.info("逻辑删除成功");
					session.commit();
				}
			} catch (Exception e) {
				logger.info("插入成功");
				e.printStackTrace();
				session.rollback();
			} finally {
				if (session != null) {
					session.close();
				}
			}
	}
	
	
}
