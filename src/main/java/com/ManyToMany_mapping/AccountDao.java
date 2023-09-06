package com.ManyToMany_mapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AccountDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public String saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user.getUserName()+" is saved";
		
	}
	
	public String saveAccount(Account account) {
		entityTransaction.begin();
		entityManager.persist(account);
		entityTransaction.commit();
		
		return account.getAppName()+" is saved";
		
	}
	
	public List<User> getAllUser() {
		
		Query query=entityManager.createQuery("select alias from User alias");
		return query.getResultList();
		
	}
	
    public List<Account> getAllAccounts() {
		
		Query query=entityManager.createQuery("select alias from Account alias");
		return query.getResultList();
		
	}
	
    public User getUser(int id) {
    	return entityManager.find(User.class, id);
		
	}
    
    public Account getAccounts(int id) {
		return entityManager.find(Account.class,id);
		
	}
    
    public String updateUser(User u) {
    	
    	entityTransaction.begin();
    	entityManager.merge(u);
    	entityTransaction.commit();
		return u.getUserName()+" is updated";
		
	}
	
}
