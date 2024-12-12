/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// firstInt
		System.out.print("Please enter an integer: ");
		int firstInt = sc.nextInt();
		//secondInt
		System.out.print("Please enter another integer: ");
		int secondInt = sc.nextInt();
		
		//call divisiblility methods
		checkDivisibility(firstInt);
		System.out.println("");
		checkDivisibility(secondInt);
		
	}
	
	private static void checkDivisibility(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is divisible by 2! ");
	} else {
		System.out.println(number + " is not divisible by 2! ");
	}
		boolean divisible = false;
		for (int i = 3; i <= 5; i++) {
			if (number % i == 0) {
				System.out.println(number + " is divisible by " + i + "!");
				divisible = true;
			}
		}
		
		if(!divisible) {
			System.out.println(number + " is not divisible by 3, 4, or 5!");
		}
	}
}

