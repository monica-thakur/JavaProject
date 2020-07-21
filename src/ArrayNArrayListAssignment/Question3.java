package ArrayNArrayListAssignment;

public class Question3 {

	public static void main(String[] args) {

		// Question3: Try to print the following pattern on the console:
		// n = 4
		// n = 3
		// n = 2
		// n = 1
		// n = 0

		Integer n[] = new Integer[5];
		n[0] = 4;
		n[1] = 3;
		n[2] = 2;
		n[3] = 1;
		n[4] = 0;
		
		for (int i = 0; i < n.length; i++) {
			System.out.println("n "+"= "+ n[i]);
		}
	}
}
