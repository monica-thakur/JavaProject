package arraylistquestion;

import java.util.ArrayList;

public class ArrayListQues7 {

	public static void main(String[] args) {

		// Question7: Write a Java program to reverse elements in a array list

		ArrayList arr = new ArrayList();

		arr.add(0, "Monica");
		arr.add(1, "Nancy");
		arr.add(2, "Isha");
		arr.add(3, "Dishi");

		System.out.println("Original arrayList: "+ (arr));
		//for (int i = 0; i < arr.size(); i++) {
			//System.out.println(arr.get(i));
		//}
		System.out.println();
		
		arr.add(0, "Dishi");
		arr.remove(4);
		arr.add(1, "Isha");
		arr.remove(4);
		arr.add(2, "Nancy");
		arr.remove(4);

		System.out.println("After reverse arrayList: " + (arr));
		
		//for (int i = 0; i < arr.size(); i++) {
			//System.out.println(arr.get(i));
		//}
	}
}