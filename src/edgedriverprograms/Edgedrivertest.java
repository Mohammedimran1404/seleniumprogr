package edgedriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgedrivertest {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\selenium jarfiles\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.flipkart.in");
	String url=	driver.getCurrentUrl();// to print current URL
    System.out.println(url);

	}

}
