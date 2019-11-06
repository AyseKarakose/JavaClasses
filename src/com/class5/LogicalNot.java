package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean b1=!true;
	boolean b2=false;
	
	System.out.println(b1);
	System.out.println(b2);
	
	boolean traffic=true;
	
	if(!traffic){// using ! we are reverting condition
		System.out.println("On time");
	}else {
		System.out.println("Late");
	}
	
	boolean isRain=true;
	
	if (!isRain) {
		System.out.println("Take an umbrella");
	}else {
		System.out.println("Do not take an umbrella");
	}
	
	//let's compare 2 numbers using NOT operator
	
	int num1=10;
	int num2=11;
	
	if(num1==num2) {
		System.out.println("Number are equals");
	}else {
		System.out.println("Number are not equal");
		
	}
      if (!(num1==num2)) {
    	  System.out.println("Number are NOT equal");
      }else {
    	  System.out.println("Number are equals"); 
      }
      
     // if name is not Marry or Anna then you are not my sister
      String name="Marry";
      String name2="Anna";
      
      if(!(name.contentEquals("Marry")|| name.contentEquals("Anna"))){
    	  System.out.println("You are not my sister");
    	  
      }else {
    	  System.out.println("You are my sister");
      }

	}

}
