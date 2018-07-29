package com.clps.mms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clps.mms.common.ResultConstant;
import com.clps.mms.log.dao.LogMapper;
import com.clps.mms.log.pojo.Log;
import com.clps.mms.log.service.ILogService;


@Service
public class LogServiceImpl implements ILogService {

	
	@Autowired
	 private LogMapper logMapper;
	
	
	public void init(){
		System.out.println("LogService init() invoke...");
	}

	/* (non-Javadoc)
	 * @see com.clps.mms.service.IUserService#addUser(com.clps.mms.sm.pojo.User)
	 */
	public String saveLog(Log log) {
		if(log!=null){
			if(this.logMapper.addLog(log)>0){
				return ResultConstant.ADD_SUCCESS;
			}
		}else{
			return ResultConstant.ADD_OBJECT_ISNULL;
		}
		return ResultConstant.ADD_FAULURE;
	}

	
	public List<Log> showLogs(){
		return this.logMapper.queryAllLog();
	}
	
	public List<Log> showOperatorNames(String logOperatorName){
		return this.logMapper.queryLogByName(logOperatorName);
	}
	
	public List<Log> showOperationObjects(String logOperationObject){
		return this.logMapper.queryLogByObject(logOperationObject);
	}
	
	public List<Log> showOperationKinds(String logOperationKind){
		return this.logMapper.queryLogByKind(logOperationKind);
	}
	
	public List<Log> showOperationComments(String logOperationComment){
		return this.logMapper.getLikeComment(logOperationComment);
	}
	
	
}

