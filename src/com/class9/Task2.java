package com.class9;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {

		//2)Write a guessing game where the user has to guess a secret number between 1 and 20.
	    // After every guess input, the program tells the user whether their number was too large or too small.
	    // The program will keep asking the user to enter the number until he finds the correct number.
		// When the correct answer is found the system should display “Congratulations!!. You got it!”
		Scanner scan;
		int secretNumber, guessNumber;
		
		scan=new Scanner(System.in);
		secretNumber=12;
		
		//for(int i=0; i<20;i++)
		
		do {
			System.out.println("Please guess my number from 1 to 20");
			guessNumber=scan.nextInt();
			if (guessNumber<secretNumber) {
				System.out.println("Your number is small");
			}else if(guessNumber>secretNumber) {
				System.out.println("Your number is large");
			}else {
				System.out.println("Congratulations you got it!");
			}
		 }while (guessNumber!=secretNumber) ;
			
		}

	}


