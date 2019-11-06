package com.class6;

public class ClassTask {

	public static void main(String[] args) {
		/*ask user to enter the month they were born
		 * based on the month define the season
		 * if user born in jan,feb,dec--> winter
		 * if mar,apr,may-->spring
		 * if jun,jul,aug-->summer
		 * if sep,oct,nov-->fall
		 * otherwise-->unknown
		 * at the and of the program 
		 * " you were born in____"
		 */
         
		
		int month=9;
		String season;
			
		if (month==1 || month==2 || month==12) {
			season="Winter";
		}else if (month>=3 && month<=5) {
		    season="Spring";
		}else if(month>=6 && month<=8) {
			season="Summer";
		}else if (month>=9 && month<=11) {
			season="Fall";
		}else {
			season="Unknown";
		}
		System.out.println("You were born in "+ season);
		
		
		}

	}


