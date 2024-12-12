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
		michael.employeeToString();
		Employee dwight = new Employee(1987,"Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		Employee jum = new Employee(2474, "Jim", "Halpert", 4416.66);
		jum.employeeToString();
	}
}
