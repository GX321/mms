/**
 * 
 */
package com.clps.mms.sm.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clps.mms.sm.pojo.Role;
import com.clps.mms.sm.service.IRoleService;

/**
 * 
		* @author: Sail.Zhang
		* 
		* @createTime: 2018年5月8日 上午10:33:45
 */
@Controller
@RequestMapping(value = "/sm")
public class RoleController {

	@Resource
	private IRoleService roleService;

	/**
	 * 
	 * @desc:查询角色
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/roleList")
	public String showRole(Model model) {
		List<Role> roles = roleService.showRole();
		model.addAttribute("roles", roles);

		return "sm/role_list";
	}

	@RequestMapping(value = "/roleDel", method = RequestMethod.GET)
	public String delRole(HttpServletRequest request, Model model) {

		int roleId = Integer.parseInt(request.getParameter("roleId"));
		roleService.deleteRole(roleId);

		List<Role> roles = roleService.showRole();
		model.addAttribute("roles", roles);

		return "sm/role_list";
	}
	/**
	 * 
	 * @desc:添加角色
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/roleAdd")
	public String addPostion(HttpServletRequest request, Model model) {
		return "sm/role_add";
	}

	@RequestMapping(value = "/roleCreate", method = RequestMethod.POST)
	public String createPostion(HttpServletRequest request, HttpServletResponse response, Model model) {
		Role role = new Role();
		role.setRoleName(request.getParameter("roleName"));
		role.setRoleGroupId(request.getParameter("roleGroupId"));
		role.setRoleGroupName(request.getParameter("roleGroupName"));
		role.setRoleMaker(request.getParameter("roleMaker"));
		role.setRoleUpdateTime(new Timestamp(new Date().getTime()));
		role.setRoleComment(request.getParameter("roleComment"));
		roleService.addRole(role);

		List<Role> roles = roleService.showRole();
		model.addAttribute("roles", roles);
		return "sm/role_list";
	}
	/**
	 * @desc:查询角色
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/roleQuery")
	public String query(HttpServletRequest request, Model model) {
		int roleId = Integer.parseInt(request.getParameter("roleId"));
		Role role = roleService.queryRoleById(roleId);
		model.addAttribute("role", role);

		return "sm/role_list";
	}
	/**
	 * 
	 * @desc:修改角色
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/roleUpdate")
	public String update(HttpServletRequest request, Model model) {
		int roleId = Integer.parseInt(request.getParameter("roleId"));
		Role role = roleService.queryRoleById(roleId);
		model.addAttribute("role", role);

		return "sm/role_update";
	}

	@RequestMapping(value = "/roleEdit", method = RequestMethod.POST)
	public String update1(HttpServletRequest request, Model model) {
		int roleId = Integer.parseInt(request.getParameter("roleId"));
		Role role = roleService.queryRoleById(roleId);
		System.out.println(role);
		role.setRoleName(request.getParameter("roleName"));
		role.setRoleGroupId(request.getParameter("roleGroupId"));
		role.setRoleGroupName(request.getParameter("roleGroupName"));
		role.setRoleMaker(request.getParameter("roleMaker"));
		role.setRoleUpdateTime(new Timestamp(new Date().getTime()));
		role.setRoleComment(request.getParameter("roleComment"));
		roleService.updateRole(role);
		List<Role> roles = roleService.showRole();
		model.addAttribute("roles", roles);

		return "sm/role_list";
	}
}
