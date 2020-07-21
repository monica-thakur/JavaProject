package ArrayNArrayListAssignment;

public class Question2 {

	public static void main(String[] args) {
		// Question 2: Write a program to create a static Array, having following
		// cricket data:
		// --name, age, team name, DOB, gender, Strike Rate
		// --Try to create multiple Object Arrays for different players
		// --Try to print all the values of each player on the console

		Object cricket1[] = new Object[6];
		cricket1[0] = "Sachin";
		cricket1[1] = 30;
		cricket1[2] = "A";
		cricket1[3] = "12-November-1980";
		cricket1[4] = "male";
		cricket1[5] = 100;
		System.out.println("Player 1 details:");
		for (int i = 0; i < cricket1.length; i++) {
			System.out.println(cricket1[i]);
		}
		System.out.println();
		
		Object cricket2[] = new Object[6];
		cricket2[0] = "Dhoni";
		cricket2[1] = 32;
		cricket2[2] = "B";
		cricket2[3] = "12-April-1980";
		cricket2[4] = "male";
		cricket2[5] = 110;
		System.out.println("Player 2 details:");
		for (int i = 0; i < cricket2.length; i++) {
			System.out.println(cricket2[i]);
		}
		System.out.println();
		
		Object cricket3[] = new Object[6];
		cricket3[0] = "Buttler";
		cricket3[1] = 32;
		cricket3[2] = "B";
		cricket3[3] = "1-January-1881";
		cricket3[4] = "male";
		cricket3[5] = 117.4;
		System.out.println("Player 3 details:");
		for (int i = 0; i < cricket3.length; i++) {
			System.out.println(cricket3[i]);
		}
		System.out.println();
		
	}
}
