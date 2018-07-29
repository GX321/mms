package com.clps.mms.sm.dao;

import java.util.List;

import com.clps.mms.sm.pojo.Position;
import com.clps.mms.util.paging.PagingVO;
/**
 * 
	* @desc: clps.mms
	* @author: James.gu
	* @createTime: 2018年5月21日 下午1:06:31
	* @version: v1.0
 */
public interface PositionMapper {
    

   /**
    * 通过职位ID查询职位信息
   	* @author: James.gu
   	* @createTime: 2018年5月21日 下午1:06:35
   	* @param positionId
   	* @return
   	* Position
    */
    Position queryByPositionId(Integer positionId);
    /**
     	*通过职位名称查询职位信息 
    	* @author: James.gu
    	* @createTime: 2018年5月29日 下午4:14:22
    	* @param positionName
    	* @return
    	* Position
     */
    List<Position>  queryByPositionName(String positionName);
    
    /**
     	*查询所有有效职位信息 
    	* @author: James.gu
    	* @createTime: 2018年5月21日 下午1:06:43
    	* @return
    	* List<Position>
     */
    List<Position> queryPositions();
    
    /**
     	* 添加新职位
    	* @author: James.gu
    	* @createTime: 2018年5月21日 下午1:06:46
    	* @param record
    	* @return
    	* int
     */
    
    int addPosition(Position record);
    
    /**
     	* 查询有效职位的记录条数
    	* @author: James.gu
    	* @createTime: 2018年5月29日 上午10:43:31
    	* @return
    	* int
     */
    int getCountPosition();
    
    /**
     	* 分页查询职位信息
    	* @author: James.gu
    	* @createTime: 2018年5月29日 上午11:03:59
    	* @return
    	* List<Position>
     */
    List<Position>  findByPaging(PagingVO pagevo);
    
    /**
     	*通过职位ID逻辑删除该职位 
    	* @author: James.gu
    	* @createTime: 2018年5月21日 下午1:06:52
    	* @param positionId
    	* @return
    	* int
     */
    int deleteByPositionId(Integer positionId);
    
    /**
     	*更新职位信息 
    	* @author: James.gu
    	* @createTime: 2018年5月21日 下午1:06:56
    	* @param record
    	* @return
    	* int
     */
    int updatePosition(Position record);

    
}