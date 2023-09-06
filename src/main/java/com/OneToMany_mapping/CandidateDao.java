package com.OneToMany_mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CandidateDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public String saveCandidate(Candidate c) {
		entityTransaction.begin();
		entityManager.persist(c);
		entityTransaction.commit();
		
		return "Candidate is saved";
		
	}
	
	public String saveCourse(Course c) {
		entityTransaction.begin();
		entityManager.persist(c);
		entityTransaction.commit();
		return "course is saved";
		
	}
}
