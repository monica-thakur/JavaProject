package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues5 {

	public static void main(String[] args) {
		// Question5: Write a Java program to remove the third element from a array
		// list.

		ArrayList arr = new ArrayList();

		arr.add(0, "100");
		arr.add(1, "200");
		arr.add(2, "300");
		arr.add(3, "400");
		arr.add(4, "500");

		arr.remove(2);

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
