package com.ManyToOne_mapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CollegeDao {

		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		public String saveCollege(College c) {
			
			entityTransaction.begin();
			entityManager.persist(c);
			entityTransaction.commit();
			return "college is saved";
			
		}
		
		public String saveStudent(Student s) {
			
			entityTransaction.begin();
			entityManager.persist(s);
			entityTransaction.commit();
			return "student is saved";
			
		}
		
		public College getCollege(int id) {
			return  entityManager.find(College.class,id);
		}
	
			
		public Student getStudent(int id) {
			return entityManager.find(Student.class,id);
			
		}
		
		public String updateCollege(College c) {
			entityTransaction.begin();
			entityManager.merge(c);
			entityTransaction.commit();
			return "college is updated";
		}
		
		public String updateStudent(Student s) {
			entityTransaction.begin();
			entityManager.merge(s);
			entityTransaction.commit();
			return "student is updated";
		}
		
		public List<Student> getAll() {
			
			Query query=entityManager.createQuery("select alias from Student alias");
			return query.getResultList();
			
		}
		
		public String deleteStudent(int id) {
			
			Student s=this.getStudent(id);
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
			return "Student is deleted";
			
		}
		
		
	public String deleteCollege(int id) {
			
			College c=this.getCollege(id);
			entityTransaction.begin();
			entityManager.remove(c);
			entityTransaction.commit();
			return "college is deleted";
			
		}
}
