package com.clps.mms.util.excel.service;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clps.mms.util.pojo.UserTestModule;
import com.clps.mms.util.service.ExcelUtilService;
import com.clps.mms.util.service.impl.ExcelUtilServiceImpl;



public class ExcelUtilServiceTest {
	
	private Logger logger = Logger.getLogger(ExcelUtilServiceTest.class);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testExportToExcel() {
		// 初始化数据
		List<UserTestModule> list = new ArrayList<UserTestModule>();

		UserTestModule user = new UserTestModule();
		user.setId(1);
		user.setName("zhangsan");
		user.setAge(26);

		user.setCompany("111");
		list.add(user);

		UserTestModule user2 = new UserTestModule();
		user2.setId(2);
		user2.setName("chen");
		user2.setAge(22);
		
		user2.setCompany("华钦");
		list.add(user2);

		FileOutputStream out = null;
		try {
			out = new FileOutputStream(new File("src\\main\\webapp\\doc\\excelfile\\user.xlsx"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		/*ExcelUtilDao util = new ExcelUtilDaoImpl<UserTestModule>(UserTestModule.class);// 创建工具类.
		util.exportToExcel(list, "用户信息", 65536, out);// 导出
*/		
		ExcelUtilService excelUtilService  = new ExcelUtilServiceImpl();
		logger.info(excelUtilService.exportToExcel(list, "用户信息", 65536, out));
		
		logger.info("----执行完毕----------");
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testImportFromExcel() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("src\\main\\webapp\\doc\\excelfile\\user.xlsx"));
			/*
			 * ExcelUtilDao util = new ExcelUtilDaoImpl<UserTestModule>(
			 * UserTestModule.class);// 创建excel工具类 List<UserTestModule> list =
			 * util.importFromExcel("用户信息", fis);// 导入
			 */
			ExcelUtilService excelUtilService = new ExcelUtilServiceImpl();// 创建excel工具类
			logger.info(excelUtilService.importFromExcel("用户信息", fis));//判断是否成功导入
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
