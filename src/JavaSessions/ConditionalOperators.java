package JavaSessions;

import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {

		// Question1: Take four numbers from the user and print the greatest number.

		// Test Data
		// Input the 1st number: 25
		// Input the 2nd number: 78
		// Input the 3rd number: 87
		// Input the 4th number: 101
		// Expected Output :
		// The greatest: 101

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();

		System.out.println("Enter third number");
		int c = sc.nextInt();

		System.out.println("Enter fourth number");
		int d = sc.nextInt();

		if (a > b && a > c && a > d) {
			System.out.println("a is greatest");
			}

		else if (b > c && b > d) {
			System.out.println("b is greatest");
			}

		else if (c > d) {
			System.out.println("c is greatest");
			}

		else {
			System.out.println("d is greatest");
		}
	}
}