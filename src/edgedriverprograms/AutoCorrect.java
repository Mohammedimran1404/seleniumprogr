package edgedriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoCorrect {
	public WebDriver driver;
	public void LaunchBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\selenium jarfiles\\msedgedriver.exe");
		driver= new EdgeDriver();
	}
	public void OpenURl(String url) {
		driver.get(url);
	}
	public WebElement AddTxtInGoogleSearchbox(String txt) {
		By googlesearchboxL=By.name("q");
		WebElement googlesearchbox = driver.findElement(googlesearchboxL);
		googlesearchbox.sendKeys(txt);
		return googlesearchbox;
	}
	public void searchThirdoptionAndHitEnterKey(WebElement googlesearchbox) throws InterruptedException {
		for(int i=1;i<=3;i++) {
			Thread.sleep(3000);
			googlesearchbox.sendKeys(Keys.ARROW_DOWN);	
		}
		Thread.sleep(3000);
		googlesearchbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	public void closeBrowser() {
		driver.close();
	}
	

}
