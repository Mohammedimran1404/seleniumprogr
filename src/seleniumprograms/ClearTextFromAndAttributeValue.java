package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextFromAndAttributeValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium jarfiles\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		By searchboxL=By.xpath("//*[@id='Email']");
		WebElement searchbox = driver.findElement(searchboxL);
		//searchbox.clear(); // to clear the text which is present in the search box
		//searchbox.sendKeys("imran");
		System.out.println(searchbox.getAttribute("value"));

	}

}
