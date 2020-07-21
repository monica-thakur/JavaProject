package interviewQuestionsPart1;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
	
		char c = 'g';
		
		
		if ((c=='a')||(c=='e')||(c=='i') ||(c=='0') ||(c=='u')){
			
			System.out.println(c + " is vowel");
		
		}
		else {
			System.out.println(c + " is consonant");
			
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(c + " is vowel");
				break;
				
			default:
				System.out.println(c + " is consonant");
				break;
			}
		}
	}
}
