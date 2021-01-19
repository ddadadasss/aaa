package cn.kgc.mapper;

import cn.kgc.pojo.Account;

public interface AccountMapper {
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
	Integer updateAccount(Account account);
}
