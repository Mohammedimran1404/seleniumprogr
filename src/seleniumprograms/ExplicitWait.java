package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/waitExample.html");
		
		By showAlertMsgL = By.xpath("/html/body/button"); //absolute x path
		WebElement showAlertMsg = driver.findElement(showAlertMsgL);
		showAlertMsg.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.close();

	}

}
