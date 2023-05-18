package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		By textboxL = By.id("email");
		WebElement textbox = driver.findElement(textboxL);
		textbox.sendKeys("imran957398@gmail.com");
		By passboxL = By.id("pass");
		WebElement passbox = driver.findElement(passboxL);
		passbox.sendKeys("Imran@7866");
		By loginL = By.xpath("//button[text()='Log in']");
		WebElement login = driver.findElement(loginL);
		login.click();
		// JavascriptExecutor js = (JavascriptExecutor) driver; // to scroll
		// js.executeScript("arguments[0].scrollIntoView(true)", login);

	}

}
