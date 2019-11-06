package com.class14;

public class StringMinipRecap {

	public static void main(String[] args) {
		String str=new String("Hello");
		String str3=new String("Hello");
		System.out.println(str==str3);// false interview questions (learn well)
		String str4=str;
		System.out.println(str4==str);//true 
		
		
		System.out.println("***************");
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);//true it is about same memory
		
		System.out.println(str);
		String str2=str.replace("Hello","Bye");
		System.out.println(str2);

	}

}
