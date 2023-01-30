package partTwoOOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NormalCalculator obj = new NormalCalculator(7, 9);
		ScientificCalculator obj2 = new ScientificCalculator(5, 4);
		Scanner in = new Scanner(System.in);
		System.out.println("1 -> Nomral Calculator.");
		System.out.println("2 -> Scientific Calculator.");
		System.out.println("Please enter a choice: ");
		int choice = in.nextInt();
		
		switch(choice) {
			case 1:
				NormalCalculator.normal();
				break;
			case 2:
				ScientificCalculator.scientific();
				break;
			default:
				System.out.println("Wrong selection.");
				
		
		}

	}

}
