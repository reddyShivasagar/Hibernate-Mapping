package com.ManyToOne_mapping;

public class DeleteController {

	public static void main(String[] args) {
		
		CollegeDao dao=new CollegeDao();
		
		System.out.println(dao.deleteStudent(4));
		System.out.println(dao.deleteStudent(3));
		System.out.println(dao.deleteCollege(102));
	}
}
