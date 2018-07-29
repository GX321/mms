
/*
* Copyright @ 2018 com.jit
* clps.mms 上午11:11:03
* All right reserved.
*
*/

package com.clps.mms.sm.dao;

import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clps.mms.sm.pojo.Menu;
import com.clps.mms.util.controller.MyBatisUtil;

/**
 * @desc: clps.mms
 * @author: victor.gu
 * @createTime: 2018年5月9日 上午11:11:03
 * @version: v1.0
 */

public class MenuMapperTest {
	private SqlSessionFactory sf = null;
	private SqlSession session = null;
	private MenuMapper mapper = null;
	private Menu menu = null;
	private Logger logger = Logger.getLogger(MenuMapperTest.class);

	/**
	 * @Title: setUp @Description:输入数据  @param @throws
	 *         java.lang.Exception @return void @throws
	 */
	@Before
	public void setUp() throws Exception {

		this.sf = MyBatisUtil.getSqlSessionFactory();
		this.session = sf.openSession();
		this.mapper = session.getMapper(MenuMapper.class);
		this.menu = new Menu();
		menu.setMenuId(1);
		menu.setMenuComment("mmm");
		menu.setMenuName("root");
		menu.setMenuParent(1);
		menu.setMenuTarget("2");

	}

	/**
	 * @Title: tearDown @Description:抛出异常  @param @throws
	 *         java.lang.Exception @return void @throws
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.dao.MenuMapper#deleteMenuById(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteMenuById() {
		try {
			int i = mapper.deleteMenuById(3);
			if (i > 0) {
				logger.info("delete susses!");
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.dao.MenuMapper#insertMenu(com.clps.mms.sm.pojo.Menu)}.
	 */
	@Test
	public void testAddMenu() {
		try {
			int i = mapper.addMenu(menu);
			if (i > 0) {
				logger.info("add susses!");
			}
			session.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.dao.MenuMapper#queryMenuById(java.lang.Integer)}.
	 */
	@Test
	public void testQueryMenuById() {
		try {
			Menu menu = mapper.queryMenuById(1);
			System.out.println(menu);
			session.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		} finally {
			if (session != null)
				session.close();
		}

	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.dao.MenuMapper#updateMenu(com.clps.mms.sm.pojo.Menu)}.
	 */
	@Test
	public void testUpdateMenu() {
		try {
			menu.setMenuId(3);
			int i = mapper.updateMenu(menu);
			if (i > 0) {
				logger.info("update susses!");
			}
			session.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		} finally {
			if (session != null)
				session.close();
		}

	}

	/**
	 * Test method for {@link com.clps.mms.sm.dao.MenuMapper#queryAllMenus()}.
	 */
	@Test
	public void testQueryAllMenus() {
		try {
			List<Menu> listMenu = mapper.queryAllMenus();
			Iterator<Menu> its = listMenu.iterator();
			while (its.hasNext()) {
				logger.info(its.next());
			}
			session.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

}
