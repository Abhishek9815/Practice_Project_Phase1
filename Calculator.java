package Code;

import java.util.Scanner;

	public class Calculator {
			public static void main(String[] args) {
				double num1;
			      double num2;
			      double ans;
			      char op;
			      try (Scanner reader = new Scanner(System.in)) {
					System.out.print("Enter two numbers:\n");
					  num1 = reader.nextDouble();
					  num2 = reader.nextDouble();
					  System.out.print("\nEnter an operator (+, -, *, /): ");
					  op = reader.next().charAt(0);
				}
			      switch(op) {
			         case '+': ans = num1 + num2;
			            break;
			         case '-': ans = num1 - num2;
			            break;
			         case '*': ans = num1 * num2;
			            break;
			         case '/': ans = num1 / num2;
			            break;
			      default: System.out.printf("Error! Enter correct operator");
			         return;
			      }
			      System.out.print("\n Result:\n");
			      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
				
			}

		

		
	}


