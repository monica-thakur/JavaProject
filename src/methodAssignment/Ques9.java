package methodAssignment;

public class Ques9 {
	// Ques 9. Write a program to print the factorial of a number by defining a
	// method named 'Factorial'.
	// Factorial of any number n is represented by n! and is equal to
	// 1*2*3*....*(n-1)*n. E.g.-
	// 4! = 1*2*3*4 = 24
	// 3! = 3*2*1 = 6
	// 2! = 2*1 = 2
	// Also,
	// 1! = 1
	// 0! = 0

	// 5 * 4 * 3 * 2 * 1

	public int findFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
		return fact;
	}

	public static void main(String[] args) {

		Ques9 obj = new Ques9();
		obj.findFactorial(4);
	}

}
