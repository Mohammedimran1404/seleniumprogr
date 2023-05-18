package edgedriverprograms;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLinks {

	public static void main(String[] args) throws Exception, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		By allLinksL = By.tagName("a");
		List<WebElement> allLinks = driver.findElements(allLinksL);
		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				System.out.println(link.getText());
				Actions action = new Actions(driver);
				action.contextClick(link).build().perform();
				Thread.sleep(1000);
				Robot robo = new Robot();
				robo.keyPress(KeyEvent.VK_DOWN);
				robo.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);

				String currentWindowHandleID = driver.getWindowHandle();
				Set<String> allWindowHanldeID = driver.getWindowHandles();
				for (String wind : allWindowHanldeID) {
					if (!wind.equals(currentWindowHandleID)) {
						driver.switchTo().window(wind);
						

						Thread.sleep(3000);
						driver.close();		
					}
				}
				driver.switchTo().window(currentWindowHandleID);

			}
		}

	}

}
