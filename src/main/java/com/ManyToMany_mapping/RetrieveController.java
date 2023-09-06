package com.ManyToMany_mapping;

import java.util.List;

public class RetrieveController {

	public static void main(String[] args) {
		AccountDao dao=new AccountDao();
		
		List<User> users=dao.getAllUser();
		
		System.out.println(users);
		
		
		List<Account> accounts=dao.getAllAccounts();
		
		System.out.println(accounts);
		
		System.out.println();
		System.out.println();
		
		System.out.println(dao.getUser(1));
		System.out.println(dao.getAccounts(102));
	}
}
