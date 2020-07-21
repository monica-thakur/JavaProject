package stringManipulationAssignment;

public class StringReverse {

	public static String reverse(String str) {
		int leng = str.length();
		String reverse = "";
		for (int i = leng - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);

		}
		return reverse;
	}

	public static void main(String[] args) {
		// Question 5: Write a function/ method to reverse your own name.b

//		String str = "Monica";// method 1
//
//		int leng = str.length();
//		
//		String reverse ="";
//		for (int i =leng-1; i>=0; i--) {
//			reverse = reverse + str.charAt(i);
//			
//		}
//		System.out.println(reverse);

		// System.out.println(StringReverse.reverse("Monica"));// method 2

		// System.out.println(reverse("Atul"));

//		String str1 = "SeleniumAutomation"; //method 3
//		char c[] = str1.toCharArray();
//		for (int i=c.length-1; i>=0; i--) {
//			System.out.println(c[i]);
//		}

//		String s = "HelloAutomation";   // method 4
//		StringBuilder s1 = new StringBuilder(s);
//		System.out.println(s1.reverse());
		
	}

}
