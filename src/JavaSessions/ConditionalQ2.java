package JavaSessions;

import java.util.Scanner;

public class ConditionalQ2 {

	public static void main(String[] args) {

		//Question2: Write a Java program to check the eligibility for vote.
				  //if age is equal and above 18 then only you can vote else you can't.
		          //if you have not been living for more than 3 years, you cant vote.
		
		int age;
		int livingYears;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();

		System.out.println("Enter number of years you living in city");
		livingYears = sc.nextInt();

		if (age >= 18 && livingYears >= 3) {
			System.out.println("You are eligible to vote");
		}

		else
			System.out.println("You are not eligible to vote");
	}

}
