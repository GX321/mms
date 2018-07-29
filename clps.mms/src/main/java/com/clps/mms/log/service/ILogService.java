package com.clps.mms.log.service;


import java.util.List;

import com.clps.mms.log.pojo.Log;
/**
 * 
 * @author peri.yao
 *
 * 2018年5月10日上午10:37:06
 *
 */



public interface ILogService {

	/**
	 * 
	 * @param log
	 * @return
	 */
	public String saveLog(Log log);
	
	/**
	 * 
	 * @return
	 */
	public List<Log> showLogs();
	/**
	 * 
	 * @param logOperatorName
	 * @return
	 */
	public List<Log> showOperatorNames(String logOperatorName);
	/**
	 * 
	 * @param logOperationObject
	 * @return
	 */
	public List<Log> showOperationObjects(String logOperationObject);
	/**
	 * 
	 * @param logOperationKind
	 * @return
	 */
	public List<Log> showOperationKinds(String logOperationKind);
	/**
	 * 
	 * @param logOperationComment
	 * @return
	 */
	public List<Log> showOperationComments(String logOperationComment);
}

