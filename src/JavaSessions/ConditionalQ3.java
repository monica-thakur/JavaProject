package JavaSessions;

import java.util.Scanner;

public class ConditionalQ3 {

	public static void main(String[] args) {
		
		//Question: Maintain one Student name and do the following conditions:
					//Please maintain a score number variable here.
					//if student name is "Virat" then score is 100
					//if student name is "Smith" then score is 90
					//if student name is "Sachin" then score is 200
					//if student name is "Werner" then print this player is not found

		String name;
		// int score;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		name = sc.nextLine();
		
		name = name.toLowerCase();
		
		if (name.equals("virat")) {
			System.out.println("score is 100");
		}
		else if (name.equals("smith")) {
			System.out.println("Score is 90");
		}
		else if (name.equals("sachin")) {
			System.out.println("Score is 200");
		}
		else if (name.equals("werner")) {
			System.out.println("this player is not found");
		}
		else {
			System.out.println("Incorrect name");
		}
	}
}
