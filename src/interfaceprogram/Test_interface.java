package interfaceprogram;

import java.util.Scanner;

public class Test_interface {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browsername = scan.next();
		Webdriver driver;
		if(browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new EdgeDriver();
	}
		Webdriver.display();
		driver.get();
		driver.click();
		driver.senKeys();
		driver.screenshot();
	

	}

}
