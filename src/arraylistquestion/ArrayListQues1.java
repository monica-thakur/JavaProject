package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues1 {

	public static void main(String[] a) {
		// Question1: Write a Java program to create a new array list, add some colors
		// (string) and print out the collection

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
	}
}
