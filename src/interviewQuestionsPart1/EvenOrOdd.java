package interviewQuestionsPart1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = reader.nextInt();
		
		if (a %2 ==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}

}
