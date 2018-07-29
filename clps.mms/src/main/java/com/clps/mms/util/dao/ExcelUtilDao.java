
package com.clps.mms.util.dao;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;


/**
 * 
* @ClassName: ExcelUtilDao  
* @Description: Excel方法类  
* @author Clement.chen  
* @date 2018年5月11日 上午10:39:59  
*  
* @param <T>
 */
public interface ExcelUtilDao<T> {

	public List<T> importFromExcel(String sheetName, InputStream input);
	
	public boolean exportToExcel(List<T> list, String sheetName, int sheetSize, OutputStream output);
}
