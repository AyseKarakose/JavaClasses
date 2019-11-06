package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		String str="Hello";
		String str2="Hello";
		
		System.out.println(str.equals(str2));//true
        System.out.println(str==str2);// also true
        
		
		String str3=new String("Bye");
		String str4=new String("Bye");
		
		System.out.println("============");
		
		System.out.println(str3.equals(str4));//true
		System.out.println(str3==str4); //false=because pointing to different places in memory,despite the fact they have the same content
		
		System.out.println("&&&&&&&&&&&&&&&&&&");
		
		String str5="HEllo";
		String str6="Hello";
		System.out.println(str5.equals(str6));
		System.out.println(str5.equalsIgnoreCase(str6));
		System.out.println(str5==str6);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		
		System.out.println(str.contains("ll"));
		        
	}

}
