package com.clps.mms.sm.dao;

import java.util.List;

import com.clps.mms.sm.pojo.Menu;
import com.clps.mms.sm.vo.MenuJson;

/**
 * @desc: clps.mms
 * @author: victor.gu
 * @createTime: 2018年5月14日 下午1:47:56
 * @version: v1.0
 */

public interface MenuMapper {
	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param menuId
	 * @return int 通过菜单ID 逻辑删除该菜单
	 */
	int deleteMenuById(Integer menuId);

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param record
	 * @return int 插入新菜单
	 */
	int addMenu(Menu record);

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param menuId
	 * @return int 通过菜单ID 查询该菜单的所有信息
	 */
	Menu queryMenuById(Integer menuId);

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param record
	 * @return int 修改该菜单
	 */
	int updateMenu(Menu record);

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param
	 * @return 查询所有菜单的所有信息
	 */
	List<Menu> queryAllMenus();
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年6月2日 下午4:16:00
		* @return
		* List<MenuJson>
		* Menu对象转换成Json对象
	 */
	List<MenuJson> queryMenusJson();
}