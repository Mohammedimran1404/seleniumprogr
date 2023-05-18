package seleniumprograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/multiplebox1.html");
		By dropdownL = By.xpath("/html/body/center/select");// absolute xpath
		WebElement dropdown = driver.findElement(dropdownL);
		Select sele = new Select(dropdown);
		List<WebElement> alloptions = sele.getOptions();
		List<String> alloptionsvalue = new ArrayList<String>();
		for (WebElement ele : alloptions) {
			System.out.println(ele.getText());
			// sele.selectByIndex(2);
			for (String value : alloptionsvalue) {
				if (value.equals("Selenium RC") || value.equals("Selenium WebDriver")) {
					sele.selectByVisibleText(value);
				}
				List<WebElement> allSelectedOptions = sele.getAllSelectedOptions();
				for (WebElement element : allSelectedOptions) {
					System.out.println(element.getText());
				}
			}

		}

	}

}
