package com.class4;

import java.util.Scanner;

public class ScannerTask {
	
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner (System.in);
		System.out.println("Please enter loan price");
		int loan=keyboard.nextInt();
		if (loan<200000) {
			System.out.println("I will lend the money");
		}else {
			System.out.println("I will reject the client");
		}
	}

}
