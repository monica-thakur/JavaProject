package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues2 {

	public static void main(String[] args) {
		// Question 2: Write a Java program to insert an element into the array list at
		// the first and last positions.

		ArrayList arr = new ArrayList();

		arr.add(0, "100");
		arr.add(1, "200");
		arr.add(1, "300");
		arr.add(4, "400");
	
		arr.add(arr.size(),"700");
	
		System.out.println(arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
