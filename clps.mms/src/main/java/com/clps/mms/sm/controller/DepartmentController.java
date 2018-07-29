
package com.clps.mms.sm.controller;

import java.io.IOException;
import java.io.StringWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.clps.mms.sm.pojo.Department;

import com.clps.mms.sm.pojo.TreeNode;
import com.clps.mms.sm.service.impl.DepartmentServiceImpl;
import com.clps.mms.util.controller.TreeUtil;
import com.clps.mms.util.paging.PagingVO;

/**
 * <p>
 * Title: DepartmentController.java
 * </p>
 * <p>
 * Description:clps.mms
 * </p>
 * 
 * @author kartoffeln.fu 2018年5月14日 & 上午9:36:36
 */
@Controller
@RequestMapping("/sm")
@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class DepartmentController {
	@Resource
	private DepartmentServiceImpl departmentService;
	private Date day = new Date();
	PagingVO pagingVO = new PagingVO();

	/*
	 * (查询所有信息)
	 * 
	 */

	@RequestMapping("/departmentquery")
	public String showDepartment(HttpServletRequest request, Model model, Integer page) {

		pagingVO.setTotalCount(departmentService.countByDepartment());
		List<Department> list = departmentService.queryAllDepartment();
		if (page == null || page == 0) {
			pagingVO.setToPageNo(1);
			list = departmentService.queryByPaging(pagingVO);
		} else {
			pagingVO.setToPageNo(page);
			list = departmentService.queryByPaging(pagingVO);
		}
		model.addAttribute("department", list);
		model.addAttribute("pagingVO", pagingVO);
		model.addAttribute("department", list);
		return "sm/department_queryall";
	}

	/*
	 * (删除部门信息)
	 * 
	 */
	@RequestMapping("/departmentdelete")
	public String delete(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		pagingVO.setTotalCount(departmentService.countByDepartment());
		model.addAttribute("pagingVO", pagingVO);
		departmentService.deleteDepartment(userId);
		List<Department> list = departmentService.queryAllDepartment();
		model.addAttribute("department", list);
		return "sm/department_queryall";
	}

	/*
	 * (更新部门信息)
	 * 
	 */
	@RequestMapping("/departmentupdate")
	public String update(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		Department dep = departmentService.queryById(userId);
		model.addAttribute("department", dep);
		return "sm/department_update";
	}

	/*
	 * (更新部门信息插入)
	 * 
	 */
	@RequestMapping(value = "/departmentsetupdate", method = RequestMethod.POST)
	public String setupdate(Department dep, HttpServletRequest request, Model model) throws ParseException {

		dep.setDepartmentUpdatedtime(day);
		dep.setDepartmentCreatedtime(day);
		departmentService.updateDepartment(dep);
		pagingVO.setTotalCount(departmentService.countByDepartment());
		model.addAttribute("pagingVO", pagingVO);
		List<Department> list = departmentService.queryAllDepartment();
		model.addAttribute("department", list);
		return "sm/department_queryall";

	}

	@RequestMapping("/addDepartment")
	public String addDepartment(HttpServletRequest request, Model model) {
		return "sm/department_add";
	}

	/*
	 * (新增部门信息)
	 * 
	 */
	@RequestMapping(value = "/departmentadd", method = RequestMethod.POST)
	public String add(Department dep, HttpServletRequest request, Model model) throws ParseException {

		dep.setDepartmentUpdatedtime(day);
		dep.setDepartmentCreatedtime(day);
		departmentService.insertDepartment(dep);
		pagingVO.setTotalCount(departmentService.countByDepartment());
		model.addAttribute("pagingVO", pagingVO);
		List<Department> list = departmentService.queryAllDepartment();
		model.addAttribute("department", list);
		return "sm/department_queryall";
	}




}
