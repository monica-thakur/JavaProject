package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues4 {

	public static void main(String[] args) {
		//Question 4: Write a Java program to update specific array element by given element.
		
		ArrayList arr = new ArrayList();
		
		arr.add(0, "100");
		arr.add(1, "200");
		arr.add(2, "300");
		arr.add(3, "400");
		arr.set(0, "Monica");
		
		for(int i= 0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
