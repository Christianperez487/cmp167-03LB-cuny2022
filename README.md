# cmp167-LB3-Spring2022

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("This is my first program");
		System.out.println("Ok, please enter your name");
		String name = input.nextLine();
		String message = "Hello " + name + " , it is nice to meet you";
		
		System.out.println(message);
		
		input.close();
	}

}



import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int num1, num2, num3;
		
		System.out.println("Enter first number");
		num1 = input.nextInt();
		
		System.out.println("Enter second number");
		num2 = input.nextInt();
		
		num3 = num1 + num2;
		
		System.out.println("Result " + num3);
		
		input.close();
		
		System.out.print("Hello ");
		System.out.println("is it me you're waiting for");
		
		
	}

}


public class Program3 {

	public static void main(String[] args) {
		int num1 = 10;
	    int num2 = 20;
	    
	    int result = num1 + num2;
	    System.out.println(num1 + " + " +num2+ " = " +result);
	    
	    result = num1 - num2;
	    System.out.println(num1 + " - " +num2+ " = " +result);
	    
	    result = num1 * num2;
	    System.out.println(num1 + " * " +num2+ " = " +result);
	    
	    result = num1 / num2;
	    System.out.println(num1 + " / " +num2+ " = " +result);
	    
	    result = num1 % num2;
	    System.out.println(num1 + " % " +num2+ " = " +result);
	    
	    
	    byte num3 = 127;
	    System.out.println(num1 + num3);
	    
	    double num4 = 5.0;
	    double num5 = 2.0;
	    
	    
	    double total = num4 / num5;
	    System.out.println(num1 + " / " +num5+ " = " +total);
	    
	    total = num1 / num4;
	    System.out.println(num1 + " / " +num4+ " = " +total);
	    
	    

	}

}
