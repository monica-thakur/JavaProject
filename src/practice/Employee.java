package practice;

public class Employee {
	
	String name;
	int age;


	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public static void main(String[] args) {
		Employee A = new Employee("Monica", 22);
		Employee B = new Employee("Tom", 22);
		Employee C = new Employee("Harry", 22);

		
		A=B;
		B=C;
		C=A;
		
		System.out.println(A.name + " " + A.age);
		System.out.println(B.name + " " + B.age);
		System.out.println(C.name + " " + C.age);
		
		//A=B;
		
		
	}

}
