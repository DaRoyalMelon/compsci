/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please pick a number 1 - 1000");
		int x = sc.nextInt();
		int min = 1;
		int max = 1000;
		int y = (int)(Math.random() * (max - min) + min);
		
		if(x > max || x < min){
			System.out.println("Please enter a valid number");
		}
		else if(x != y){
			System.out.println("You did not guess the number");
			System.out.println("The number was: " + y);
		}
		
		if(x > y){
			System.out.println("Your number was bigger than the number.");
		}
		else if(x < y){
			System.out.println("Your number was smaller than the number.");
		}
		else if (x == y){
			System.out.println("You guessed the number!!!");
		}
	}	
}
