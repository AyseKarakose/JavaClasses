package com.class9;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		for (int a=5;a>=1;a--) {
			for (int b=a;b>=1;b--) {
				System.out.print(a);
			}
			System.out.println();
		}
		for (int i=5;i>=1;i--) {
			for (int j=5;j>=i;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for (int c=4;c>=1;c--) {
			for (int d=c;d>=1;d--) {// d=1;d<=c;d++
				System.out.print("*");	
			}
			System.out.println();
		}
	//Write a program that reads a range of integers (start and end point), provided by 
	//a user and then from that range prints the sum of the even and odd integers.
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter start number");
		int start=scan.nextInt();
		System.out.println("Please enter ending number");
		int end=scan.nextInt();
		int even=0;
		int odd=0;
		for(int i=start;i<=end;i++) {
			if (i%2==0) {
				even=even+i;
			}else {
				odd=odd+i;
			}
		}
		System.out.println("The sum of even number "+even);
		System.out.println("The sum of odd number "+odd);
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		
		
		
		
	

	}

}
