package ArrayNArrayListAssignment;

public class Question1 {

	public static void main(String[] args) {

		// Question1: Write a program to print the following pattern using for loop:

		// 00 01 02 03 04 05 06 07 08 09
		// 10 11 12 13 14 15 16 17 18 19
		// 20 21 22 23 24 25 26 27 28 29
		// 30 31 32 33 34 35 36 37 38 39

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(i);
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
