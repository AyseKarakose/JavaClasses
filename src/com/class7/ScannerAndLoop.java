package com.class7;
import java.util.Scanner;
public class ScannerAndLoop {

	public static void main(String[] args) {
		 /*ask user enter name
		  * and our output should be "Good afternoon_____"
		  */
		
		Scanner scan=new Scanner(System.in);
		int i=5;
		while (i<=10) {
	    System.out.println("Please enter your name");	
	    String name=scan.nextLine();
		System.out.println("Good afternoon "+ name);
		i++;
		}
		
	}

}
