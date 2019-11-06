package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		// Say good morning 5 times
		// initialize; test condition; increment
		
		for(int i=0; i<=4; i++) {
			System.out.println("Good morning");
		}
     //print number from 1-10
		for (int i=1; i<=10; i++) {
		System.out.println(i);
	}
		// print number from 10-1
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
	for(int i=0; i<=50; i+=5) {
		System.out.println(i);//5,0,15,....
	}
	//1)print number from 1 to 100 in 1 line with space
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		//2)print number 100 to 1
		for(int i=100; i>=1; i--) {
			System.out.println(i);
		}
	//3) print even numbers from 20 to 1 (2 ways)
	   for(int i=20; i>=1; i-=2) {
		System.out.println(i);
		
	}
	   //4)print odd numbers between 20 and 50(2 ways)
	for (int i=21; i<=50; i+=2) {
		System.out.println(i);
	}//4)2.cozum
	for (int i=20; i<=50; i++) {
	if(i%2 !=0)
		System.out.println(i);
	}
	System.out.println("********");
	// what is the output
	int sum=0;
	for (int i=1; i<=5; i++) {
		sum=sum+i;
		System.out.print(sum+ "+");
	}
	System.out.println();
	System.out.println(sum);
	
	// what is the output
	int sumAll=0;
	for(int i=0; i<=20; i+=5) {
		sumAll=sumAll+i;
	}
	System.out.println(sumAll);
	System.out.println("&&&&&&&&&&");
	// what is the output
	int total=2;
	for (int y=1;y<=3;y++) {
		total=total*y;
	}
	System.out.println(total);
	}
	
}










