/**
 * 
 */
package com.clps.mms.common;

/**
 * 
* @ClassName: ResultConstant  
* @Description: 导入导出常量  
* @author Clement.chen  
* @date 2018年5月11日 上午9:51:11  
*
 */
public interface ResultConstant {

	
	public final static String ROOT_CATOLOG="0000";
	public final static String ADD_SUCCESS = "1111-1";			//新增成功，显示1111-1
	public final static String ADD_FAULURE = "1111-0";			//新增失败，显示1111-0
	public final static String UPDATE_SUCESS = "2222-1";		//更新成功，显示2222-1
	public final static String UPDATE_FAULURE = "2222-0";		//更新失败，显示2222-0
	public final static String DELETE_SUCESS = "3333-1";		//删除成功，显示3333-1
	public final static String DELETE_FAULURE = "3333-0";		//删除失败，显示3333-0
	public final static String ADD_OBJECT_ISNULL="2";
	
	public final static String IMPORT_SUCCESS = "5555-1";		//从excel中导入成功，显示5555-1
	public final static String IMPORT_FAULURE = "5555-0";		//从excel中导入失败，显示5555-1
	
	public final static String EXPORT_SUCCESS = "6666-1";		//导出到excel成功，显示6666-1
	public final static String EXPORT_FAULURE = "6666-0";		//导出到excel失败，显示6666-0
	
	
}
