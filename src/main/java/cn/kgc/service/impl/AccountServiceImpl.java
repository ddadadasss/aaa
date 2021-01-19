package cn.kgc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kgc.mapper.AccountMapper;
import cn.kgc.pojo.Account;
import cn.kgc.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountMapper accountMapper;
	@Override
	public Account getAccount(Account account) {
		return accountMapper.getAccount(account);
	}

	@Override
	public Double updateAccount(Double money, Account account) {
		if (money<=account.getAccount_money()) {
			account.setAccount_money(account.getAccount_money()-money);
			accountMapper.updateAccount(account);
			return account.getAccount_money();
		} else {
			return -1.0;
		}
	}
	
}
