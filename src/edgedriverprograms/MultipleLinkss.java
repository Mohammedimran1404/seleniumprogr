package edgedriverprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLinkss {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\selenium jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		By googleLinkL = By.tagName("a");
		List<WebElement> googleLink=driver.findElements(googleLinkL);
		for(WebElement link:googleLink) {
			if(link.isDisplayed()) {
				System.out.println(link.getText());
				Actions action = new Actions(driver);
				action.contextClick(link).build().perform();
				 Robot robo = new Robot();
				  robo.keyPress(KeyEvent.VK_DOWN);
				  robo.keyRelease(KeyEvent.VK_DOWN);
				  
				  robo.keyPress(KeyEvent.VK_ENTER);
				  robo.keyRelease(KeyEvent.VK_ENTER);
				  Thread.sleep(2000);
				  String windoHandle = driver.getWindowHandle();
				  Set<String> allwindowhandles= driver.getWindowHandles();
				  for(String wind:allwindowhandles) {
					  if(!wind.equals(windoHandle)) {
						  driver.switchTo().window(wind);
						  driver.close();
						  Thread.sleep(1000);
						  
					  }
				  }
				  
				  driver.switchTo().window(windoHandle);
				
			}
		}
		

	}

}
