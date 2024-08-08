package com.crimsonlogic.employee;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
	private double salary;
	private static String empId;
	private String empName;
	private String empState;
	private String empCity;
	private String empAge;
	private String empAddress;
	private LocalDate empDob;
	public Employee() {
		super();
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getempId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpAge() {
		return empAge;
	}
	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public LocalDate getEmpDob() {
		return empDob;
	}
	public void setEmpDob(LocalDate empDob) {
		this.empDob = empDob;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", empName=" + empName + ", empState=" + empState + ", empCity=" + empCity
				+ ", empAge=" + empAge + ", empAddress=" + empAddress + ", empDob=" + empDob + "]";
	}

}
