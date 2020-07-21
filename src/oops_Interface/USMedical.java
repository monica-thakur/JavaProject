package oops_Interface;

public interface USMedical {
	
	int min_fee = 10;
	
	public void orthoServices();
	
	public void dentalServices();
	
	
	//this is static method which can be called by interface or class name
	public static void display() {
		System.out.println("Display");
	}
	
	//default method with body is allowed after JDK 1.8 and can be overriden
	public default void billing() {
		System.out.println("Billing");
	}
		}
