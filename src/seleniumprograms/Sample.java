package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium jarfiles\\chromedriver.exe"); // method for set path
		WebDriver driver = new ChromeDriver();  //reference object
		driver.get("http://www.amazon.in"); // to get something from browser we use predifined method get()

	}

}
