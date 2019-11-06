package com.class3;

public class TaskNested2 {

	public static void main(String[] args) {
		
		double rate=4.3;
		long price=200000;
		
		if (rate>=4.5) {
			System.out.println("You will buy not buy a house");
		}else {
			System.out.println("you will buy a house");
		if (price>=200000) {
			System.out.println("you will take a loan");
		}else {
			System.out.println("You will pay cash");
		}
		}
		
		

	}
}
