package practice;

import java.util.ArrayList;

public class Student {
	
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
		
	}
	
	public ArrayList<String> getDeptList() {
		
		ArrayList<String> deptList = new ArrayList<String>() ;
		deptList.add("Finance");
		deptList.add("HOD");
		deptList.add("Sales");
		
		return deptList;	
	}
	
	public String[] boardOfMembers() {
		
		String board[] = new String[2];
		board[0]= "Monica";
		board[1]="Atul";
		return board;
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setName("Naveen");
		String n1 =obj.getName();
		System.out.println(n1);
	}

}
