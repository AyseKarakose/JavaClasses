package com.class6;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		/*ask user to enter boolean value for sale
		 * if no sale-->I am not shopping
		 * if sale--> check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price <20--> apply 10%
		 * if between 20-100-->20%
		 * if between 100-500-->30%
		 * anything-->50%
		 * 
		 * After discount ___ the price of the item reduce from ___ to __
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Do you have sale?");
		boolean value=scan.nextBoolean();
		
		if (value) {
			System.out.println("Check the price of the item");
			
			Scanner scan1=new Scanner(System.in);
			System.out.println("Please enter price");
			double price=scan1.nextDouble();
			double discount;
			double finalPrice;
			if (price<20) {
				discount=price*0.1;
				finalPrice=price-discount;
			} else if(price>20 && price<100) {
			    discount=price*0.2;
			    finalPrice=price-discount;
			}else if (price>100 && price<500) {
				discount=price*0.3;
				finalPrice=price-discount;
			}else {
				discount=price*0.5;
				finalPrice=price-discount;
			}
			System.out.println("After discount "+ discount + " the price of the item reduce from "+ price + " to "+ finalPrice);
		}else {
			System.out.println("I am not shopping");
		}

		
	}
	

}
