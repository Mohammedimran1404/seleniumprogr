package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		By dropdownL = By.cssSelector("select#searchDropdownBox");
		WebElement dropdown = driver.findElement(dropdownL);
		Select sele = new Select(dropdown);
		sele.selectByIndex(4);

		 List<WebElement> alloptions = sele.getOptions(); 
		 for(WebElement opt: alloptions) { 
		  System.out.println(opt.getText());
		 
		//sele.selectByIndex(4);
		
		 //Thread.sleep(3000); 
		/*.selectByValue("search-alias=furniture");
		 Thread.sleep(3000);
		 sele.selectByVisibleText("Appliances");*/
		 

	}

}
}
