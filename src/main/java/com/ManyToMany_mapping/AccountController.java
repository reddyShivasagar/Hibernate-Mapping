package com.ManyToMany_mapping;

import java.util.ArrayList;

public class AccountController {

	public static void main(String[] args) {
		
		User u1=new User();
		u1.setId(3);
		u1.setUserName("prashant");
		
		Account a1=new Account();
		a1.setId(101);
		a1.setAppName("Instagram");
		
		Account a2=new Account();
		a2.setId(102);
		a2.setAppName("facebook");
		
		ArrayList<Account> accounts=new ArrayList<Account>();
		accounts.add(a1);
		accounts.add(a2);
		
		
		//setting accont to first user ravi
		u1.setAccounts(accounts);
		
		User u2=new User();
		u2.setId(4);
		u2.setUserName("Sagar");
		
		u2.setAccounts(accounts);
		
		AccountDao dao=new AccountDao();
//		dao.saveAccount(a1);
//		dao.saveAccount(a2);
//		
		
		dao.saveUser(u1);
		dao.saveUser(u2);
	}
}
