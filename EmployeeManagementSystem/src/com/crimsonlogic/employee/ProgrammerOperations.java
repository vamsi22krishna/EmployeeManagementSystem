package com.crimsonlogic.employee;

import java.util.List;
import java.util.Scanner;

public class ProgrammerOperations extends Programmer {
     Scanner sc=new Scanner(System.in);
	public void addSkills() {
		 System.out.println("insert skills ");
	     
	skills.add(sc.nextLine());
	skills.add(sc.nextLine());
	skills.add(sc.nextLine());
  System.out.println("Insertion of skills successful");
	     
	}
	
	public void displaySkills() {
		System.out.println("employee skills");
		for (String skill : skills) {
	        System.out.println(skill);
		
	}
	
}
}
