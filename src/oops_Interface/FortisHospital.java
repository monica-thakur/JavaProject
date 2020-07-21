package oops_Interface;

public class FortisHospital implements USMedical,UKMedical,IndianMedical {

	@Override
	public void orthoServices() {
		System.out.println("FH-->orthoServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH-->dentalServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH-->physioServices");
		
	}

	@Override
	public void pediaService() {
		System.out.println("FH-->pediaService");
		
	}

	@Override
	public void oncology() {
		System.out.println("FH-->oncology");
		
	}

	@Override
	public void cardio() {
		System.out.println("FH-->cardio");
		
	}

	@Override
	public void ENT() {
		System.out.println("FH-->ENT");	
	}
	
	
	public void OPDServices() {
		System.out.println("FH-->OPDServices");
	}
	
	public void medicalInsurance() {
		System.out.println("FH-->medicalInsurance");
	}
	

	
	public static void display() {
		System.out.println("FH--> Display>");
	}
	
	@Override
	public void billing() {
		System.out.println("FH-->Billing");
	}
	
}
