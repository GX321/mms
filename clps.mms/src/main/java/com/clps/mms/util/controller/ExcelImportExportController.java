
package com.clps.mms.util.controller;

import java.io.File;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.clps.mms.util.factory.UtilFactory;
/**
 * 
* @ClassName: PoiExportTest  
* @Description: 导入导出Excel Controller  
* @author Clement.chen  
* @date 2018年5月21日 下午3:18:23  
*
 */

@Controller
@RequestMapping(value = "/util")
public class ExcelImportExportController {

	private Logger logger = Logger.getLogger(ExcelImportExportController.class);

	// 从表格中读取Position信息上传到页面显示出来
	@RequestMapping(value = "/positionVo_list")
	public String importPositionVoFromExcel(Model model, HttpServletRequest request) {
		List<Object> list = null;

		// 获取上传文件的目录
		ServletContext sc = request.getSession().getServletContext();

		// 上传位置
		String fileSaveRootPath = sc.getRealPath("/doc/excelfile");

		// 得到文件
		File file = new File(fileSaveRootPath + "\\" + "positionVo.xls");

		// 如果文件不存在
		if (!file.exists()) {
			request.setAttribute("message", "您要下载的文件已被删除！！");
			logger.info("您要下载的文件已被删除！！");
		}
		try {
			list = UtilFactory.getInstanceOfExcelUtilHandlePositionVo().ImportFromExcel(file, 0);
			list.remove(0);
			if (list.size() > 0) {
				logger.info("取值成功，文件信息存在");
			} else {
				logger.info(list.size() == 0);
			}
		} catch (IOException e) {
			logger.error("文件不存在:" + e.getMessage());
		}
		model.addAttribute("positionList", list);
		return "util/positionVo_list";

	}

	// 从表格中读取Account信息上传到页面显示出来
	@RequestMapping(value = "/accountVo_list")
	public String importAccountVoFromExcel(Model model, HttpServletRequest request) {
		List<Object> list = null;

		// 获取上传文件的目录
		ServletContext sc = request.getSession().getServletContext();

		// 上传位置
		String fileSaveRootPath = sc.getRealPath("/doc/excelfile");

		// 得到文件
		File file = new File(fileSaveRootPath + "\\" + "accountVo.xls");

		// 如果文件不存在
		if (!file.exists()) {
			request.setAttribute("message", "您要下载的文件已被删除！！");
			logger.info("您要下载的文件已被删除！！");
		}
		try {
			list = UtilFactory.getInstanceOfExcelUtilHandleAccountVo().ImportFromExcel(file, 0);
			list.remove(0);
			if (list.size() > 0) {
				logger.info("取值成功，文件信息存在");
			} else {
				logger.info(list.size() == 0);
			}
		} catch (IOException e) {
			logger.error("文件不存在:" + e.getMessage());
		}
		model.addAttribute("accountList", list);
		return "util/accountVo_list";

	}
	
	// 从表格中读取Department信息上传到页面显示出来
		@RequestMapping(value = "/departmentVo_list")
		public String importDepartmentVoFromExcel(Model model, HttpServletRequest request) {
			List<Object> list = null;

			// 获取上传文件的目录
			ServletContext sc = request.getSession().getServletContext();

			// 上传位置
			String fileSaveRootPath = sc.getRealPath("/doc/excelfile");

			// 得到文件
			File file = new File(fileSaveRootPath + "\\" + "departmentVo.xls");

			// 如果文件不存在
			if (!file.exists()) {
				request.setAttribute("message", "您要下载的文件已被删除！！");
				logger.info("您要下载的文件已被删除！！");
			}
			try {
				list = UtilFactory.getInstanceOfExcelUtilHandleDepartmentVo().ImportFromExcel(file, 0);
				list.remove(0);
				if (list.size() > 0) {
					logger.info("取值成功，文件信息存在");
				} else {
					logger.info(list.size() == 0);
				}
			} catch (IOException e) {
				logger.error("文件不存在:" + e.getMessage());
			}
			model.addAttribute("departmentList", list);
			return "util/departmentVo_list";

		}

}
