package arraylistquestion;

import java.util.ArrayList;

public class Question11 {

	public static void main(String[] args) {
//Question11: 11. Write a Java program to trim the virtual capacity of an array list the current list size.

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Keyboard");
		arr.add("Mouse");
		arr.add("Monitor");
		arr.add("Motherboard");
		arr.add("RAM");
		System.out.println(arr);

		arr.trimToSize();
		System.out.println(arr);
	}
}
