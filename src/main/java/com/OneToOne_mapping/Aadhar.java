package com.OneToOne_mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhar {

	@Id
	private int id ;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", city=" + city + "]";
	}
	
	
}
