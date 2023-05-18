package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.imdb.com/chart/top/?ref_=nv_mv_250");
		
		By moviesL = By.xpath("//table[@class='chart full-width']//tbody//tr//td[@class='titleColumn']");
		List<WebElement> movies = driver.findElements(moviesL);
		for (WebElement ele:movies) {
			System.out.println(ele.getText());
		}
	}

}