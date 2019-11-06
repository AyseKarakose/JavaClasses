package com.class11;

public class Task4Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aray= {
                {13,23,44,27},
                {67,87,44,77},
                {56,43,67,21}
        };
        for(int[] numbers: aray) {
            for(int odd:numbers) {
                if(odd%2!=0) {
                    System.out.print(odd+" ");
            }
            }
            System.out.println();
        }
		
		
		

	}

}
