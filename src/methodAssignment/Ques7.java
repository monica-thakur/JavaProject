package methodAssignment;

public class Ques7 {
	// Question7: Define a method to find out if number is prime or not.

	public boolean primeCalculation(int a) {
		if (a < 2)
			return false;

		boolean flag = true;
		for (int i = 2; i <= a / 2; i++) {
			if ((a % i) == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		Ques7 obj = new Ques7();
		boolean flag1 = obj.primeCalculation(2);
		//System.out.println(flag1);

		if (flag1) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	}
}
