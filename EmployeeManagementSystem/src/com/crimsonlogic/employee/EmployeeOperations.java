package com.crimsonlogic.employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeOperations extends Employee {
	Scanner sc=new Scanner(System.in);
	Programmer p=new Programmer();
	int bonus;
	public int checkBonus(double salary) {
		 
		 if(getSalary()>40000) {
			 bonus=(int) (getSalary()*0.02);
			 p.setBonus(bonus);
			 }
		 else if(
			 getSalary()<40000) {
				 bonus=(int) (getSalary()*0.04);
				 p.setBonus(bonus);
		 }
		return bonus ;
	 }
	
	public void EnterEmployeeDetails() 
	{   
		System.out.println("Enter the Employee Id");
		setEmpId(sc.nextLine());
		System.out.println("Enter the Employee name");
		setEmpName(sc.nextLine());
		System.out.println("Enter the Employee salary");
		setSalary(sc.nextDouble());		
		int b=checkBonus(getSalary());
		System.out.println("your bonus is "+b);
		
	}
	
}