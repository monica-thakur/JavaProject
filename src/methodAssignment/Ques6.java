package methodAssignment;

public class Ques6 {
	// Question6: A person is eligible to vote if his/her age is greater than or
	// equal to 18.
	// Define a method to find out if he/she is eligible to vote

	public void findEligibilityForVote(int age) {

		if (age >= 18) {
			System.out.println("Person is eligible to vote");
		} else
			System.out.println("Person is not eligible to vote");
	}

	public static void main(String[] args) {

		Ques6 obj1 = new Ques6();
		obj1.findEligibilityForVote(17);
	}
}
