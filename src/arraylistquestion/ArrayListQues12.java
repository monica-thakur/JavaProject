package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues12 {

	public static void main(String[] args) {
		// Question12: Write a Java program to print all the elements of a ArrayList
		// using the position of the elements

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
