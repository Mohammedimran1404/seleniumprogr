package seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RghtClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		By todaysDealL = By.xpath("//*[contains(text(),'Today')and contains(text(),'Deals')]");
		WebElement todaysDeal = driver.findElement(todaysDealL);
		Actions action = new Actions(driver);
		action.contextClick(todaysDeal).build().perform(); // for right click
		Robot robo  = new Robot();
			Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);

		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		

		
		
		

	}

}
