package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		//Declare 2D Array
		int[] [] array=new int [3] [4];
		
		// 1st row
		array[0][0]=45;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		
		// 2nd row
		array [1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		
		//3rd row
		array [2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=80;
		
		System.out.println(array[0][0]);
		System.out.println(array[2][3]);
		
		//task:create 2D array of String with 3 and 3 columns
		
		String [][] array1=new String [3][3];
		
		array1[0][0]="hi";
		array1[0][1]="hello";
		array1[0][2]="hey";
		
		array1 [1][0]="bye";
		array1[1][1]="see you";
		array1[1][2]="take care";
		
		array1 [2][0]="good";
		array1[2][1]="perfect";
		array1[2][2]="not good";
		
		System.out.println(array1[2][0]);
		
		
		
		int [][]numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7},
		};
		System.out.println(numbers[1][4]);//9
		// to identify the numbers of ROWS
		System.out.println("The numbers of Arrays are=" +numbers.length);
		//to identify the numbers of columns/elements in that row 
		System.out.println("The numbers of colums are="+numbers[0].length);
		
		System.out.println("=============");
		System.out.println();
		for(int i=0;i<numbers.length;i++) {
			for (int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
				
			}
			System.out.println();
			
			System.out.println();
		}
				

	}

}
