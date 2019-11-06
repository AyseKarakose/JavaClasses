package com.class12;

public class StringMinipulationDemo {

	public static void main(String[] args) {
		// There re two ways to create string objects
		
		//1st way
		//String Literal
		String name="John";
		System.out.println(name);
		System.out.println(name.length());
		
		//2nd way
		//Create String with new key word
		String name1=new String("John1");
		System.out.println(name1);
		
		/*This method returns the length of this string.
		 * the length is equal to the number of
		 * 16-bit unicode characters in the string
		 */
		
		int name1Len=name1.length();
		System.out.println("The length of name1Len is= "+name1Len);
		
		 /*
         * toLowerCase();
         * This method converts all of the
         * characters in this String to lowercase     
         */
	
		String str="HelLo woRld";
		System.out.println("Before:: "+str);
		str=str.toLowerCase();
		System.out.println("After:: "+str);
		
		
		// .equals()
		//This method will count everything such
        //capitalization and content
		String str2="HelLo WoRld";
		
		boolean isEqual=str.equals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		// this method does not care for capitalization and compare the content only
		System.out.println(str.equalsIgnoreCase(str2));
		
		/*
		 * toUpperCase();
		 * this method converts all of the characters in
		 * this String to upper case 
		 */
		
		String str3="Muhammed";
		System.out.println("Before:: "+str3);
		str3=str3.toUpperCase();
		System.out.println("After:: "+str3);
		
	}

}
