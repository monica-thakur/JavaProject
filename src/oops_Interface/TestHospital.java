package oops_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.orthoServices();
		fh.pediaService();
		fh.OPDServices();
		fh.billing();
		
		System.out.println(fh.min_fee);
		
		//USMedical.min_fee= 100; This can not be done as min_fee variable is final and can not be changed
		System.out.println(USMedical.min_fee);
		

	FortisHospital.display();

		//Interface object can not be created
		USMedical us1 = new FortisHospital();
		us1.orthoServices();
		
	
	//US object can not access methods from UK , India and FortisHospital because of reference Type Check
	
	
		}
	
	}
	


