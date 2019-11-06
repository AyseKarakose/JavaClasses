package com.class9;

public class PatternCont {
	//*****
	//*****
	//*****
	//*****


	public static void main(String[] args) {
		for (int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("##########");
		//*******
		//*******
		//*******
		//*******
		//*******
		for (int i=0;i<5;i++) {//rows
			for(int j=0;j<=6;j++) {//cols
				System.out.print("*");
			}
			System.out.println();
		}
		//12345
		//12345
		//12345
		//12345
		for (int i=1;i<=4;i++) {//rows
			for (int j=1;j<=5;j++) {//columns
				System.out.print(j);// if you are writing i it will show //11111
				//22222
				//33333
				//44444 below the example
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++) {//rows
			for (int j=1;j<=5;j++) {//columns
        System.out.print(i);

	}
	    System.out.println();
		}
		
		//123456789
		//123456789
		//123456789
		//123456789
		//123456789
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++ ) {
				System.out.print(j);
			}	
			System.out.println();
		}
		//54321
		//54321
		//54321
		//54321
		//54321
		for (int i=5;i>=1;i--) {
			for (int j=5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("%%%%%%%%%");
		for (int i=5;i>=1;i--) {
			for (int j=5;j>=1;j--) {
				System.out.print(i);
			}
			System.out.println();
			
			
		
		}
		
}
}