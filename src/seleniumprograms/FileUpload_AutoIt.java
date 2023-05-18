package seleniumprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_AutoIt {
	public static void main(String[] args) {		
	System.setProperty("webdriver.chrome.driver" ,"C:\\selenium jarfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.sejda.com/word-to-pdf");
	By uploadFileL = By.name("file");
	WebElement uploadFile = driver.findElement(uploadFileL);
			Actions action = new Actions(driver);
			action.click(uploadFile).build().perform();
			

}
}
