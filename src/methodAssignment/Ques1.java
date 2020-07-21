package methodAssignment;

public class Ques1 {

	public int add(int a, int b) {
		int c = a + b;

		return c;
	}

	public static void main(String[] args) {
		// Ques1: Write a program to print the sum of two numbers entered by user by
		// defining your own method.

		Ques1 obj = new Ques1();
		int sum = obj.add(10, 20);
		System.out.println("Sum is: " + sum);
	}
}
