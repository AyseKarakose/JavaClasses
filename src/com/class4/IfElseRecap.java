package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Class schedule
		 * if tuesday --> sdlc
		 * if wednesday --> java review
		 * if thursday --> sdlc
		 * if saturday --> Jaava coding
		 * if sunday --> my favorite java coding
		 */
		
		int day=1;// int=day; day=1 bu sekilde de yazilabilir
		
		if (day==2) {
			System.out.println("SDLC Class");
		}else if(day==3) {
			System.out.println("Review class");
		}else if(day==4) {
			System.out.println("SDLC Class");
		}else if(day==6) {
			System.out.println("Java Class");
		}else if(day==7) {
			System.out.println("Favorite Java Clas");
		}else {
			System.out.println("There is no class at school");
		}

	}

}
