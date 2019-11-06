package com.class2;

public class VariableDeclaration {
	
	public static void main(String[] args) {
		
		//1. declaring variable num1 that will hold value of int an
		//assigning/ initializing value of 123 to it
		int num1=123;
		int num2=6767;
		long num3=78678687899l;
		char num4='A';
		
		//2. declare variable first and then assign value
		int n1;
		int n2;
		int n3;
		
		n1=56;
		n2=7676;
		n3=676;
		
		//3. declare all variable together and then assign value
		int number1, number2, number3;
		
		number1=12;
		number2=15;
		number3=676;
		
		System.out.println(n1);
		// program asagi dogru gittigi icin her ikisini de alta yaziyor ama her ikisinden birini"//" koyarsan onu sistemin disina atar
		
		number3=1000;
		System.out.println(number3);
		
		boolean var= true;
		System.out.println(var);
		
		char myVariable; 
		myVariable='*';
		System.out.println(myVariable);
		
		number2=number1;//12 (number 2 deger olarak artik number1 a esit oluyor onun degerini aliyor )
		System.out.println(number2);
		
		//number2= false;--> compile error asking to change datatype of 
		//variable numer2 to boolean
		
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain; // isSnow=false
		System.out.println(isSnow);
		
		isSnow=true; 
		System.out.println(isSnow);
		
		
		
	}

}
