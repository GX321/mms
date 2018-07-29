
package com.clps.mms.util.service;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * 
* @ClassName: ExcelUtilService  
* @Description: 导入导出Excel工具类方法  
* @author Clement.chen  
* @date 2018年5月11日 上午10:17:50  
*  
* @param <T>
 */
public interface ExcelUtilService<T> {

	/*从excel中导入*/
	public String importFromExcel(String sheetName, InputStream input);

	public String exportToExcel(List<T> list, String sheetName, int sheetSize, OutputStream output);
}
