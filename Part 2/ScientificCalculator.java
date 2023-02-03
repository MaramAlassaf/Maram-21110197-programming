package partTwoOOP;

import java.util.Scanner;

public class ScientificCalculator extends NormalCalculator {

	public ScientificCalculator(int num1, int num2) {
		super(num1, num2);		
	}
		static  void scientific() {
			 Scanner in = new Scanner(System.in);
			 	
			 	System.out.println("1-> Addition.");
				System.out.println("2-> Subtraction.");
				System.out.println("3-> Multiplication.");
				System.out.println("4-> Division.");
				System.out.println("5-> Power.");
				System.out.println("6-> Square root.");
				System.out.println("7-> Maximum element between 2 numbers.");
				System.out.println("8-> Minimum element between 2 numbers.");
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
					case 5:
						System.out.println("The answer= "+ power());
						break;
					case 6:
						System.out.println("The answer= "+ squareRoot());
						break;
					case 7:
						System.out.println("The maximum number= "+ max());
						break;
					case 8:
						System.out.println("The minimum number= "+ min());
						break;
					default:
						System.out.println("Wrong selection.");
				}
			
		
		
	}
		static int power() {
			
			return (int)Math.pow(getNum1(), getNum2());
		}
		
		static double squareRoot() {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the number to find its square root:");
			int num= input.nextInt();
			double ans=  Math.sqrt(num);
			return ans;
		}
		
		static int max() {
			int maxNum = 0;
			
			
			if(getNum1() >= getNum2()) {
				maxNum= getNum1();
			}
			else {
				maxNum=getNum2();
			}
			return maxNum;
		}
		static int min() {
			int minNum=0;
			
			
			if(getNum1() <= getNum2()) {
				minNum = getNum1();
			}
			else {
				minNum = getNum2();
			}
			return minNum;
		}
		
		static int add() {
		  return (getNum1()+getNum2());
		}

		
		
		static int subtract() {
			
			return (getNum1()-getNum2());
		}
		static int subtract(int num1, int num2) {
			
			return (num2-num1);
		}
		static double multiply() {
			
			return (getNum1()*getNum2());
		}
		static double divide() {
			
			return (getNum1()/getNum2());
		}

		

}
