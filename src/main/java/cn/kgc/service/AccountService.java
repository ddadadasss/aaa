package cn.kgc.service;

import cn.kgc.pojo.Account;

public interface AccountService {
	/**
	 * 根据卡号密码返回账户信息
	 * @param account
	 * @return
	 */
	Account getAccount(Account account);
	/**
	 * 取款
	 * @param account
	 * @return
	 */
	Double updateAccount(Double money,Account account);
}
