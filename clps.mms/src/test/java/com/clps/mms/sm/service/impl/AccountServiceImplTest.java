package com.clps.mms.sm.service.impl;

import java.sql.Timestamp;
import java.util.List;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.clps.mms.sm.pojo.Account;
import com.clps.mms.sm.service.impl.AccountServiceImpl;

/**
 * 测试AccountServiceImpl类中的方法
 * 
 * @desc: clps.mms
 * @author: sea
 * @createTime: 2018年5月14日 上午11:34:22
 * @history:
 * @version: v1.0
 */
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountServiceImplTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	@Qualifier("service")
	private AccountServiceImpl service;
	private Logger logger = Logger.getLogger(Logger.class);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * @desc: 测试queryAllAccountInfo()方法
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 上午11:39:31
	 * @history: void
	 */
	@Test
	public void testQueryAllAccountInfo() {
		logger.info("query all account start...");
		List<Account> list = service.queryAllAccountInfo();
		logger.info("账户的数量为：" + list.size());
		logger.info("query all account end...");
	}

	/**
	 * 
	 * @desc:测试queryAccountInfo方法
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 上午11:42:43
	 * @history: void
	 */
	@Test
	public void testQueryAccountInfo() {
		List<Account> list = service.queryAccountInfoById("3");
		for (Account account : list)
			logger.info(account + "\n");

	}

	/**
	 * 
	 * @desc:测试saveAccountInfo方法
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午12:26:17
	 * @history: void
	 */
	@Test
	public void testSaveAccountInfo() {
		logger.info("save account start....");
		Account accountOne = new Account(322231, "张海权", "张苗苗m", "1", "111", 1, 1, 1, 1, "11", "111", "112",
				new Timestamp(System.currentTimeMillis()), 1, new Timestamp(System.currentTimeMillis()), 1, 1, "");
		if (service.saveAccountInfo(accountOne) > 0)
			logger.info("save account successfully!\n");
		else
			logger.info("save account failure!\n");
		logger.info("save account end....");

	}

	/**
	 * 
	 * @desc:测试editAccountInfo方法
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午12:27:29
	 * @history: void
	 */
	@Test
	public void testEditAccountInfo() {
		logger.info("edit account start....");
		Account accountOne = new Account(3221, "张海泉m", "张苗", "1", "111", 1, 1, 1, 1, "11", "111", "112",
				new Timestamp(System.currentTimeMillis()), 1, new Timestamp(System.currentTimeMillis()), 1, 1, "");

		if (service.editAccountInfo(accountOne) > 0)
			logger.info("edit account successfully!\n");
		else
			logger.info("edit account failure!\n");

		logger.info("edit account end...");
	}

	/**
	 * 
	 * @desc:测试deleteAccountInfo方法
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午12:28:16
	 * @history: void
	 */
	@Test
	public void testDeleteAccountInfo() {
		logger.info("delete account start....");

		if (service.deleteAccountInfoById("张苗苗") > 0)
			logger.info("delete account successfully!\n");
		else
			logger.info("delete account failure!\n");
		logger.info("delete account end....");
	}

	/**
	 * 
	 * @desc:测试queryAccountInfoByLike方法
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午12:28:42
	 * @history: void
	 */
	@Test
	public void testQueryAccountInfoByLike() {
		logger.info("query accountByLike start....");
		List<Account> list = service.queryAccountInfoByLike("2");
		for (Account account : list)

			logger.info(account + "\n");
		logger.info("query accountByLike end....");
	}

	/**
	 * 
	 * @desc:测试Accountdisplay方法
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午12:29:13
	 * @history: void
	 */
	@Test
	public void testAccountdisplay() {
		logger.info("account display start....");
		Account accountOne = new Account(2121, "1", "1", "1", "1", 1, 1, 1, 1, "1", "1", "1",
				new Timestamp(System.currentTimeMillis()), 1, new Timestamp(System.currentTimeMillis()), 1, 1, "");

		logger.info(service.accountDisplay(accountOne) + "\n");
		logger.info("account display end....");
	}
}
