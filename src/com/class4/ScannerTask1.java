package com.class4;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner (System.in);
		System.out.println("Please enter customer age");
		int age=keyboard.nextInt();
		
		if (age>=18) {
			System.out.println("I will issue a driver licence to them");
		}else {
			System.out.println("I will offer them to get a learners permit");
		}

	}

}
