package com.ManyToOne_mapping;

public class CollegeController {

	public static void main(String[] args) {
		
		//step1
		College college=new College();
		college.setId(102);
		college.setCollegeName("Allamprabhu College");
		
		//step2
		Student s1=new Student();
		s1.setId(3);
		s1.setName("hanumant");
		
		//setting college to student object
		s1.setCollege(college);
		
		//step3
		Student s2=new Student();
		s2.setId(4);
		s2.setName("ramaratan");
		
		//setting college to student object
		s2.setCollege(college);
		
		CollegeDao dao=new CollegeDao();
		
		dao.saveCollege(college);
		dao.saveStudent(s1);
		dao.saveStudent(s2);
		
	}
}
