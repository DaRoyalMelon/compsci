/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int x = sc.nextInt();
		System.out.print("Please enter another number: ");
		int y = sc.nextInt();
		System.out.print("Please enter one more number: ");
		int z = sc.nextInt();
		
		if((x == y) && (x == z)){
			System.out.println("All your numers are the same");
		}
		else if((x > y) && (x > z)){
			System.out.println("Your first number is greater than both your second and last");
		}
		else if(x > y){
			System.out.println("Your first number is bigger than your second");
		}
		else if((y > x) && (y > z)){
			System.out.println("Your second number is greater than your first and last");
		}
		else if(y > x){
			System.out.println("Your second number is greater than your first");
		}
		else if(z > y){
			System.out.println("Your Last number is greater than your second");
		}
		else if(y > z){
			System.out.println("Your second number is greater than your last");
		}
		else if(x > z){
			System.out.println("Your first number is greater than your last");
		}
		else if((z > x) && (z > y)){
			System.out.println("Your last number is greater than your first and second");
		}
		else if(z > x){
			System.out.println("Your last number is greater than your first");
		}
	}
}
