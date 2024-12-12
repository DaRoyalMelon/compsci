/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please pick a number betweeen 1-1000");
		int x = sc.nextInt();
		int min = 1;
		int max = 1000;
		int y = (int)(Math.random() * (max - min) + min);
		
		if(x == y){
			System.out.println("You Guessed the random number!!");
		}
		else if(x != y){
			System.out.println("You did not guess the number");
			System.out.println("The number was: " + y);
		}else{
			System.out.println("Please enter a valid number");
		}
	}
}
