package com.clps.mms.log.dao;

import java.util.List;

import com.clps.mms.log.pojo.Log;

/**
 * 
 * @author peri.yao
 *
 * 2018年5月14日上午9:33:32
 *
 */


/**
 * 
 * @author peri.yao
 * 
 * 2018年5月14日下午4:00:05
 *
 */
public interface LogMapper {

	/**
	 * 
	 * @param record
	 * @return
	 */

	int addLog(Log record);
	/**
	 * 
	 * @param logOperatorName
	 * @return
	 * 根据操作人名查询。
	 */
	List<Log> queryLogByName(String logOperatorName);
	/**
	 * 
	 * @param logOperationObject
	 * @return
	 * 根据操作对象查询。
	 */

	List<Log> queryLogByObject(String logOperationObject);
	/**
	 * 
	 * @param logOperationKind
	 * @return
	 * 根据操作类型查询。
	 */

	List<Log> queryLogByKind(String logOperationKind);
	/**
	 * 
	 * @param logOperationComment
	 * @return
	 * 根据操作详情模糊查询。
	 */

	List<Log> getLikeComment(String logOperationComment);

	List<Log> queryAllLog();
}