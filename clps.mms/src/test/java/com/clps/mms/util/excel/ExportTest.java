
package com.clps.mms.util.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
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
* @ClassName: ExportTest  
* @Description: 导出测试类  
* @author Clement.chen  
* @date 2018年5月11日 上午10:19:59  
*
 */
public class ExportTest {
	
	private Logger logger = Logger.getLogger(ExportTest.class);

	/**  
	 * @Title: setUp  
	 * @Description: 导出测试类方法  
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void test() {
		//fail("Not yet implemented");
		// 初始化数据
				List<UserTestModule> list = new ArrayList<UserTestModule>();

				UserTestModule vo = new UserTestModule();
				vo.setId(1);
				vo.setName("陈扣");
				vo.setAge(26);
			
				vo.setCompany("111");
				list.add(vo);

				UserTestModule vo2 = new UserTestModule();
				vo2.setId(2);
				vo2.setName("clement");
				vo.setAge(23);
				
				vo2.setCompany("华钦");
				list.add(vo2);


				FileOutputStream out = null;
				try {
					out = new FileOutputStream(new File("src\\main\\webapp\\doc\\excelfile\\user.xlsx"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				ExcelUtilDao util = new ExcelUtilDaoImpl<UserTestModule>(UserTestModule.class);// 创建工具类.
				util.exportToExcel(list, "学生信息", 65536, out);// 导出
				logger.info("----执行完毕----------");
			}

}
