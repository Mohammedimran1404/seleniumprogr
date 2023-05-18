package interfaceprogram;

public class ChromeDriver implements Webdriver {

	@Override
	public void click() {
		System.out.println("Click by using chrome browser");
	}

	@Override
	public void senKeys() {
		System.out.println("sendKeys by using chrome  browser");

	}

	@Override
	public void get() {
		System.out.println("get by usig chrome browser ");
	}

	public void display() {
		System.out.println("Welcome to chrome browser");
	}

	
}
