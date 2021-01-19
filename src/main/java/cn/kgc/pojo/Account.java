package cn.kgc.pojo;

import org.springframework.stereotype.Component;

/**
 * 账户实体类
 * @author Administrator
 *
 */
@Component
public class Account {
	private Integer id;
	private String account_number;
	private String account_pwd;
	private Double account_money;
	private Integer account_status;
	private String creation_time;
	public Account(Integer id, String account_number, String account_pwd, Double account_money, Integer account_status,
			String creation_time) {
		super();
		this.id = id;
		this.account_number = account_number;
		this.account_pwd = account_pwd;
		this.account_money = account_money;
		this.account_status = account_status;
		this.creation_time = creation_time;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", account_number=" + account_number + ", account_pwd=" + account_pwd
				+ ", account_money=" + account_money + ", account_status=" + account_status + ", creation_time="
				+ creation_time + "]";
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the account_number
	 */
	public String getAccount_number() {
		return account_number;
	}
	/**
	 * @param account_number the account_number to set
	 */
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	/**
	 * @return the account_pwd
	 */
	public String getAccount_pwd() {
		return account_pwd;
	}
	/**
	 * @param account_pwd the account_pwd to set
	 */
	public void setAccount_pwd(String account_pwd) {
		this.account_pwd = account_pwd;
	}
	/**
	 * @return the account_money
	 */
	public Double getAccount_money() {
		return account_money;
	}
	/**
	 * @param account_money the account_money to set
	 */
	public void setAccount_money(Double account_money) {
		this.account_money = account_money;
	}
	/**
	 * @return the account_status
	 */
	public Integer getAccount_status() {
		return account_status;
	}
	/**
	 * @param account_status the account_status to set
	 */
	public void setAccount_status(Integer account_status) {
		this.account_status = account_status;
	}
	/**
	 * @return the creation_time
	 */
	public String getCreation_time() {
		return creation_time;
	}
	/**
	 * @param creation_time the creation_time to set
	 */
	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}

}
