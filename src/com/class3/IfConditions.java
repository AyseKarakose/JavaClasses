package com.class3;

public class IfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int expectedHours=15;
		int actualHours=2;
		//if expected hours more than actual-> you will succeed
		//otherwise, please study more
		
		if(actualHours>expectedHours) {
			System.out.println("you will succeed");
		}else {
			System.out.println("please study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		//if price is more that I can afford I will not buy
		//if price is less or matches what I can afford then i will buy tea
		
		if(allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
		}else {
			System.out.println("i cannot afford,I need to study more");
		}
		
		double teaPrice1=4.99;
		double allowedPrice1=3.99;
		teaPrice1-=2;//2.99
		//if price is more that I can afford I will not buy
		//if price is less or matches what I can afford then i will buy tea
		
		if(allowedPrice1>=teaPrice1) {
			System.out.println("I will buy tea");
			System.out.println("And I will enjoy my tea");
		}
		else {
			System.out.println("I cannot afford,I need to study more");
			System.out.println("I will go back to study more");
		}
		
		System.out.println("I keep writing some code");
		
		boolean val=false;
		if (val) {// if val==true
			System.out.println("Hello");
		}else {System.out.println("Bye");
		
			
		}
		
		boolean isRain=true;
		//if it is raining I will take umbrella,otherwise I go for a walk
		if(isRain) {//isRain==true
			System.out.println("I will take umbrealla");
		}else {
			System.out.println("I go for a walk");
		}
	}

}
