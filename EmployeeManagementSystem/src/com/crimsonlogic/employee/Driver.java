package com.crimsonlogic.employee;

public class Driver {

	public static void main(String[] args) {
		EmployeeOperations emp=new EmployeeOperations();
		ProgrammerOperations po=new ProgrammerOperations();
		System.out.println("Know your bonus by entering details ");
		emp.EnterEmployeeDetails();
		
		po.addSkills();
		po.displaySkills();
		
	}

}
