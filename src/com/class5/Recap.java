package com.class5;
import java.util.Scanner;

public class Recap{
 //-to take an input from a user
public static void main(String[] args) {
Scanner anyVariableName=new Scanner(System.in);

System.out.println("Please enter string value" );
String val=anyVariableName.nextLine();// take entire line
System.out.println("Please enter boolean value");
boolean val1=anyVariableName.nextBoolean();
System.out.println("Please enter string value" );
String val2=anyVariableName.nextLine();//take first word until space
System.out.println("Please enter integer value");
int val3=anyVariableName.nextInt();
System.out.println("Please enter double value");
double val4=anyVariableName.nextDouble();
System.out.println(val);
System.out.println(val1);
System.out.println(val2);
System.out.println(val3);
System.out.println(val4);
	}

}
