package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIsDisplayed_IsEnabled_IsSelected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium jarfiles\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		By textboxL = By.xpath("//*[@id='small-searchterms']");
		WebElement textbox = driver.findElement(textboxL);
		boolean displayed = textbox.isDisplayed();
		System.out.println("Displayed status " + displayed);
		boolean enabled = textbox.isEnabled();
		System.out.println("Enabled status " + enabled);
		// driver.close();
		By radiobuttonmaleL = By.xpath("//*[@id='gender-male']");
		WebElement radiobuttonmale = driver.findElement(radiobuttonmaleL);

		By radiobuttonfemaleL = By.xpath("//input[@id='gender-female']");
		WebElement radiobuttonfemale = driver.findElement(radiobuttonfemaleL);
		System.out.println(radiobuttonmale.isSelected());
		System.out.println(radiobuttonfemale.isSelected());
	
		radiobuttonmale.click(); // select male radio button
		
		System.out.println(radiobuttonmale.isSelected()); // status get true

		System.out.println(radiobuttonfemale.isSelected()); // status get false
		
		radiobuttonfemale.click(); // select female radio button
		
		System.out.println(radiobuttonmale.isSelected()); // status get false
		
		System.out.println(radiobuttonfemale.isSelected()); // status get true 
		


	}

}
