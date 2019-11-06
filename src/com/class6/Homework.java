package com.class6;
import java.util.Scanner;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner scan;
		int quiz, midTerm, finalScore, avarege;
		
		scan= new Scanner(System.in);
		System.out.println("Please enter quiz score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter mid term score");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter final score");
		finalScore=scan.nextInt();
		
		avarege=(quiz+midTerm+finalScore)/3;
		
		if (avarege>90) {
			System.out.println("A");
		}else if (avarege>=70 && avarege<90) {
			System.out.println("B");
		}else if(avarege>50 && avarege<70) {
			System.out.println("C");
		}else if(avarege<50) {
			System.out.println("D");
		}else {
			System.out.println("Unknown");
		}
			
			
			
			
			
		

	}

}
