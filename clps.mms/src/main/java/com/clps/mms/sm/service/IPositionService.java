
/**
	* Copyright @ 2018 com.jit
	* clps.mms 上午9:33:06
	* All right reserved.
	*
	*/
	
package com.clps.mms.sm.service;

import java.util.List;

import com.clps.mms.sm.pojo.Position;
import com.clps.mms.util.paging.PagingVO;




/**
	* @desc: clps.mms
	* @author: James.gu
	* @createTime: 2018年5月7日 上午9:33:06
	* @history:
	* @version: v1.0
	*/

public interface IPositionService {             
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年5月9日 上午11:23:04
		* @history:
		* @param position
		* @return
		* String
		* 添加新职位
	 */
	public String addposition(Position position);
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年5月9日 上午11:23:08
		* @history:
		* @param position
		* @return
		* String
		* 更新职位信息
	 */
	public String updateposition(Position position);
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年5月9日 上午11:23:11
		* @history:
		* @param position_id
		* @return
		* String
		* 通过职位ID逻辑删除该职位
	 */
	public String deletePosition(int position_id);
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年5月9日 上午11:23:15
		* @history:
		* @param position_id
		* @return
		* position
		* 通过职位ID查询该职位信息
	 */
	public Position queryPosition(int positionId);
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年5月29日 下午4:22:33
		* @param positionName
		* @return
		* Position
		* 通过职位名称查询该职位信息
	 */
	public List<Position> queryPositionByName(String positionName);
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年5月9日 上午11:23:18
		* @history:
		* @return
		* List<position>
		* 查询当前所有有效职位信息
	 */
	public List<Position> showPosition();
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年5月29日 上午11:04:56
		* @return
		* List<Position>
		* 分页查询有效的职位信息
	 */
	public List<Position> findByPaging(PagingVO pageVo);
	
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年5月29日 上午10:45:00
		* @return
		* int
		* 查询当前有效职位的记录条数
	 */	
	public int getCountPosition();
}
