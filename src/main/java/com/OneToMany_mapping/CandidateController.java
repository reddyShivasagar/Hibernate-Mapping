package com.OneToMany_mapping;

import java.util.ArrayList;

public class CandidateController {

	public static void main(String[] args) {
		
		Candidate candidate=new Candidate();
		candidate.setId(2);
		candidate.setName("ravi");
		
		Course c1=new Course();
		c1.setId(103);
		c1.setCourse("pyton");
		c1.setDuration(40);
		
		Course c2=new Course();
		c2.setId(104);
		c2.setCourse("html");
		c2.setDuration(15);
		
		ArrayList<Course> courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		
		//set the list of course to candidate
		candidate.setCourses(courses);
		
		CandidateDao dao=new CandidateDao();
		
		
		dao.saveCourse(c1);
		dao.saveCourse(c2);
		
		dao.saveCandidate(candidate);
	}
}
