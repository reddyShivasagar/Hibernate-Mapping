package com.ManyToMany_mapping;

import java.util.ArrayList;

public class UpdateController {

	public static void main(String[] args) {
		 
		
		User u1=new User();
		
		u1.setId(3);
		u1.setUserName("prashant kumar");
		
		Account a1=new Account();
		a1.setId(101);
		a1.setAppName("Instagram");
		
		Account a2=new Account();
		a2.setId(102);
		a2.setAppName("Facebook");
		
		//collecting account
		ArrayList<Account> accounts=new ArrayList<Account>();
		accounts.add(a1);
		accounts.add(a2);
		
		//setting accont to the 1st user
		u1.setAccounts(accounts);
		
		AccountDao  dao=new AccountDao();
	   String string=	dao.updateUser(u1);
	   System.out.println(string);
	}
}
