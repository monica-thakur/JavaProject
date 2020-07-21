package methodAssignment;

public class Ques3 {

	public float areaOfCircle(float radius) {
		float area = 3.14f * radius * radius;

		return area;
	}

	public float circumferenceOfCircle(float radius) {

		float circumference = 2 * 3.14f * radius;
		return circumference;
	}

	public static void main(String[] args) {
//Question3: Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

		Ques3 obj = new Ques3();
		System.out.println("Area of circle is: " + obj.areaOfCircle(2));
		System.out.println("Circumference of circle is: " + obj.circumferenceOfCircle(3));

	}
}
