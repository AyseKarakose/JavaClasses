package com.class6;
import java.util.Scanner;
public class ClassTask2 {
	
	public static void main(String[] args) {
	String month;	
	Scanner scan=new Scanner(System.in);
	System.out.println("Month of born");
	month =scan.nextLine();
	String season;
	if(month.equals("January") || month.equals("February") || month.equals("December")) {
		season = "Winter";
	}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
		season = "Spring";
		
	}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
		season = "Summer";
	}else if(month.equals("September") || month.equals("October") || month.equals("November")) {
		season = "Fall";
	}else {
		season="Unknown";
}
System.out.println("You are born in "+season);
System.out.println(month);
	}
	}