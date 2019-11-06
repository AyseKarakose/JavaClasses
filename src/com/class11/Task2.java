package com.class11;

public class Task2 {

	public static void main(String[] args) {
		//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
		
		int [][] numbers= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		 int lengthOfRows=numbers.length;
		    System.out.println(lengthOfRows);
		    
		    int lengthOfCols=numbers[0].length;
		    System.out.println(lengthOfCols);
		    
		    for (int getArrays[]:numbers) {
		    	for(int getNumber: getArrays ) {
		    		
		    		System.out.print(getNumber+" ");
		    	}
		    	
		    	System.out.println();
		    
		    }

	}

}
