package com.clps.mms.sm.service.impl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clps.mms.sm.service.IAccountService;
import com.clps.mms.sm.dao.AccountMapper;
import com.clps.mms.sm.pojo.Account;
import com.clps.mms.sm.vo.AccountVo;
import com.clps.mms.util.paging.PagingVO;

/**
 * 
		* @desc: clps.mms
		* @author: sea.zhang
		* @createTime: 2018年5月15日 上午9:03:58
		* @version: v1.0
 */
@Service("service")
public class AccountServiceImpl implements IAccountService,Serializable{
		
private static final long serialVersionUID = 1L;
@Autowired
public AccountMapper mapper;	

/**
 * @desc：查询账户账户信息
 */

public List<Account> queryAccountInfoById(String accountId){ 
	return mapper.queryAccountInfoById(accountId);
}

/**
 * @desc：查询所有的账户信息
 */
public List<Account> queryAllAccountInfo(){ 
	return mapper.queryAllAccountInfo();
}
/**
 * @desc：新增账户信息
 */
public int saveAccountInfo(Account account){ 
	return mapper.addAccountInfo(account);
}
/**
 * @desc：编辑账户信息
 */
public int editAccountInfo(Account account){ 
	return mapper.updateAccountInfo(account);
}
/**
 * @descx：删除账户信息
 */
public int deleteAccountInfoById(String accountId){ 
	return mapper.deleteAccountInfo(accountId);
}

/**
 * @desc：模糊查询账户信息
 */
public List<Account> queryAccountInfoByLike(String account){
		return mapper.queryAccountInfoByLike(account);	
}

/**
 * @desc：用于账户界面显示
 */
public AccountVo accountDisplay(Account account){
	return mapper.accountDisplay(account);
}

public int queryAccountCount(){
	return mapper.queryAccountCount();
}

public List<Account> findByPaging(Integer toPageNo){
	 PagingVO pagingVO = new PagingVO();
     pagingVO.setToPageNo(toPageNo);

     List<Account> list = mapper.findByPaging(pagingVO);

     return list;
}


}

	