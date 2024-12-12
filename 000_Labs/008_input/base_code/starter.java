/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("What month were you born in?");
		int month = sc.nextInt();
		System.out.println("What day were you born on?");
		int day = sc.nextInt();
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty? (0.0-#)");
		double fifty = sc.nextDouble();
		
		System.out.println("Hello, " + name + "! You were born on " + month + "/" + day + "/" + year + " making you " + age + " years old. ");
		System.out.println("I'm glad you know  buck fifty is " + fifty + "!");
		
		sc.close();
	}
}
