
	/**
	* Copyright @ 2018 com.jit
	* clps.mms 下午6:50:56
	* All right reserved.
	*
	*/

package com.clps.mms.sm.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clps.mms.common.SupportConstant;
import com.clps.mms.sm.dao.PositionMapper;
import com.clps.mms.sm.pojo.Position;
import com.clps.mms.sm.service.IPositionService;
import com.clps.mms.util.paging.PagingVO;

	/**
	 * @desc: clps.mms
	 * @author: James.gu
	 * @createTime: 2018年5月8日 下午6:50:56
	 * @version: v1.0
	 */
@Service
@Transactional
public class PositionServiceImpl implements IPositionService {
	@Autowired
	private PositionMapper dao;
	
	Logger log=Logger.getLogger(PositionServiceImpl.class);
	/**
	 * 添加新职位
	 * 
	 * @param position
	 * @return
	 * @see com.clps.mms.sm.service.IPositionService#addposition(com.clps.mms.sm.pojo.Position)
	 */
	@Override
	public String addposition(Position position) { // 添加新职位
		if (position != null) {
			if (this.dao.addPosition(position) > 0) {
				return SupportConstant.ADD_SUCCESS;
			} else
				return SupportConstant.ADD_FAILURE;
		}
		return SupportConstant.ADD_FAILURE;
	}

	/**
	 * 更新职位信息
	 * 
	 * @param position
	 * @return
	 * @see com.clps.mms.sm.service.IPositionService#updateposition(com.clps.mms.sm.pojo.Position)
	 */
	@Override
	public String updateposition(Position position) {
		if (position != null) {
			if (this.dao.updatePosition(position) > 0) {
				return SupportConstant.UPDATE_SUCESS;
			} else
				return SupportConstant.UPDATE_FAILURE;
		}
		return SupportConstant.UPDATE_FAILURE;
	}

	/**
	 * 根据职位ID号逻辑删除职位
	 * 
	 * @param position_id
	 * @return
	 * @see com.clps.mms.sm.service.IPositionService#deletePosition(int)
	 */
	@Override
	public String deletePosition(int position_id) {
		if (this.dao.deleteByPositionId(position_id) > 0) {
			return SupportConstant.DELETE_SUCESS;
		} else
			return SupportConstant.DELETE_FAILURE;

	}

	/**
	 * 查询指定职位ID的职位信息
	 * 
	 * @param position_id
	 * @return
	 * @see com.clps.mms.sm.service.IPositionService#queryPosition(int)
	 */
	@Override
	public Position queryPosition(int position_id) {
		Position position = this.dao.queryByPositionId(position_id);
		if (position != null) {
			log.info(SupportConstant.QUERY_SUCCESS);
			return position;
		} else{
			log.error(SupportConstant.QUERY_FAILURE);
			return null;
		}
			
	}

	/**
	 * 查询所有有效职位信息
	 * 
	 * @return
	 * @see com.clps.mms.sm.service.IPositionService#showPosition()
	 */
	@Override
	public List<Position> showPosition() {
		List<Position> positions = this.dao.queryPositions();
		if ( positions!= null) {
			log.info(SupportConstant.QUERY_SUCCESS);
			return positions;
		} else{
			log.error(SupportConstant.QUERY_FAILURE);
			return null;
		}
			
	}

	@Override
	public int getCountPosition() {
		int count=this.dao.getCountPosition();
		if(count>0){
			log.info(SupportConstant.QUERY_SUCCESS);
			return count;
		}
		else{
			log.error(SupportConstant.QUERY_FAILURE);
			return 0;
		}
		
	}

	@Override
	public List<Position> findByPaging(PagingVO pageVo) {
		List<Position> positions = this.dao.findByPaging(pageVo);
		if (positions != null) {
			log.info(SupportConstant.QUERY_SUCCESS);
			return positions;
		} else{
			log.error(SupportConstant.QUERY_FAILURE);
			return null;
		}
	}

	@Override
	public List<Position> queryPositionByName(String positionName) {
		List<Position> positions = this.dao.queryByPositionName(positionName);
		if (positions != null) {
			log.info(SupportConstant.QUERY_SUCCESS);
			return positions;
		} else{
			log.error(SupportConstant.QUERY_FAILURE);
			return null;
		}
	}

}
