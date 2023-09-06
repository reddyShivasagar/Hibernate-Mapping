package com.OneToOne_mapping;

public class PersonController {

	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.setId(3);
		p1.setName("sham");
		
		
		Aadhar a1=new Aadhar();
		a1.setId(103);
		a1.setCity("bidar");
		
		
		p1.setAadhar(a1);
		
		PersonDaoImp dao=new PersonDaoImp();
		
		//save the data
		dao.saveAadhar(a1);
		dao.savePerson(p1);

		//update the data
//		dao.updatePerson(p1);
//		dao.updateAadhar(a1);
		
	
		//delete the data
//		dao.deletePerson(1);
//		dao.deleteAadhar(101);

		// the data
	//
		System.out.println(dao.getPerson(1));
		dao.getAllPersons();
	}
}
