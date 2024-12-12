/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your title? Ex: KidDanger2448");
        String title = sc.nextLine();
        System.out.println("Would you like to be a Warrior, Wizard, or Rogue? ");
        String Char = sc.nextLine();

        String x = "Warrior";
        String y = "Wizard";
        String z = "Rogue";

        int S = 0, D = 0, I = 0, C = 0;
        int Tp = 20; // Total points

        if (Char.equals(x)) {
            System.out.println("You have chosen Warrior! For honor!");
        } else if (Char.equals(y)) {
            System.out.println("You have chosen Wizard! May the force be with you!");
        } else if (Char.equals(z)) {
            System.out.println("You have chosen Rogue! Shadows are your home, and deceit is your weapon!");
        } else {
            System.out.print("You've decided not to choose a role. Rerun the program.");
            return; // Exit the program if the choice is invalid
        }

        System.out.println(" ");
        System.out.print("You have 20 skill points to spend in the following:: ");
        System.out.println("Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
        System.out.println(" ");

        while (Tp > 0) {
            // Allocate Strength
            System.out.println("Points left: " + Tp);
            System.out.print("Strength (0-10): ");
            S = sc.nextInt();
            if (S < 0 || S > 10) {
                System.out.println("Strength must be between 0-10.");
                continue;
            }
            Tp -= S;

            // Allocate Dexterity
            System.out.println("Points left: " + Tp);
            System.out.print("Dexterity (0-10): ");
            D = sc.nextInt();
            if (D < 0 || D > 10) {
                System.out.println("Dexterity must be between 0-10.");
                continue;
            }
            Tp -= D;

            // Allocate Intelligence
            System.out.println("Points left: " + Tp);
            System.out.print("Intelligence (0-10): ");
            I = sc.nextInt();
            if (I < 0 || I > 10) {
                System.out.println("Intelligence must be between 0-10.");
                continue;
            }
            Tp -= I;

            // Allocate Charisma
            System.out.println("Points left: " + Tp);
            System.out.print("Charisma (0-10): ");
            C = sc.nextInt();
            if (C < 0 || C > 10) {
                System.out.println("Charisma must be between 0-10.");
                continue;
            }
            Tp -= C;

            // Validate point distribution
            if (Tp < 0) {
                System.out.println("You have spent too many points. Please try again.");
                // Reset
                Tp += (S + D + I + C);
                S = D = I = C = 0;
            } else {
                break;
            }
        }

        System.out.println("_____________________________________________________");
        System.out.println("You are " + name + ", the " + title + " of CVHS");
        System.out.println("You are a " + Char + " with the following stats: ");
        System.out.println("Strength - " + S);
        System.out.println("Dexterity - " + D);
        System.out.println("Intelligence - " + I);
        System.out.println("Charisma - " + C);
    }
}
