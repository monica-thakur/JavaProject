package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues9 {

	public static void main(String[] args) {
		// Question9: Write a Java program of swap two elements in an array list.

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Tom");
		arr.add("Harry");
		
		System.out.println("ArrayList before swap:"+ (arr));

		arr.add(0, "Harry");
		arr.remove(2);
		System.out.println("ArrayList after swap:"+ (arr));
	}
}
