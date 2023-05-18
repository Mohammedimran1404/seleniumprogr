package edgedriverprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium jarfiles\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		By confirmationalerttxtL = By.xpath("//*[text()='Alert with OK & Cancel ']");
		WebElement confirmationalerttxt = driver.findElement(confirmationalerttxtL);
		confirmationalerttxt.click();
		By confirmBoxL = By.xpath("//*[text()='click the button to display a confirm box ']");
		WebElement confirmBox = driver.findElement(confirmBoxL);
		confirmBox.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println("msg : " + alert.getText());
		Thread.sleep(3000);
		alert.accept();

		By promptalertL = By.xpath("//*[text()='Alert with Textbox ']");
		WebElement promptalert = driver.findElement(promptalertL);
		promptalert.click();

		By promptBoxL = By.xpath("//*[text()='click the button to demonstrate the prompt box ']");
		WebElement promptBox = driver.findElement(promptBoxL);
		promptBox.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("imran");
		System.out.println("msg : " + alert1.getText());
		Thread.sleep(3000);
		alert.accept();

	}

}
