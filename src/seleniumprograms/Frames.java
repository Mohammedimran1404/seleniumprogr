package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/frames.html");
		
		driver.switchTo().frame(0);
		By framesL = By.xpath("//*[@id='001']");
		WebElement frames = driver.findElement(framesL);
		frames.sendKeys("hello");
		driver.switchTo().defaultContent(); // this is use to come out of the frame
		
		Thread.sleep(2000);
		driver.switchTo().frame(1); // it is use to enter in frame
		By frame2L = By.xpath("//*[@id='002']");
		WebElement frame2 = driver.findElement(frame2L);
		frame2.sendKeys("these");
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		By frame3L = By.id("003");

		//By frame3L = By.xpath("//*[@id='003']");
		WebElement frame3 = driver.findElement(frame3L);
		frame3.sendKeys("is");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
