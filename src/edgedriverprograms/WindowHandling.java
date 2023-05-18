package edgedriverprograms;

		import java.awt.AWTException;
		import java.awt.Robot;
		import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class WindowHandling {

			public static void main(String[] args) throws AWTException, InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.amazon.in");
				By customerServiceL = By.xpath("//*[text()='Customer Service']");
				WebElement customerService = driver.findElement(customerServiceL);
				Actions action = new Actions(driver);
				action.contextClick(customerService).build().perform();
				Thread.sleep(2000);
				Robot robo = new Robot();
				robo.keyPress(KeyEvent.VK_DOWN);
				robo.keyRelease(KeyEvent.VK_DOWN);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
				String windowHandle =driver.getWindowHandle();
				//System.out.println("current w h " +windowHandle);
				Set <String> allWindowhandles = driver.getWindowHandles();
				//System.out.println(allWindowhandles);
				for(String allwind :allWindowhandles) {
					if(!allwind.equals(windowHandle)) {
						driver.switchTo().window(allwind);
					}
				}
				
				

			}

		


	}


