package practice;

public class FunctionsInJava {
	
	String name;
	int age;
	String email;
	long phone;
	
	public void getName() {
		System.out.println("name");
	}
	
	public String getTrainerName()
	{
		System.out.println("Trainer name is:");
		String name= "Naveen";
		return name;
	}
	
	public int add() {
		int a =100;
		int b= 100;
		int c= a+b;
		System.out.println("total is:");
		
		return c;
		}
	
	public int multiply(int a, int b) {
		int c= a*b;
		return c;
		
	}

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.name= "Monica";
		obj.age= 12;
		
		//obj.getName();
		System.out.println(obj.getTrainerName());
		
		System.out.println(obj.add());
		
		System.out.println(obj.multiply(2, 3 ));

	}

}
