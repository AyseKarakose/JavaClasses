package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
		
		int [] array=new int[4];
		array[0]=12;
		array[1]=13;
		array[2]=14;
		array[3]=15;
		
		
		//System.out.println(array[1]);
		int num1=0;
		for (int s=0;s<4;s++) {
			System.out.println(array[s]);	
			num1=num1+array[s];
		}
		System.out.println("The sum of Array is= "+num1);
		System.out.println("===========");
		for (int i:array) {
			System.out.println(i);
		}
		System.out.println("===========");
		int [] array2= {2,5,4,7};
		for (int i1:array2) {
			System.out.println(i1);
		}
	}

}
