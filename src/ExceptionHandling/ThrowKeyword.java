package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try {
			throw new Exception("This is my exception");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
