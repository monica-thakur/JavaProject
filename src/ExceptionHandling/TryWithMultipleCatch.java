package ExceptionHandling;

public class TryWithMultipleCatch {

	String name = "Naveen";

	public static void main(String[] args) {
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");

		try {
			// You have not created any object and just created a reference name
			// and trying to access property

			int a = 9 / 0;

			TryWithMultipleCatch obj = null;
			System.out.println(obj.name);

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}
		System.out.println("Bye");
	}

}
