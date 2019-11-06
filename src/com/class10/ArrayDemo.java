package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		// to find # of elements we use .length
		System.out.println(nums.length);
		System.out.println(nums[0]);
		              //  0          1       2         3
		String[] array= {"Winter", "Fall", "Summer", "Spring"};
		// I was born in Fall
		
		System.out.println("I was born in "+array[1]);
		System.out.println(array.length);
		
		int[] score= {80, 90, 70, 100,99};
		
		System.out.println(score[2]);
				
				
	}

}
