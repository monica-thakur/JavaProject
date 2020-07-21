
public class StringManipulation {

	public static void main(String[] args) {

		String str = "This is my java code and I am happy";
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf('s'));// 1st occurrence of s
		System.out.println(str.indexOf("s", 4));
		System.out.println(str.indexOf("s", str.indexOf('s')+1));//2nd occurrence of s
		
		System.out.println(str.indexOf("my"));
		
		String s1= " Hello World   ";
		System.out.println(s1.trim());
		
		String s2= "hello";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		
		
	}

}
