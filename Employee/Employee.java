package com.xworkz.collection.Employee;

public class Employee {
	private String emplName;
	private String emplCity;

	public Employee(String emplName, String emplCity) {
		this.emplName = emplName;
		this.emplCity = emplCity;
	}

	public String getEmplName() {
		return emplName;
	}

	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	public String getEmplCity() {
		return emplCity;
	}

	public void setEmplCity(String emplCity) {
		this.emplCity = emplCity;
	}

	@Override
	public String toString() {
		return " [emplName=" + emplName + ", emplCity=" + emplCity + "]";
	}

}
