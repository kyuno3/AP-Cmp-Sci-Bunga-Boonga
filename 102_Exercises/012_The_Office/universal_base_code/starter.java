/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.raiseSalary(5);
		michael.employeeToString();
		System.out.println("Annual salary: "+ michael.getAnnualSalary());
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		System.out.println("Annual salary: "+ dwight.getAnnualSalary());
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		System.out.println("Annual salary: "+ jim.getAnnualSalary());
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.raiseSalary(15);
		pam.employeeToString();
		System.out.println("Annual salary: "+ pam.getAnnualSalary());
		Employee daniel = new Employee(1212, "Daniel", "Jang", 4142.21);
		daniel.raiseSalary(10);
		daniel.employeeToString();
		System.out.println("Annual salary: "+ daniel.getAnnualSalary());
	}
}
