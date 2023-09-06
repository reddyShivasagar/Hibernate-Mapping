package com.ManyToOne_mapping;

public class UpdateController {

	public static void main(String[] args) {
		
		College c=new College();
		c.setId(101);
		c.setCollegeName("shree shivayogi tadola");
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("vishal");
		
		//setting college object to student object
		s1.setCollege(c);
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("viresh");
		
		s2.setCollege(c);
		
		CollegeDao dao=new CollegeDao();
		System.out.println(dao.updateCollege(c));
		System.out.println(dao.updateStudent(s1));
		System.out.println(dao.updateStudent(s2));
		
		
		
	}
}
