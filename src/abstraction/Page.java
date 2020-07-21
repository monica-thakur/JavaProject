package abstraction;

public abstract class Page {
	
	
	public void title() {
		System.out.println("Page title");
	}
	
	abstract void url();
	abstract void number();
	
	public static void plugin() {
		System.out.println(" page plugin");
	}
	
	public final void display() {
		System.out.println("page display");
	}
	
	
	
	
}
