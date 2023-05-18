package interfaceprogram;

public interface Webdriver {
	public void click();
	public void senKeys();
	public void get();
	public static void display() {
		System.out.println("welcome to testingworld");	                                             
	}
	public default void screenshot() {
		hello();
	}
	private void hello() {
		System.out.println("i am hidden method ");
	}

}
