package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCorrect {
	public WebDriver driver;

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium jarfiles\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openurl(String url) {
		driver.get(url);
	}

	public WebElement setTextInGoogleSearchBox(String text) {
		By googlesearchboxL = By.name("q");
		WebElement googlesearchbox = driver.findElement(googlesearchboxL);
		googlesearchbox.sendKeys(text);
		return googlesearchbox;
	}

	public void selectThirdOptionAndHitEnterKey(WebElement googlesearchbox) throws InterruptedException {
		for (int i = 1; i <= 3; i++) {
			Thread.sleep(3000);
			googlesearchbox.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(3000); // in real time thread.sleep is not using
		googlesearchbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	public void closebrowser() {
		driver.close();
	}

}
