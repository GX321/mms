package com.clps.mms.sm.service.impl;

import static org.junit.Assert.*;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.clps.mms.sm.pojo.Menu;
import com.clps.mms.sm.service.IMenuService;

/**
 * @desc: clps.mms
 * @author: victor.gu
 * @createTime: 2018年5月9日 上午11:14:09
 * @version: v1.0
 */

public class MenuServiceImplTest {
	@Autowired
	private IMenuService ms;

	private Menu menu = null;
	private Logger logger = Logger.getLogger("MenuServiceImplTest.class");

	/**
	 * @Title: setUp @Description: 输入数据 @param @throws
	 * java.lang.Exception @return void @throws
	 */
	@Before
	public void setUp() throws Exception {

		this.menu = new Menu();
		menu.setMenuId(1);
		menu.setMenuComment("mmm");
		menu.setMenuName("root");
		menu.setMenuParent(1);
		menu.setMenuTarget("2");

	}

	/**
	 * @Title: tearDown @Description:抛出异常  @param @throws
	 * java.lang.Exception @return void @throws
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.service.impl.MenuServiceImpl#init()}.
	 */
	@Test
	public void testInit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.service.impl.MenuServiceImpl#insertMenu(com.clps.mms.sm.pojo.Menu)}.
	 */
	@Test
	public void testAddMenu() {
		ms.addMenu(menu);
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.service.impl.MenuServiceImpl#updateMenu(com.clps.mms.sm.pojo.Menu)}.
	 */
	@Test
	public void testUpdateMenu() {
		menu.setMenuId(1);
		ms.updateMenu(menu);
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.service.impl.MenuServiceImpl#queryAllMenus()}.
	 */
	@Test
	public void testQueryAllMenus() {
		Iterator<Menu> its = ms.queryAllMenus().iterator();
		while (its.hasNext()) {
			logger.info(its.next());
		}
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.service.impl.MenuServiceImpl#deleteMenuById(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteMenuById() {
		ms.deleteMenuById(1);
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.sm.service.impl.MenuServiceImpl#queryMenuById(java.lang.Integer)}.
	 */
	@Test
	public void testQueryMenuById() {
		ms.deleteMenuById(1);
	}

}
