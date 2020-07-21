package JavaSessions;

import java.util.Scanner;

public class ConditionalQ3Switch {

	public static void main(String[] args) {
		
		//Question: Maintain one Student name and do the following conditions:
					//Please maintain a score number variable here.
					//if student name is "Virat" then score is 100
					//if student name is "Smith" then score is 90
					//if student name is "Sachin" then score is 200
					//if student name is "Werner" then print this player is not found
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.nextLine();
		name = name.toLowerCase();
		
		
		switch (name) {
		case "virat":
			System.out.println("Score is 100");
			break;
		case "smith":
			System.out.println("Score is 90");
			break;
		case "sachin":
			System.out.println("Score is 200");
			break;
		case "werner":
			System.out.println("this player is not found");
			break;	
		default:
			System.out.println("Incorrect name");
			break;
		}
	}

}
