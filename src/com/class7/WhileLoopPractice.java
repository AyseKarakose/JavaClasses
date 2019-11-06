package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		//how to print numbers from 1 to 20
		
		int i=0;
		
		while(i<=20) {
			System.out.println(i);
			i++;
		}
// i want to print numbers from 10 to 30 all in 1 line
		int y=10;
		while(y<=30) {
			System.out.print(y+" ");
			y++;
		}
		// how to print values 10 to 1;
		int a=10;
		while(a>=1) {// if condition is false system ignored example (a<=1) 
			System.out.println(a);
			a--;
			
		}
		
		//print values from 50 to 20
		
		int d=50;
		while (d>=20) {
		System.out.println(d);
		d--;
		
	}
		// i want to print all even numbers from 1 to 20 inclusive
		// 1 way-increment value by 2
	
	int z=2;
	while (z<=20) {
		System.out.println(z);
		z+=2;
	}
	
	// 2 way using modulus 
	System.out.println("-------");
	int q=1;
	while(q<=20){
		if (q%2==0) {
			System.out.println(q);
		}
		q++;// it has to be under "}"   
	}
	System.out.println("$$$$$$$");
	int q1=1;
	while(q1<=20){
		System.out.println(".");
		if (q1%2==0) {
			System.out.println(q);
			
		}
		q1++;
	
		System.out.println("****");
		//Print only odd number from 50 to 100
		// print only even numbers from 100 to 1
		
		int e=50;
		while (e<=100) {
		if(e%2!=0) {
			System.out.println(e);
		}
		e++;
		}
		
		int f=1;
		while(f<=100) {
			if(f%2==0) {
				System.out.println(f);
			}
			f++;
		}
	}	

}
}