package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		By emailtextboxL = By.id("identifierId");
		// on browser search for locator if it is found get reference and store inside
		// variable
		WebElement emailtextbox = driver.findElement(emailtextboxL);
		emailtextbox.sendKeys("imran957398@gmail.com");
		By textbuttonL = By.xpath("//span[text()='Next']");
		WebElement textbutton = driver.findElement(textbuttonL);
		textbutton.click();
	}
}
