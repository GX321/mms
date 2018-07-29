
   /**
	* Copyright @ 2018 com.jit
	* clps.mms 下午2:11:01
	* All right reserved.
	*
	*/
	
package com.clps.mms.sm.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.clps.mms.common.SupportConstant;
import com.clps.mms.sm.pojo.Position;
import com.clps.mms.sm.service.IPositionService;
import com.clps.mms.util.controller.SpringTestBase;
import com.clps.mms.util.paging.PagingVO;

/**
	* @desc: clps.mms
	* @author: James.gu
	* @createTime: 2018年5月15日 下午2:11:01
	* @description:
	* @history:
	* @version: v1.0
	*/

public class PositionServiceImplTest extends SpringTestBase{
	@Autowired
	private IPositionService servicedao;
	
	Position postion=null;
	Logger log=Logger.getLogger(PositionServiceImplTest.class);
	/**
		* @author: James.gu
		* @createTime: 2018年5月8日 下午7:28:05
		* @history:
		* @throws java.lang.Exception
		* void
		*/
	@Before
	public void setUp() throws Exception {
	}

	/**
		* @author: James.gu
		* @createTime: 2018年5月8日 下午7:28:05
		* @history:
		* @throws java.lang.Exception
		* void
		*/
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.PostionserviceImpl#deletePostion(int)}.
	 */
	@Test
	public void testDeletePostion(){        //通过职位编号进行逻辑删除
		log.info(this.servicedao.deletePosition(7));
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.PostionserviceImpl#addPostion(com.clps.mms.sm.pojo.Postion)}.
	 */
	@Test
	public void testAddPostion(){				//添加新职位
	postion=new Position();
	postion.setPositionCreatedName("li");
	postion.setPositionCreatedDatetime(new Timestamp(new Date().getTime()));
	postion.setPositionId(11);
	postion.setPositionName("da总监");
	postion.setPositionComment("bbbb");
	log.info(this.servicedao.addposition(postion));
	log.info(postion.getPositionId());
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.PostionserviceImpl#updatePostion(com.clps.mms.sm.pojo.Postion)}.
	 */
	@Test
	public void testUpdatePostion() {			//通过职位编号更新职位
		postion=new Position();
		postion.setPositionId(7);
		postion.setPositionComment("ccccc");
		postion.setPositionUpdatedName("zhang");
		postion.setPositionUpdatedDatetime(new Timestamp(new Date().getTime()));
		log.info(this.servicedao.updateposition(postion));
			
		
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.PostionserviceImpl#queryPostion(int)}.
	 */
	@Test
	public void testQueryPostion() {					//通过职位编号查询职位信息
		postion=this.servicedao.queryPosition(2);
		if(postion!=null){
			log.info(SupportConstant.QUERY_SUCCESS);
			log.info(postion);
		}
		else
			log.error(SupportConstant.QUERY_FAILURE);
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.PostionserviceImpl#showPostion()}.
	 */
	@Test
	public void testShowPostion() {							//查询当前所有有效职位信息
		Iterator<Position> postions=this.servicedao.showPosition().iterator();
		if(postions!=null){
			log.info(SupportConstant.QUERY_SUCCESS);
		while(postions.hasNext()){
			log.info(postions.next());
			}
		}
		else
			log.error(SupportConstant.QUERY_FAILURE);
	}
	@Test
	public void getCountPostion() {							//查询当前所有有效职位条数
		int count=this.servicedao.getCountPosition();
		if(count>0){
			log.info(SupportConstant.QUERY_SUCCESS);
			log.info(count);
		}
		else
			log.error(SupportConstant.QUERY_FAILURE);
	}
	@Test
	public void getPostionPaging() {						//分页查询有效职位信息
		PagingVO vo=new PagingVO();
		vo.setToPageNo(2);
	
		Iterator<Position> positions=this.servicedao.findByPaging(vo).iterator();
		if(positions!=null){
			log.info(SupportConstant.QUERY_SUCCESS);
			while(positions.hasNext()){
				log.info(positions.next());
				}
		}
		else
			log.error(SupportConstant.QUERY_FAILURE);
	}
}
