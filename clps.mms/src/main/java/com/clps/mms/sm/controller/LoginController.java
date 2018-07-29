package com.clps.mms.sm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clps.mms.sm.pojo.Account;
import com.clps.mms.sm.service.IAccountService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	public IAccountService ser;
	
@RequestMapping(value="/doLogon")	
public String doLogon( HttpServletRequest request){
	String account=request.getParameter("account");
	String password=request.getParameter("password");
	List<Account> list=ser.queryAccountInfoById(account);
	if(list.size()!=0&&list.get(0).getAccountPass().equals(password)&&list.get(0).getAccount().equals(account))
		{
		request.getSession().setAttribute("account",account);
		return "index";
		}
	return "redirect:../login.jsp";	
	}
}

	