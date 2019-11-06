package com.class2;

public class ArithmeticOperations {
	/*
	 * declare 2 variables an initialize them
	 * display result of addition,subtraction,multiplication and division
	 */

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		//how can we print value of num 1 and num 2 together
		
		System.out.println(num1+"," +num2);
		
		System.out.println(num1+" "+num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		// the addition of 2 numbers is__
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("the addition of two number is " +sum );
		System.out.println("the subtraction of two number is " +sub);
		System.out.println("the multiple of two number is "+mult);
		System.out.println("the division of two number is"+ div);
		
		
		
		
	}
}
