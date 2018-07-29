
package com.clps.mms.util.factory;

import org.apache.poi.ss.formula.functions.T;

import com.clps.mms.util.date.DateUtil;
import com.clps.mms.util.excel.ExportBeanExcel;
import com.clps.mms.util.excel.ExportMapExcel;
import com.clps.mms.util.excel.ImportExcelUtil;
import com.clps.mms.util.stringconversion.StringConversionUtil;
import com.clps.mms.util.excel.ExcelUtil;
import com.clps.mms.util.excel.vo.Account;
import com.clps.mms.util.excel.vo.Department;
import com.clps.mms.util.excel.vo.Position;

/**
 * 
 * @ClassName: UtilFactory
 * @Description:工厂模式
 * @author Clement.chen
 * @date 2018年5月11日 上午9:51:45
 *
 */
public class UtilFactory {

	// 日期工具类 进行日期格式转换 时间的获取
	public static DateUtil getInstanceOfDateUtil() {
		return new DateUtil();
	}

	// 字符类型工具类 字符类型的转换 字符的修改
	public static StringConversionUtil getInstanceOfStringConversionUtil() {
		return new StringConversionUtil();
	}

	/**
	 * 
	 * @Title: getInstanceOfExcelUtilHandleAccountVo  
	 * @Description: 工厂化账户信息导入导出调用  
	 * @param @return    设定文件  
	 * @return ExcelUtil<Account>    返回类型  
	 * @throws
	 */
	public static ExcelUtil<Account> getInstanceOfExcelUtilHandleAccountVo(){
		return new ExcelUtil<Account>();
	}
	
	/**
	 * 
	 * @Title: getInstanceOfExcelUtilHandleDepartmentVo 
	 * @Description: 工厂化部门信息导入导出调用    
	 * @param @return    设定文件  
	 * @return ExcelUtil<Department>    返回类型  
	 * @throws
	 */
	public static ExcelUtil<Department> getInstanceOfExcelUtilHandleDepartmentVo(){
		return new ExcelUtil<Department>();
	}

	/**
	 * 
	 * @Title: getInstanceOfExcelUtilHandlePositionVo  
	 * @Description: 工厂化职位信息导入导出调用    
	 * @param @return    设定文件  
	 * @return ExcelUtil<Position>    返回类型  
	 * @throws
	 */
	public static ExcelUtil<Position> getInstanceOfExcelUtilHandlePositionVo(){
		return new ExcelUtil<Position>();
	}
	
	

	/**
	 * 应用泛型，代表任意一个符合javabean风格的类
     * 注意这里为了简单起见，boolean型的属性xxx的get器方式为getXxx(),而不是isXxx()
     * T这里代表一个不确定是实体类，即参数实体
	 * 这是一个通用的方法，利用了JAVA的反射机制，可以将放置在JAVA集合中并且符号一定条件的数据以EXCEL 的形式输出
	 *title 表格标题名 headersName 表格属性列名数组 headersId 表格属性列名对应的字段---你需要导出的字段名
	 * dtoList 需要显示的数据集合,集合中一定要放置符合javabean风格的类的对象 out
	 * 与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
	 */
	public static ExportBeanExcel<T> getInstanceOfExportBeanExcel() {
		return new ExportBeanExcel<T>();
	}
	
	/*针对List-Map结构：
	*（一）导出默认样式的Map结构Excel–根据headersId筛选要导出的字段：
	*（二）导出自定义样式的Map结构Excel–根据headersId筛选要导出的字段：
	*（三）导出自定义样式的Map结构Excel–没有标题栏字段匹配，数据体dtoList需要使用treemap。–默认导出dtolist的所有数据：
	*/
	public static ExportMapExcel getInstanceOfExportMapExcel() {
		return new ExportMapExcel();
	}
	
	//根据流读取Excel文件
	public static ImportExcelUtil getInstanceOfImportExcelUtil() {
		return new ImportExcelUtil();
	}
	
	
}
