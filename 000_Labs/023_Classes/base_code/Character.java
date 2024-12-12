/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	int constitution;
	
	public Character(String role, int strength, int dexterity, int intellegince, int charisma, int constitution) {
		this.role = role;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.charisma = charisma;
		this.constitution = constitution;
	}
	
	public String getRole(){
		return role;
	}
	public int getStrength(){
		return strength;
	}
	public int getDexterity(){
		return dexterity;
	}
	public int getIntelligence(){
		return intelligence;
	}
	public int getCharisma(){
		return charisma;
	}
	public int getConstitution(){
		return constitution;
	}
	
	public void displayCharacterInfo(){
		System.out.println("Role: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		System.out.println("Constitution: " + constitution);
	}
		
	public static void main(String args[]) {
		
		Character wizard = new Character("Wizard", 5, 5, 5, 5, 5);
		
		wizard.displayCharacterInfo();
		System.out.println();
		



		
	}
}
