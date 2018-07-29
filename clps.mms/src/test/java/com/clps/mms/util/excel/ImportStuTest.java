/**    
* @Title: importstuTest.java  
* @Package com.clps.mms.util.excel  
* @Description: Stu测试类  
* @author Clement.chen   
* @date 2018年5月14日 下午12:25:30  
* @version V1.0    
*/
package com.clps.mms.util.excel;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clps.mms.util.excel.pojo.StudentBaseInfo;
import com.clps.mms.util.excel.pojo.StudentStatistics;




/**  
* @ClassName: importstuTest  
* @Description: stu测试类  
* @author Clement.chen  
* @date 2018年5月14日 下午12:25:30  
*    
*/
public class ImportStuTest {
	
	private Logger logger = Logger.getLogger(ImportStuTest.class);

	/**   ★
	* @Title: setUp  
	* @Description: stu测试类  
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

	@Test
	public void test() throws IOException,Exception {
		String fileName="sutdent.xlsx";
        InputStream in = new FileInputStream(new File("src\\main\\webapp\\doc\\excelfile\\student.xlsx"));
        Workbook wb = ImportExcelUtil.chooseWorkbook(fileName, in);
        StudentStatistics studentStatistics = new StudentStatistics();
        
        //读取一个对象的信息
        StudentStatistics readDateT =
            ImportExcelUtil.readDateT(wb, studentStatistics, in, new Integer[] {12, 5}, new Integer[] {13, 5});
        logger.info(readDateT);
        
        //读取对象列表的信息
        StudentBaseInfo studentBaseInfo = new StudentBaseInfo();
        //第二行开始，到倒数第三行结束（总数减去两行）
        List<StudentBaseInfo> readDateListT = ImportExcelUtil.readDateListT(wb, studentBaseInfo, 2, 2);
        logger.info(readDateListT);
        
	}

}
