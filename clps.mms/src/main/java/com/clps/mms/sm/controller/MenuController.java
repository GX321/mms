
package com.clps.mms.sm.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.clps.mms.sm.pojo.Menu;
import com.clps.mms.sm.service.IMenuService;
import com.clps.mms.sm.vo.MenuJson;


/**
 * @desc: clps.mms
 * @author: victor.gu
 * @createTime: 2018年5月14日 下午4:13:54
 * @version: v1.0
 */

@Controller
@RequestMapping(value = "/sm")
public class MenuController {

	@Resource
	private IMenuService sm;
	
	@RequestMapping(value = "/Json")
	@ResponseBody
	public List<MenuJson> getJson() throws IOException {
		return sm.queryMenusJson();
		
	}

	/**
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param
	 * @return 展示所有菜单信息
	 */
	@RequestMapping(value = "/MenuList",method=RequestMethod.GET)
	public String showMenu(Model model) {
		List<Menu> menus = sm.queryAllMenus();
		model.addAttribute("menus", menus);

		return "sm/menu_list";
	}

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param
	 * @return 创建新菜单
	 */

	@RequestMapping(value = "/Addmenu",method=RequestMethod.POST)
	public String addmenu(Menu record, Model model) {
		sm.addMenu(record);
		return "sm/menu_addresult";

	}

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param
	 * @return 逻辑删除一个菜单
	 */
	@RequestMapping(value = "/Delmenu",method=RequestMethod.POST)
	public String delmenu(int menuId) {

		sm.deleteMenuById(menuId);

		return "sm/menu_delresult";
	}

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param
	 * @return 通过菜单id获取该菜单的信息，并跳转到修改界面
	 */
	@RequestMapping(value = "/Getmenu",method=RequestMethod.GET)
	public String getMenu(int menuId, Model model, HttpServletRequest request) {
		request.setAttribute("menu", sm.queryMenuById(menuId));
		model.addAttribute("menu", sm.queryMenuById(menuId));
		return "sm/menu_update";
	}

	/**
	 * 
	 * @author: victor.gu
	 * @createTime: 2018年5月14日 下午1:47:56
	 * @history:
	 * @param
	 * @return 修改菜单信息
	 */
	@RequestMapping(value = "/Updatemenu",method=RequestMethod.POST)
	public String updatemenu(Menu record, Model model, HttpServletRequest request) {
		sm.updateMenu(record);
		record = sm.queryMenuById(record.getMenuId());
		request.setAttribute("menu", record);
		model.addAttribute("menu", record);
		return "sm/menu_updateresult";
	}

}
