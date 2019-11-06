package com.class13;

public class RegularExpressons {

	public static void main(String[] args) {
		/*
		 * print only text are not numbers
		 */
    String str="1423Hel654783lo7658229";
    System.out.println(str.replaceAll("[0-9]", ""));// leave only text
    System.out.println(str.replaceAll("[a-zA-Z]",""));//leave only numbers
   
    //Remove everything except text and numbers
    String str2="Hi@#@How#@$%%%4566850";
    System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));// ^ ==> means write letters and numbers
    
    System.out.println(str2.replaceAll("\\W",""));// \\W==> means except characters
    
    System.out.println(str2.replaceAll("\\w", ""));// \\w==> means only characters
    
    
    
    
	}

}
