/**
 * 
 */
package com.clps.mms.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.clps.mms.common.SupportConstant;
import com.clps.mms.sm.dao.MenuMapper;
import com.clps.mms.sm.pojo.Menu;
import com.clps.mms.sm.service.IMenuService;
import com.clps.mms.sm.vo.MenuJson;

/**
 * @desc: clps.mms
 * @author: victor.gu
 * @createTime: 2018年5月14日 下午2:22:13
 * @version: v1.0
 */

@Service("IMenuService")
public class MenuServiceImpl implements IMenuService {

	@Autowired
	private MenuMapper menumapper;

	public void init() {
		System.out.println("MenuService init() invoke...");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * insertMenu()
	 */

	public String addMenu(Menu record) {
		if (menumapper.addMenu(record) > 0) {
			return SupportConstant.ADD_SUCCESS;
		}
		return SupportConstant.ADD_FAILURE;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * updateMenu()
	 */

	public String updateMenu(Menu record) {

		if (menumapper.updateMenu(record) > 0) {
			return SupportConstant.UPDATE_SUCESS;
		}
		return SupportConstant.UPDATE_FAILURE;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * queryMenuById()
	 */

	public Menu queryMenuById(Integer menuId) {

		return menumapper.queryMenuById(menuId);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * queryAllMenus()
	 */

	public List<Menu> queryAllMenus() {

		return menumapper.queryAllMenus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * deleteMenuById()
	 */

	public String deleteMenuById(Integer menuId) {

		if (menumapper.deleteMenuById(menuId) > 0) {
			return SupportConstant.DELETE_SUCESS;
		}
		return SupportConstant.DELETE_FAILURE;
	}

	
	public List<MenuJson> queryMenusJson() {
		
		return menumapper.queryMenusJson();
	}

}
