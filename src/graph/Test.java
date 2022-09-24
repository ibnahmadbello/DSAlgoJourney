package graph;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		Scanner scanChoice = new Scanner(System.in);
		do {
			System.out.println("Pick an option 1 2 3");
			System.out.println("1. Apple");
			System.out.println("2. Pear");
			System.out.println("3. Pine");
			
			choice = scanChoice.nextInt();
		} while (choice < 1 || choice > 3);
		
		System.out.println("You picked " + choice);
	}

}
