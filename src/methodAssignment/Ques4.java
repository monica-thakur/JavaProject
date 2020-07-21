package methodAssignment;

public class Ques4 {
//Question4: Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

	public int maximum(int a, int b, int c) {
		int num = 0;
		if ((a > b) && (a > c)) {
			num = a;
		} else if (b > c) {
			num = b;
		} else {
			num = c;
		}
		return num;
	}

	public int minimum(int a, int b, int c) {
		int num = 0;
		if ((a < b) && (a < c)) {
			num = a;
		} else if (b < c) {
			num = b;
		} else {
			num = c;
		}
		return num;
	}

	public static void main(String[] args) {

		Ques4 obj = new Ques4();
		System.out.println("Maximum number is: " + obj.maximum(10, 1, 5));
		System.out.println("Minimum number is: " + obj.minimum(1, -3, -2));
	}

}
