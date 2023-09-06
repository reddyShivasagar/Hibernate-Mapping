package com.ManyToOne_mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {

	@Id
	private int id;
	private String collegeName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", collegeName=" + collegeName + "]";
	}
	
	
}
