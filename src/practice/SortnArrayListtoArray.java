package practice;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;

public class SortnArrayListtoArray {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("moni");
		arr.add("atul");
		arr.add("nancy");
		arr.add("papa");
		arr.add("mumy");
		
		System.out.println(arr);

		// --->for sorting

		// System.out.println(arr);
		// Collections.sort(arr);
		// System.out.println(arr);

		//--->convert arrayList into Array
		
		//String names[] = new String[arr.size()];
		
		//arr.toArray(names);
		//for(int i=0; i< names.length; i++) {
			//System.out.println(names[i]);
		//}
		
		//---> convert array to arrayList
		
		Integer number[] = new Integer[3];
		number[0]= 10;
		number[1]= 20;
		number[2]= 30;
		
		ArrayList<Integer> listnum= new ArrayList<Integer>(Arrays.asList(number));
		
		System.out.println(listnum);
		
	}

}
