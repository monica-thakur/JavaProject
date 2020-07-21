package arraylistquestion;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add("Monica");
		ar.add(true);
		ar.remove(0);
		
		
		System.out.println(ar.get(0));
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(200);
	}

}
