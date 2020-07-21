package JavaSessions;

import java.util.Scanner;

public class ConditionalQ4Solution_2 {

	public static void main(String[] args) {
		// Question4: Java Program to Swap Two Numbers with and without 3rd variable
		// Solution2: Without 3rd variable

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swapping:");
		System.out.println("Number a: " + a);
		System.out.println("Number b: " + b);

	}
}
