package com.bridgelabz.EmployeePayrollAppDTO;

public class DTO {
	
	public String name;
	public long salary;

	public DTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + "]";
	}

}