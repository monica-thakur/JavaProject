package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues3 {

	public static void main(String[] args) {
		
		//Question3: Write a Java program to retrieve an element (at a specified index) from a given array list.
		
		ArrayList arr = new ArrayList();
		
		arr.add(0, "100");
		arr.add(1, "200");
		arr.add(1, "300");
		arr.add(3, "400");
		
		System.out.println(arr.get(3));
	}
}
