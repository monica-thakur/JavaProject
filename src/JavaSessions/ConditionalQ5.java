package JavaSessions;

import java.util.Scanner;

public class ConditionalQ5 {

	public static void main(String[] args) {
		
		//Question: Java Program to Check Whether a Number is Even or Odd
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
	
		if (a%2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

}
