package com.clps.mms.sm.service.impl;


import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.clps.mms.common.SupportConstant;
import com.clps.mms.log.pojo.Log;
import com.clps.mms.log.service.ILogService;


import com.clps.mms.util.controller.SpringTestBase;

/**
	* @desc: clps.mms
	* @author: peri.yao
	* @createTime: 2018年5月15日 下午2:11:01
	* @description:
	* @history:
	* @version: v1.0
	*/

public class LogServiceImplTest extends SpringTestBase{
	@Autowired
	private ILogService servicedao;
	
	Log log=null;
	List<Log> logs = null;
	Logger logger=Logger.getLogger(LogServiceImplTest.class);
	/**
		* @author: peri.yao
		* @createTime: 2018年5月8日 下午7:28:05
		* @history:
		* @throws java.lang.Exception
		* void
		*/
	@Before
	public void setUp() throws Exception {
	}

	/**
		* @author: peri.yao
		* @createTime: 2018年5月8日 下午7:28:05
		* @history:
		* @throws java.lang.Exception
		* void
		*/
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.clps.mms.log.service.impl.LogserviceImpl}.
	 */
	@Test
	public void testshowLogs(){        //查询所有日志
		Iterator<Log> logs=this.servicedao.showLogs().iterator();
		if(logs!=null){
			logger.info(SupportConstant.QUERY_SUCCESS);
		while(logs.hasNext()){
			logger.info(logs.next());
			}
		}
		else
			logger.error(SupportConstant.QUERY_FAILURE);
	}

	/**
	 * Test method for {@link com.clps.mms.log.service.impl.LogserviceImpl#addLog(com.clps.mms.log.pojo.Log)}.
	 */
	@Test
	public void testsaveLog(){				//添加新职位
	log=new Log();
	log.setLogOperationTime("2018年5月19号 13:22:33");
	log.setLogOperatorName("翟欢");
	log.setLogOperationObject("角色");
	log.setLogOperationKind("新增");
	log.setLogOperationComment("新增**角色");
	logger.info(this.servicedao.saveLog(log));
	}

	/**
	 * Test method for {@link com.clps.mms.log.service.impl.LogserviceImpl#(com.clps.mms.log.pojo.Log)}.
	 */
	@Test
	public void testshowOperatorNames() {			//通过职操作人名查询
		Iterator<Log> logs=this.servicedao.showOperatorNames("黄严").iterator();
		if(logs!=null){
			logger.info(SupportConstant.QUERY_SUCCESS);
		while(logs.hasNext()){
			logger.info(logs.next());
			}
		}
		else
			logger.error(SupportConstant.QUERY_FAILURE);
			
		
	}

	/**
	 * Test method for {@link com.clps.mms.log.service.impl.LogserviceImpl#queryPostion(int)}.
	 */
	@Test
	public void testshowOperationObjects() {					//通过职位编号查询职位信息
		Iterator<Log> logs=this.servicedao.showOperationObjects("账户").iterator();
		if(logs!=null){
			logger.info(SupportConstant.QUERY_SUCCESS);
		while(logs.hasNext()){
			logger.info(logs.next());
			}
		}
		else
			logger.error(SupportConstant.QUERY_FAILURE);
	}
	
	/**
	 * Test method for {@link com.clps.mms.log.service.impl.LogserviceImpl#queryPostion(int)}.
	 */
	@Test
	public void testshowOperationKinds() {					//通过职位编号查询职位信息
		Iterator<Log> logs=this.servicedao.showOperationKinds("查询").iterator();
		if(logs!=null){
			logger.info(SupportConstant.QUERY_SUCCESS);
		while(logs.hasNext()){
			logger.info(logs.next());
			}
		}
		else
			logger.error(SupportConstant.QUERY_FAILURE);
	}
	
	/**
	 * Test method for {@link com.clps.mms.log.service.impl.LogserviceImpl#queryPostion(int)}.
	 */
	@Test
	public void testshowOperationComments() {					//通过职位编号查询职位信息
		Iterator<Log> logs=this.servicedao.showOperationComments("查询").iterator();
		if(logs!=null){
			logger.info(SupportConstant.QUERY_SUCCESS);
		while(logs.hasNext()){
			logger.info(logs.next());
			}
		}
		else
			logger.error(SupportConstant.QUERY_FAILURE);
	}
	

	

}
