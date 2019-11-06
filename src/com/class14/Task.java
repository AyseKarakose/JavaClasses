package com.class14;

public class Task {

	public static void main(String[] args) {
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		String str="Hello how are you today?";
		System.out.println(str.replaceAll("\\s",""));
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
	
		String str1="fjdhsfkkope&%%^&&455&54$#%^&";
		String str4=(str1.replaceAll("[^a-zA-Z]",""));
		System.out.println(str4);
		System.out.println(str4.length());
		
		//You have a String a=”Is it Saturday? Is it raining? 
		//Do we have a Java Class today?” How would you find out how many sentences are in that String?
		String a="Is it Saturday?Is it raining?Do we have a Java Class today?";
		String[] array=a.split("\\?");
		System.out.println((array.length));
		for (String str2: array) {
			System.out.println(str2);
		}	
	}

}
