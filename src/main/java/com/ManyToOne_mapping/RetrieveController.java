package com.ManyToOne_mapping;

import java.util.List;

public class RetrieveController {

	public static void main(String[] args) {
		
		CollegeDao dao=new  CollegeDao();
		
		Student s=dao.getStudent(1);
		Student s2=dao.getStudent(3);
		
		College c=dao.getCollege(101);
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(c);
		
		System.out.println("**********************");
		List<Student> students=dao.getAll();
		
		System.out.println(students);
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
