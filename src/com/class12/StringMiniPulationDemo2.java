package com.class12;

public class StringMiniPulationDemo2 {

	public static void main(String[] args) {
		/*
		 * .contains();
		 */
		
		String sentence="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence)); 
		System.out.println(sentence.contains(sen));
		System.out.println(sentence.contains("Was"));// false key sensitive 
		
		// Create two String and initialize them with some value.
		// implement the following methods on those string.
		/*sen.length();
		*sen.equals();
		*sen.contains(s);
		*sen.toUpperCase();
		*sen.toLowerCase();
		*sen.equalsIgnoreCase(anotherString);
		*/
		String sen1="Hello";
		String sen2="Bye";
		System.out.println(sen1.length());
		System.out.println(sen2.length());
	
		
		boolean isEqual=sen1.equals(sen2);
		System.out.println(isEqual);
		
		
		/*
		 * This method tests if a string a starts with the
		 * specified prefix beginning
		 */
		 String str2="It is very hot in the class";
		 System.out.println("Is this string starts with="+str2.startsWith("It"));
		 System.out.println("Is this string starts with="+str2.startsWith("It's"));
		 
		 /*
		  *This method tests if this string ends with 
		  * the specified suffix.
		  */
		 System.out.println("Is this string starts with="+str2.endsWith("class"));
		
		
		
	}

}
