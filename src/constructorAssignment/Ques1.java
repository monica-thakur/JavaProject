package constructorAssignment;

import java.util.ArrayList;

public class Ques1 {
//	Ques1: Design a University class template with the following features:
//		 variables:
//		name
//		country
//		establishedDate
//		List of course provided in Array List<String>
//
//		--Design the constructor of this class with different parameters and all parameters.
//		--Write the get method of each variable with return keyword.
//	
//	

	String name;
	String date;
	String country;
	ArrayList<String> listOFCourses;

	public String getUniversityName() {
		System.out.println(name);
		return name;
	}

	public String getEstablishedDate() {
		System.out.println(date);
		return date;
	}

	public String getcountry() {
		System.out.println(country);
		return country;
	}

	public ArrayList<String> getListOFCourses() {
		System.out.println(listOFCourses);
		return listOFCourses;
	}

	public Ques1(String name, String country, ArrayList<String> listOFCourses) {
		this.name = name;
		this.country = country;
		this.listOFCourses = listOFCourses;
	}

	public Ques1(String name, String date, String country) {
		this.name = name;
		this.date = date;
		this.country = country;
	}

	public Ques1(String name, String country, String date, ArrayList<String> listOFCourses) {
		this.name = name;
		this.country = country;
		this.date = date;
		this.listOFCourses = listOFCourses;
	}
}
