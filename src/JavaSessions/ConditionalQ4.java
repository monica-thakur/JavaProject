package JavaSessions;

import java.util.Scanner;

public class ConditionalQ4 {

	public static void main(String[] args) {
		// Question4: Java Program to Swap Two Numbers with and without 3rd variable
		// Solution1: With 3rd variable

		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("Numbers after swapping:");
		System.out.println(a);
		System.out.println(b);
	}
}
