package com.class13;

public class Recap1 {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str3="Hello";
		String str4=str1.concat("World");
		System.out.println(str4);
		String str2= new String("Hello");
		
		String city="Fairfax";
		String city1="Fairfax";
		System.out.println(city);
		System.out.println(city1);
        System.out.println(city.isEmpty());
        System.out.println(city.length());

        String newCity=city.toUpperCase();
        System.out.println(newCity);

        //System.out.println(city.toUpperCase()); bu sekilde de yazilir

        int [] a= {12,32,55,77};
        System.out.println(a.length);

	}

}
