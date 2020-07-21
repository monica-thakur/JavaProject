package methodAssignment;

public class Ques2 {

	public int product(int a, int b) {
		int c = a * b;
		return c;
	}

	public static void main(String[] args) {
		// Question 2: Define a method that returns the product of two numbers entered
		// by user.

		Ques2 obj = new Ques2();
		int product = obj.product(2, 5);
		System.out.println("Product is: " + product);

	}
}
