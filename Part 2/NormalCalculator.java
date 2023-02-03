package partTwoOOP;

import java.util.Scanner;

public class NormalCalculator {
	private static int num1,num2;
	public static int getNum1() {
		return num1;
	}

	public static void setNum1(int num1) {
		NormalCalculator.num1 = num1;
	}

	public static int getNum2() {
		return num2;
	}

	public static void setNum2(int num2) {
		NormalCalculator.num2 = num2;
	}

	public NormalCalculator(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	

	 static void normal() {
	Scanner in = new Scanner(System.in);

	System.out.println("1-> Addition.");
	System.out.println("2-> Subtraction.");
	System.out.println("3-> Multiplication.");
	System.out.println("4-> Division.");
	System.out.println("Please enter the number: ");
	int choice = in.nextInt();

	switch (choice) {
		case 1:
			System.out.println("The answer= "+ add());
			break;
		case 2:
			System.out.println("The answer of number1 - number2= "+ subtract());
			System.out.println("The answer of number2 - number1= "+ subtract(5,8));
			break;
		case 3:
			System.out.println("The answer= "+ multiply());
			break;
		case 4:
			System.out.println("The answer= "+ divide());
			break;
		default:
			System.out.println("Wrong selection.");
	}

	}
	
	static int add() {
		
		return (num1+num2);
	}
	
	
	static int subtract() {
		
		return (num1-num2);
	}
	static int subtract(int num1, int num2) {
		
		return (num2-num1);
	}
	static double multiply() {
		
		return (num1*num2);
	}
	static double divide() {
		
		return (num1/num2);
	}

}
