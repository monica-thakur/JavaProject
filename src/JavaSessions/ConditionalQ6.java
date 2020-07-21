package JavaSessions;

import java.util.Scanner;

public class ConditionalQ6 {

	public static void main(String[] args) {
		//Question6: Java Program to Check Whether an Alphabet is Vowel or Consonant
		
		char a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet");
		a = sc.next().charAt(0);
		
		switch (a) {
		case 'a':
			System.out.println("Alphabet is vowel");
			break;	
		case 'e':
			System.out.println("Alphabet is vowel");
			break;	
		case 'i':
			System.out.println("Alphabet is vowel");
			break;
		case 'o':
			System.out.println("Alphabet is vowel");
			break;
		case 'u':
			System.out.println("Alphabet is vowel");
			break;
		default:
			System.out.println("Alphabet is consonant");
			break;
		}

	}

}
