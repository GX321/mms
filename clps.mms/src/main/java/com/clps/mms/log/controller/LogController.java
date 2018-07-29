package com.clps.mms.log.controller;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clps.mms.log.pojo.Log;
import com.clps.mms.log.service.ILogService;
import com.clps.mms.sm.pojo.Account;

/**
 * 
 * @author peri.yao
 *
 * 2018年5月15日下午4:09:39
 *
 */

@Controller
@RequestMapping(value="/sm")
public class LogController {

	@Resource
	private ILogService logService;
	
	@RequestMapping(value="/logList")
	public String showLogs(Model model){
		List<Log> logs= logService.showLogs();
		model.addAttribute("logs", logs);
		
		return "sm/log_list";
	}
	
	@RequestMapping(value="/logQuery", method = RequestMethod.POST)
	public String showLogsByOperatorName(HttpServletRequest request, HttpServletResponse response, Model model){
		String logOperatorName = request.getParameter("logOperatorName");
		List<Log> logs= logService.showOperatorNames(logOperatorName);
		model.addAttribute("logs", logs);
		
		return "sm/log_list";
	}
	
	
	
	@RequestMapping(value = "/logAdd", method = RequestMethod.GET)
	public String addlog() {
		return "sm/log_add";
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/saveLog", method = RequestMethod.POST)
	public String saveLogInfo(HttpServletRequest request,Log log)throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		log.setLogOperationTime("");
		log.setLogOperatorName("");
		log.setLogOperationObject("");
		log.setLogOperationKind("");
		log.setLogOperationComment("");
	
		if (logService.saveLog(log)!=null)
			return "success";
		return "failure";
	}
}
