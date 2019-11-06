package com.class13;

public class ReplaceMethodsString {

	public static void main(String[] args) {
		
		String str="Hello Dear Dan, how are you Dan ,How you been?";
		String str1="12-22-1990";//12/22/1990
		
		
		System.out.println(str.replace('n', 'z'));
		System.out.println(str1.replace('-', '/'));
		System.out.println(str1.replaceAll("-","/"));
		System.out.println("=======");
		System.out.println(str.replace("Dan","Ben"));
		System.out.println(str.replaceFirst("Dan", "Ali"));
		
	
	}

}
