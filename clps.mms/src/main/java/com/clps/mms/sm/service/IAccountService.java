
package com.clps.mms.sm.service;

import java.util.List;

import com.clps.mms.sm.pojo.Account;
import com.clps.mms.sm.vo.AccountVo;

public interface  IAccountService{
	/**
	        * @desc:查询账户的信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:12:54
			* @param account
			* @return List<Account>
	 */
	public List<Account> queryAccountInfoById(String accountId);

	/**
	        * @desc:查询所有的账户信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:13:30
			* @return List<Account>
	 */
	public List<Account> queryAllAccountInfo();
	
	/**
	        * @desc:新增账户的信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:13:51
			* @param account
			* @return int
	 */
	public int saveAccountInfo(Account account);
	
	/**
	        * @desc:更新账户的信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:14:12
			* @param account
			* @return int
	 */
	public int editAccountInfo(Account account);
	
	/**
	        * @desc:删除账户的信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:14:33
			* @param account
			* @return int
	 */
	public int deleteAccountInfoById(String accountId);

	/**
	        * @desc:模糊查询账户的信息
			* @author: sea
			* @createTime: 2018年5月8日 上午11:14:54
			* @history:
			* @param account
			* @return List<Account>
	 */
	public List<Account> queryAccountInfoByLike(String account);
	
	/**
	        * @desc:将账户中的其他id转化为名称
			* @author: sea
			* @createTime: 2018年5月8日 下午2:30:38
			* @history:
			* @param account 账户
			* @return VO 
	 */
	public AccountVo accountDisplay(Account account);
	
	
    public int queryAccountCount();
    
    public List<Account> findByPaging(Integer toPageNo) throws Exception;
}

