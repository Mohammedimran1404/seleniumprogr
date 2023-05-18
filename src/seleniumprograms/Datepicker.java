package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		ScreenShot.takescreenshot(driver, "img1");// to take screenshot we have created another class calling
		driver.manage().window().maximize(); // to maximize the window
		By exampleL = By.xpath("//*[text()='Examples']");
		WebElement example = driver.findElement(exampleL);

		ScreenShot.takescreenshot(driver, "img2");

		JavascriptExecutor js = (JavascriptExecutor) driver; // to scroll
		js.executeScript("arguments[0].scrollIntoView(true)", example);

		driver.switchTo().frame(0);
		ScreenShot.takescreenshot(driver, "img3");

		By datepickerL = By.cssSelector("input#datepicker[class='hasDatepicker']");
		WebElement datepicker = driver.findElement(datepickerL);
		datepicker.click();
		ScreenShot.takescreenshot(driver, "img4");

		for (int i = 1; i <= 3; i++) {
			Thread.sleep(2000);
			By nextbtnL = By.xpath("//*[text()='Next']");
			WebElement nextbtn = driver.findElement(nextbtnL);
			nextbtn.click();
			ScreenShot.takescreenshot(driver, "img" + (4 + i));

		}
		By buttonL = By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td");
		List<WebElement> button = driver.findElements(buttonL);
		for (WebElement ele : button) {
			if (ele.getText().equals("18")) {
				ele.click();
				ScreenShot.takescreenshot(driver, "img8");

			}

		}
	}

}
