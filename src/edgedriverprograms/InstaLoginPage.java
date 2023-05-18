package edgedriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InstaLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.instagram.com");
		By txtboxL = By.name("username");
		WebElement txtbox =driver.findElement(txtboxL);
		txtbox.sendKeys("imran957398@gmail.com");
		

	}

}
