package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplictWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6)); // implicit wait

		By accountsAndListL = By.xpath("//*[text()='Account & Lists']");
		WebElement accountsAndList = driver.findElement(accountsAndListL);
		Actions action = new Actions(driver);
		action.moveToElement(accountsAndList).build().perform();

		By discoverstyleL = By.xpath("//*[text()='Discove Your Style']");
		WebElement discoverstyle = driver.findElement(discoverstyleL);
		discoverstyle.click();
	}

}
