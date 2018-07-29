
package com.clps.mms.util.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clps.mms.util.dao.ExcelUtilDao;
import com.clps.mms.util.dao.impl.ExcelUtilDaoImpl;

import com.clps.mms.util.pojo.UserTestModule;



/**
 * 
* @ClassName: ImportTest  
* @Description: 导入测试类  
* @author Clement.chen  
* @date 2018年5月11日 上午10:28:43  
*
 */
public class ImportTest {
	
	private Logger logger = Logger.getLogger(ImportTest.class);

	/**  
	 * @Title: setUp  
	 * @Description: 导入测试类方法  
	 * @param @throws java.lang.Exception    设定文件  
	 * @return void    返回类型  
	 * @throws  
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**  
	 * @Title: tearDown  
	 * @Description: 抛出异常  
	 * @param @throws java.lang.Exception    设定文件  
	 * @return void    返回类型  
	 * @throws  
	 */
	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void test() {
		//fail("Not yet implemented");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("src\\main\\webapp\\doc\\excelfile\\user.xlsx"));
			ExcelUtilDao util = new ExcelUtilDaoImpl<UserTestModule>(
					UserTestModule.class);// 创建excel工具类
			List<UserTestModule> list = util.importFromExcel("学生信息0", fis);// 导入
			logger.info(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
