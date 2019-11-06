package com.class10;

public class NewWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of countries. While retrieving all values from an array print capital for each country.
				String[] countries= {"Turkey","France","USA","Azerbeycan"};
				for(int i=0;i<countries.length;i++) {
					
				switch(countries[i]) {
				case "Turkey":
					System.out.println("Ankara");
				break;
				case "France":
					System.out.println("Paris");
				break;
				case "USA":
					System.out.println("Washington DC");
				break;
				case "Azerbeycan":
					System.out.println("Baku");
				break;
				
				}
					
				}
	}

}
