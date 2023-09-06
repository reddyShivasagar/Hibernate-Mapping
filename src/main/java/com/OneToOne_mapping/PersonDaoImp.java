package com.OneToOne_mapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class PersonDaoImp {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void savePerson(Person person) {
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		System.out.println("Person is saved");
	}
	public void saveAadhar(Aadhar aadhar) {
		entityTransaction.begin();
		entityManager.persist(aadhar);
		entityTransaction.commit();
		System.out.println("Adhar is saved");
	}
	
	public Person getPerson(int id) {
		return entityManager.find(Person.class,id);
		
	}
	
	
	//Not required
	
	public void updatePerson(Person person) {
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
		System.out.println("Updated in person");
	}
	
	public void updateAadhar(Aadhar aadhar) {
		entityTransaction.begin();
		entityManager.merge(aadhar);
		entityTransaction.commit();
		System.out.println("Updated in aadhar");
	}
	
	public void deletePerson(int id) {
		
		Person person=getPerson(id);
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
		System.out.println("Deleted in person");
	}
	
    public void deleteAadhar(int id) {
		
    	Aadhar aadhar=entityManager.find(Aadhar.class,id);
    	entityTransaction.begin();
		entityManager.remove(aadhar);
		entityTransaction.commit();
		System.out.println("Deleted in aadhar");
	}
	
		
	public void getAllPersons() {
		Query query=entityManager.createQuery("select alias from Person alias");
		//JPQL query required alias
       List<Person> list=query.getResultList();
        System.out.println(list);		
	}
}
