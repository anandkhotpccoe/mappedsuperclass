package com.path.mappedsuperclass.model;

import javax.persistence.Entity;

@Entity
public class Employee  extends User{
	
	
	
	private Float salary;

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	

}
