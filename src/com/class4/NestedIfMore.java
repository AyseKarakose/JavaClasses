package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* check age, if age less than 16 -->too young to drive
		 * otherwise --> you are eligible to drive & we will check 
		 * if you are older than 18 -->
		 * you can get driver license and if not you can get driver permit
		 */
		
		int age= 55;
		
		if (age<16) {
			System.out.println("You are too young to drive");
			
		}else {
			System.out.println("You are eligible to drive");
			
			
		}if (age>=18) {
			System.out.println("you can drive alone");
			
		}else {
			System.out.println("You need your parent to drive");
			
			
		}
	System.out.println("___________________________");
	/*we need to check if student completed the quiz
	 * if yes--> good job, if not-->not good job
	 * if they completed we will check score:
	 * if more than 90--> you got an A
	 * if more than 80--> you got a B
	 * anything below --> you should study more
	 */
	
	boolean quiz=true;
	int score=85;
	
	if (quiz) {
		System.out.println("Good job!!!");
	   if (score>=90) {
			System.out.println("You got an A");
		}else if (score>80) {
			System.out.println("You got a B");
		}else {
			System.out.println("you should study more");
		}
		
	}else {
		System.out.println("Not good!!!");
	}
	
	
}
	
			

	
}
