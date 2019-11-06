package com.class11;

public class TwoArraysDemo2 {

	public static void main(String[] args) {
		String [][]names= {
				{"Ayse","Fatma","Hayriye","Zeynep"},
				{"Mehmet","Ahmet","Rahmet","Saffet"},
				{"Ali","Veli","Selami","Rahmi"},
			};
    int lengthOfRows=names.length;
    System.out.println(lengthOfRows);
    
    int lengthOfCols=names[0].length;
    System.out.println(lengthOfCols);
    
    for (String getArrays[]:names) {
    	for(String getName: getArrays ) {
    		
    		System.out.print(getName+" ");
    	}
    	
    	System.out.println();
    
    }
	}

}
