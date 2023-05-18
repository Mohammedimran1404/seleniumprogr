package edgedriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\selenium jarfiles\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.amazon.com");
		By accountAndListL = By.xpath("//*[text()='Account & Lists']");
		WebElement accountAndList=driver.findElement(accountAndListL);
		Actions action = new Actions(driver);
		action.moveToElement(accountAndList).build().perform();
		By accountL=By.xpath("//*[text()='Account']");
		WebElement account = driver.findElement(accountL);
		account.click();

	}

}
