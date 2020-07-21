package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues10 {

	public static void main(String[] args) {
		// Question10: Write a Java program to empty an array list.

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Tom");
		arr.add("Harry");
		arr.add("Veeini");
		arr.add("Kat");
		System.out.println(arr);

		arr.removeAll(arr);
		System.out.println(arr);
	}
}
