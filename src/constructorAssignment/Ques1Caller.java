package constructorAssignment;

import java.util.ArrayList;

public class Ques1Caller {

	public static void main(String[] args) {
		
		ArrayList<String> listOfCourses= new ArrayList<String>();
		listOfCourses.add("Philosophy");
		listOfCourses.add("Math");

		Ques1 university = new Ques1("Oxford", "England","10-02-1880",listOfCourses );
		university.getUniversityName();
		university.getcountry();
		university.getEstablishedDate();
		university.getListOFCourses();
	}

}
