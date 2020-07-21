package arraylistquestion;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQues8 {

	public static void main(String[] args) {
		// Question8: Write a Java program to extract a portion of a array list.

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Yellow");
		arr.add("Red");
		arr.add("Blue");
		arr.add("Black");
		arr.add("White");
		arr.add("Grey");
		arr.add("Peach");

		System.out.println("Original list: " + arr);

		List<String> sub_list = arr.subList(0, 4);
		System.out.println("Extracted list: " + sub_list);
	}
}
