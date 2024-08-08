package com.crimsonlogic.employee;

import java.util.ArrayList;
import java.util.List;

public class Programmer extends Employee{
public static int  bonus;
public int certificates;
public  List<String> skills=new ArrayList<>();;
public int stocks;
public int getBonus() {
	return bonus;
}

public void setBonus(int bonus) {
	this.bonus = bonus;
}

public List<String> getSkills() {
	return skills;
}

public void setSkills(List<String> skills) {
	this.skills = skills;
}

public void noOfCertificates(int certificate) {
	this.certificates=certificate;

}

public int getStocks() {
	return stocks;
}

public void setStocks(int stocks) {
	this.stocks = stocks;
}

	
}
 
