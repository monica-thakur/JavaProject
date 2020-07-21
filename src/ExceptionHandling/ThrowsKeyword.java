package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		try{
			obj.getName();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		System.out.println("Bye");

	}

	public void getName() throws ArithmeticException{
		System.out.println("print name");
		getNumber();

	}

	public void getNumber()  throws ArithmeticException{
		System.out.println("print number");
		int i = 9 / 0;
	}
}
