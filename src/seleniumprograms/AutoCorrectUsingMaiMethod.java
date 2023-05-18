package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCorrectUsingMaiMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		By googlesearchboxL = By.name("q");
		WebElement googlesearchbox = driver.findElement(googlesearchboxL);
		googlesearchbox.sendKeys("Selenium");
		for (int i = 1; i <= 3; i++) {
			Thread.sleep(3000);
			googlesearchbox.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(3000);
		googlesearchbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

}
