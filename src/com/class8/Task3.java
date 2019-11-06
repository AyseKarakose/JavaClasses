package com.class8;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//print numbers from 1 to 50 except those that are divisible 3
		for (int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
			
		}
				Scanner scan=new Scanner(System.in);
				for(int a=1; a<=10; a++) {
		        System.out.println("Apply for credit card");
		        String card=scan.nextLine();
		        if (card.equals("Yes")) {
		        	break;
				}
				
			}
			}
		}

	

