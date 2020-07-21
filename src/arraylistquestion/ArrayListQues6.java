package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues6 {

	public static void main(String[] args) {
		// Question: Write a Java program to search an element in a array list.

		ArrayList arr = new ArrayList();

		arr.add(0, "100");
		arr.add(1, "200");
		arr.add(2, "300");
		arr.add(3, "400");
		arr.add(4, "500");

		if (arr.contains("200")) {
			System.out.println("Element found");
		}

		else {
			System.out.println("Element not found");
		}
	}
}
