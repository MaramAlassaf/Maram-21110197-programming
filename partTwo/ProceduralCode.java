package partTwo;

import java.util.Scanner;

public class ProceduralCode {
	static int num1,num2;
	static Scanner input = new Scanner(System.in);
	static int add() {
		System.out.println("Please enter the value of the two numbers");
		num1= input.nextInt();
		num2= input.nextInt();
		
		return (num1+num2);
	}
	static int subtract() {
		System.out.println("Please enter the value of the two numbers");
		num1= input.nextInt();
		num2= input.nextInt();
		
		return (num1-num2);
	}
	static double multiply() {
		System.out.println("Please enter the value of the two numbers");
		num1= input.nextInt();
		num2= input.nextInt();
		
		return (num1*num2);
	}
	static double divide() {
		System.out.println("Please enter the value of the two numbers");
		num1= input.nextInt();
		num2= input.nextInt();
		
		return (num1/num2);
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
				System.out.println("The answer= "+ subtract());
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
	
	static int power() {
		System.out.println("Please enter the value of the two numbers");
		num1= input.nextInt();
		num2 = input.nextInt();
		
		return (int)Math.pow(num1, num2);
	}
	
	static double squareRoot() {
		System.out.println("Please enter the number to find its square root:");
		int num= input.nextInt();
		double ans=  Math.sqrt(num);
		return ans;
	}
	
	static int max() {
		int maxNum = 0;
		System.out.println("Please enter the value of the two numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 >= num2) {
			maxNum= num1;
		}
		else {
			maxNum=num2;
		}
		return maxNum;
	}
	static int min() {
		int minNum=0;
		System.out.println("Please enter the value of the two numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 <= num2) {
			minNum = num1;
		}
		else {
			minNum = num2;
		}
		return minNum;
	}
	 static  void scientific() {
		 Scanner in = new Scanner(System.in);

			System.out.println("1-> Power.");
			System.out.println("2-> Square root.");
			System.out.println("3-> Maximum element between 2 numbers.");
			System.out.println("4-> Minimum element between 2 numbers.");
			System.out.println("Please enter the number: ");
			int choice = in.nextInt();

			switch (choice) {
				case 1:
					System.out.println("The answer= "+ power());
					break;
				case 2:
					System.out.println("The answer= "+ squareRoot());
					break;
				case 3:
					System.out.println("The maximum number= "+ max());
					break;
				case 4:
					System.out.println("The minimum number= "+ min());
					break;
				default:
					System.out.println("Wrong selection.");
			}
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1 -> Nomral Calculator.");
		System.out.println("2 -> Scientific Calculator.");
		System.out.println("Please enter a choice: ");
		int choice = in.nextInt();
		
		switch(choice) {
			case 1:
				normal();
				break;
			case 2:
				scientific();
				break;
			default:
				System.out.println("Wrong selection.");
				
		
		}
	}

}
