/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter what day of the week it is (0-6):");
		int day = sc.nextInt();
		
		if(day == 0){
			System.out.println("It's a weekday! Wake up! It's 7AM!");
		}
		if(day == 1){ 
			System.out.println("It's a weekday! Wake up! It's 7AM!");
		}
		else if(day == 2){
			System.out.println("It's a weekday! Wake up! It's 7AM!");
		}
		else if(day == 3){
			System.out.println("It's a weekday! Wake up! It's 7AM!");
		}
		else if(day == 4){
			System.out.println("It's a weekday! Wake up! It's 7AM!");
		}
		else if(day == 5){
			System.out.println("It's a weekday! Wake up! It's 7AM!");
		}
		else if(day == 6){
			System.out.println("It's the weekend! It's 10AM!");
		}
		else{
			System.out.println("Your input is something not valid!");
		}
	}
}
