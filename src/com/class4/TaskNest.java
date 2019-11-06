package com.class4;

public class TaskNest {

	public static void main(String[] args) {
		boolean diploma = true;
		double gpaScore = 3.7;

		if (diploma) {
			System.out.println("Congratulations");

			if (gpaScore >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("You should get a degree");
		}
	}
}
