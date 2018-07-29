package com.clps.mms.sm.controller;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clps.mms.sm.service.IAccountService;
import com.clps.mms.sm.service.IDepartmentService;
import com.clps.mms.sm.service.IPositionService;
import com.clps.mms.sm.service.IRoleService;
import com.clps.mms.sm.pojo.Account;
import com.clps.mms.sm.pojo.Department;
import com.clps.mms.sm.pojo.Position;
import com.clps.mms.sm.pojo.Role;
import com.clps.mms.sm.vo.AccountVo;
import com.clps.mms.util.paging.PagingVO;


/**
 * 
 * @desc: AccountController类,负责Account相关的请求处理
 * @author: sea.zhang
 * @createTime: 2018年5月14日 下午1:21:10
 * @version: v1.0
 */
@Controller
@RequestMapping("/sm")
public class AccountController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	public IAccountService ser;
	
	@Autowired
	public IPositionService poser;
	
	@Autowired
	public IDepartmentService depser;

	@Autowired
	public IRoleService rolser;
	
	/**
	 * 
	 * @desc:模糊查询账户信息
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午1:23:19
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 *             String
	 */
	@RequestMapping(value = "/accountQuery", method = RequestMethod.GET)
	public String queryAccountInfoByLike(Model model, HttpServletRequest request, HttpServletResponse response)throws UnsupportedEncodingException {
		response.setHeader("content-type", "text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String account = request.getParameter("account");
		List<Account> list = ser.queryAccountInfoByLike(account);
		List<AccountVo> volist = new ArrayList<>();
		for (Account acc : list) {
			AccountVo vo = ser.accountDisplay(acc);
			volist.add(vo);
		}
		model.addAttribute("account", volist);
		return "sm/account_query";
	}

	/**
	 * 
	 * @desc:查询所有账户信息
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午1:23:48
	 * @param model
	 * @return String
	 * @throws Exception 
	 */
	@RequestMapping(value = "/accountList", method = RequestMethod.GET)
	public String queryallAccountInfo(Model model,Integer page) throws Exception {
		
		List<Account> list = null;
        //页码对象
        PagingVO pagingVO = new PagingVO();
        //设置总页数
        pagingVO.setTotalCount(ser.queryAccountCount());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            list = ser.findByPaging(1);
        } else {
            pagingVO.setToPageNo(page);
            list = ser.findByPaging(page);
        }
       
		List<AccountVo> volist = new ArrayList<>();
		for (Account acc : list) {
			AccountVo vo = ser.accountDisplay(acc);
			volist.add(vo);
		}
		model.addAttribute("pagingVO", pagingVO);
		model.addAttribute("list", volist);
		return "sm/account_list";
	}

	/**
	 * 
	 * @desc:新增账户信息
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午1:25:42
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 *             String
	 */
	@RequestMapping(value = "/accountAdd", method = RequestMethod.POST)
	public String saveAccountInfo(HttpServletRequest request,Account account)throws UnsupportedEncodingException {
		String loginname=(String)request.getSession().getAttribute("account");
		int loginid=ser.queryAccountInfoById(loginname).get(0).getAccountId();
		request.setCharacterEncoding("utf-8");
		account.setAccountCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		account.setAccountUpdatedDatetime(new Timestamp(System.currentTimeMillis()));
		account.setAccountCreatedName(loginid);
		account.setAccountUpdatedName(loginid);
		account.setIsVisible(1);
	    
		List<Account>  accountlist=ser.queryAllAccountInfo();
		for(Account acc:accountlist)
			if(acc.getAccount().equals(account.getAccount()))
			{
				request.getSession().setAttribute("flag","-1");
			    return "sm/account_add";
			}
		
		if (ser.saveAccountInfo(account) > 0)
		{   request.getSession().setAttribute("flag","1");
			return "sm/account_add";
		}
		else{
		    return "";
		}
	}

	/**
	 * 
	 * @desc:编辑账户信息
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午1:26:14
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 *             String
	 */
	@RequestMapping(value = "/accountEdit", method = RequestMethod.POST)
	public String updateAccountInfo(HttpServletRequest request,Account account)throws UnsupportedEncodingException {
		String loginname=(String)request.getSession().getAttribute("account");
		int loginid=ser.queryAccountInfoById(loginname).get(0).getAccountId();
		request.setCharacterEncoding("utf-8");
		account.setAccountUpdatedDatetime(new Timestamp(System.currentTimeMillis()));
		account.setAccountUpdatedName(loginid);
		
		if (ser.editAccountInfo(account) > 0)
			{   request.getSession().setAttribute("flag","1");
			   return "sm/account_list";
		    }
		   else{
			   request.getSession().setAttribute("flag","-1");
		       return "sm/account_list";
		    }
	}

	/**
	 * 
	 * @desc:删除账户信息
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午1:26:29
	 * @param request
	 * @return String
	 */
	@RequestMapping(value = "/accountDelete", method = RequestMethod.GET)
	public String deleteAccountInfo(HttpServletRequest request) {
		String name = request.getParameter("account");
		if (ser.deleteAccountInfoById(name) > 0)
		{   request.getSession().setAttribute("flag","1");
		   return "sm/account_list";
	    }
	   else{
		   request.getSession().setAttribute("flag","-1");
	       return "";
	    }
	}

	/**
	 * 
	 * @desc:跳转到新增账户信息页面
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午1:26:47
	 * @param model
	 * @return String
	 */
	@RequestMapping("/addview")
	public String addview(Model model) {
		List<Position> poslist=null;
		List<Department> deplist=null;
		List<Role> rolist=null;
		rolist=rolser.showRole();
		model.addAttribute("rolist",rolist);
		deplist=depser.queryAllDepartment();
		model.addAttribute("deplist",deplist);
		poslist=poser.showPosition();
		model.addAttribute("poslist",poslist);
		return "sm/account_add";
	}


	
	/**
	 * 
	 * @desc:跳转到编辑用户信息页面
	 * @author: sea.zhang
	 * @createTime: 2018年5月14日 下午1:27:29
	 * @param request
	 * @param model
	 * @return String
	 */
	@RequestMapping("/editview")
	public String updateview(HttpServletRequest request, Model model) {
		
		String account = request.getParameter("account");
		List<Account> accountlist = ser.queryAccountInfoById(account);
		List<Position> poslist=null;
		List<Department> deplist=null;
		List<Role> rolist=null;
		rolist=rolser.showRole();
		model.addAttribute("rolist",rolist);
		deplist=depser.queryAllDepartment();
		model.addAttribute("deplist",deplist);
		poslist=poser.showPosition();
		model.addAttribute("poslist",poslist);
		model.addAttribute("account", accountlist);
		return "sm/account_edit";
	}
	
	@RequestMapping("/editPass")
	public String updatePass(HttpServletRequest request, Model model)
	{
		return "sm/sendmail_forgetpass";
	}
	
	
	

}
