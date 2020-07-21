package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try{
			int a = 9 / 0;
	
				
			
			
		}
		catch(Exception e) {
			System.out.println("We got an exception");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("A");
		System.out.println("A");

		
	}

}
