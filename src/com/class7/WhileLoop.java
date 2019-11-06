package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		int time=8;
		
		if(time<12) {//condition is true
			System.out.println("Good morning");
		}
		System.out.println("______");
        while(time<12) {// if condition is true
        	System.out.println("Good morning");// code executes infinitely
        	time++;
        }
        
        //I want to print GA 5 times
        
        int i=1;
        
        while(i<6) {
        	System.out.println("Good afternoon");
        	i++;
        }
        System.out.println("Outside of while loop");
	}

}
