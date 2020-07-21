package methodAssignment;

public class Ques5 {
	// Question5: Define a program to find out whether a given number is even or
	// odd.

	public int findNumber(int a) {
		if ((a % 2) == 0) {
			System.out.println(a + ": Number is even");
		} else
			System.out.println(a + ": Number is odd");
		return a;
	}

	public static void main(String[] args) {

		Ques5 obj = new Ques5();
		obj.findNumber(10);
	}
}
