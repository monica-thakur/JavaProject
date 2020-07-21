package interviewQuestionsPart1;

public class NumberSwap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

//		System.out.println("Before swapping:");
//		System.out.println("a= " + a);
//		System.out.println("b= " + b);
//
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("After swapping:");
//		System.out.println("a= " + a);
//		System.out.println("b= " + b);

		// without temp variable
		System.out.println("Before swapping:");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("After swapping:");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}

}
