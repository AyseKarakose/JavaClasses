package com.class9;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=3;i++){
			System.out.println("I am outer loop");

			for (int j=1;j<=3;j++){
			System.out.println("i am inner loop");
			}
			}
		for (int i=0; i<=5;i++){
			

			for (int j=0;j<=5;j++){
			System.out.println(i+" "+j);
			}
			}
		
	}

}
