package cn.kgc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kgc.pojo.Account;
import cn.kgc.service.AccountService;

@Controller
@RequestMapping("account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private Account account;
	/**
	 * 登录
	 * @param number
	 * @param pwd
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String index(String number,String pwd,Model model,HttpServletRequest request,HttpServletResponse response) {
		account = new Account();
		account.setAccount_number(number);
		account.setAccount_pwd(pwd);
		account = accountService.getAccount(account);
		if (account!=null) {
			model.addAttribute("account",account);
			return "index";
		} else {
			try {
				response.getWriter().print("<script>alert('用户名或者密码不正确');history.back();</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
	}
	@RequestMapping("withdrawal")
	public String withdrawal(String money,Model model,HttpServletRequest request,HttpServletResponse response) {
		Double money1 = accountService.updateAccount(Double.parseDouble(money), account);
		if (money1.equals(-1.0)) {
			try {
				response.getWriter().print("<script>alert('取款失败，余额不足');history.back();</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		} else {
			account.setAccount_money(money1);
			model.addAttribute("money",money1);
			return "withdrawal";
		}
	}
	@RequestMapping("flag")
	public String flag(Model model) {
			model.addAttribute("account",account);
			return "index";
	}
}
