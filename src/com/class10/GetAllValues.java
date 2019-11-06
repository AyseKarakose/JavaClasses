package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		String[] animals= {"Cat","Cow","Dog","Snake","Elephant"};
	  // i want to print all values from an array
		// when value is Dog--->I love dogs
		
		for (int i=0;i<animals.length;i++) {
			if (animals[i].equals("Dog")) {
				System.out.println("I love dogs");
			}else {
				System.out.println(animals[i]);
			}
		}
		//Create an array of countries. While retrieving all values from an array print capital for each country.
		String[] countries= {"Turkey","France","USA","Azerbeycan"};
		for(int i=0;i<countries.length;i++) {
			if(countries[i].contentEquals("Turkey")) {
				System.out.println("Ankara");
			}else if(countries[i].contentEquals("France")) {
				System.out.println("Paris");
			}else if(countries[i].contentEquals("USA")) {
				System.out.println("Washington DC");
			}else if(countries[i].contentEquals("Azerbeycan")){
				System.out.println("Baku");
			}
			
		}

	}

}
