package com.class4;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter city name");
		String cityName=scan.nextLine();
		
		System.out.println("Please enter temperature");
		int temp=scan.nextInt();
		
		int convertedTemp=(temp-(32*5/9));
		
		System.out.println("The tempature in city " +cityName+ " is " +convertedTemp);
		
		
	}

}
