/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	 	Scanner sc = new Scanner(System.in);
	 	
	 	int n;
	 	
	 	int min = 0;
		int max = 1000;
	 	int sn = (int)(Math.random() * (max - min) + min);
	 	
	 	while(true){
	 		System.out.print("Guess a number: ");
	 		n = sc.nextInt();
	 		
	 		if(n < sn){
	 			System.out.println("You're a little too low!");
	 		}
	 		else if(n > sn){
	 			System.out.println("You're a little too high!");
	 		}
	 		else if(n == sn){
	 			System.out.println("You guessed it! Good Job!!");
	 			break;
	 		}
	 	}	
	}
}
