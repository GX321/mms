/**
 * 
 */
package com.clps.mms.sm.service;

import java.util.List;

import com.clps.mms.sm.pojo.Menu;
import com.clps.mms.sm.vo.MenuJson;

/**
 * @desc: clps.mms
 * @author: victor.gu
 * @createTime: 2018年5月14日 下午2:14:46
 * @version: v1.0
 */

public interface IMenuService {
	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月9日 上午11:23:04
	 * @history:
	 * @param record
	 * @return String 修改菜单信息
	 */
	public String updateMenu(Menu record);

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月9日 上午11:23:04
	 * @history:
	 * @param
	 * @return 查询所有菜单的所有信息
	 */
	public List<Menu> queryAllMenus();
	/**
	 * 
		* @author: James.gu
		* @createTime: 2018年6月2日 下午4:17:03
		* @return
		* List<MenuJson>
	 */
	public List<MenuJson> queryMenusJson();

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月9日 上午11:23:04
	 * @history:
	 * @param menuId
	 * @return String 通过菜单id逻辑删除该菜单
	 */
	public String deleteMenuById(Integer menuId);

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月9日 上午11:23:04
	 * @history:
	 * @param record
	 * @return String 创建一个新菜单
	 */
	public String addMenu(Menu record);

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月9日 上午11:23:04
	 * @history:
	 * @param menuId
	 * @return 通过菜单Id查询该菜单
	 */
	Menu queryMenuById(Integer menuId);
}
