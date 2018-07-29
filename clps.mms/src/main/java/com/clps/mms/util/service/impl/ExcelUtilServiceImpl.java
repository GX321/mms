
package com.clps.mms.util.service.impl;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clps.mms.common.ResultConstant;
import com.clps.mms.util.dao.ExcelUtilDao;
import com.clps.mms.util.dao.impl.ExcelUtilDaoImpl;
import com.clps.mms.util.pojo.UserTestModule;
import com.clps.mms.util.service.ExcelUtilService;



/**
 * 
* @ClassName: ExcelUtilServiceImpl  
* @Description: 导入导出Excel工具类方法实现  
* @author Clement.chen  
* @date 2018年5月11日 上午10:45:55  
*
 */
@Service("excelUtilService")
public class ExcelUtilServiceImpl implements ExcelUtilService<T>{

	
	@SuppressWarnings("unchecked")
	@Autowired
	private ExcelUtilDao<T> excelUtilDao = new ExcelUtilDaoImpl<UserTestModule>(UserTestModule.class);
	
	public String importFromExcel(String sheetName, InputStream input) {
		if(this.excelUtilDao.importFromExcel(sheetName, input).size()>0)
			return ResultConstant.IMPORT_SUCCESS;
		return ResultConstant.IMPORT_FAULURE;
	}

	public String exportToExcel(List<T> list, String sheetName, int sheetSize, OutputStream output) {
		if(this.excelUtilDao.exportToExcel(list, sheetName, sheetSize, output))
			return ResultConstant.EXPORT_SUCCESS;
		return ResultConstant.EXPORT_FAULURE;
	}


}
