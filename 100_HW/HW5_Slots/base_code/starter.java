/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	private static void rules(String message) {
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Player starts with $100. ");
		System.out.println("2. Input a wager less than your total amount of money. ");
		System.out.println("Or go ALL IN! ");
		System.out.println("3. The slot machine will roll 3 numbers from 1 - 10");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
	}
	
	
	private static void play(String message) {
		Scanner sc = new Scanner(System.in);
		
		String wager = ("You have $100. How much would you like to wager? ");
		
		System.out.println("");
		System.out.println("___________________________________________________________");
		System.out.print("Would you like to play the slots? (Yes,yes,Y,y) : ");
		String choice = sc.nextLine();
		
		while (true) {
		if(choice.equals("Yes")) {
			System.out.print(wager);
			break;
		} else if(choice.equals("yes")) {
			System.out.print(wager);
			break;     
		} else if(choice.equals("Y")) {
			System.out.print(wager);
			break;
		} else if(choice.equals("y")) {
			System.out.print(wager);
			break;
		}else {
			System.out.println("That wasn't quite the right answer. Try again. ");
		}
	}
	
	private static void gamble(int number) {
		int min = 1;
		int max = 10;
		int a = (int)(Math.random() * (max - min) - min);
		int b = (int)(Math.random() * (max - min) - min);
		int c = (int)(Math.random() * (max - min) - min);
		
		System.out.print("____________________________________________________");
		System.out.print("| ");
		System.out.print(a);
		System.out.print(" | ");
		System.out.print(b);
		System.out.print(" | ");
		System.out.print(c);
		System.out.print(" |");
		
		if (a == b && b == c) {
			int wage = (wage * 3);
			System.out.println("JACKPOT your wage has Trippled!!");
			System.out.println("You now have: " + wage);
		} else if(a == b) {
			int wage = (wage * 2);
			System.out.println("Your wager has doubled!");
			System.out.println("You now have: " + wage);
		} else if (b == c) {
			int wage = (wage * 2);
			System.out.println("Your wager has doubled!");
			System.out.println("You now have: " + wage);
		}
	}
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int wage = sc.nextInt();
		gamble();
		
		
	}
}
