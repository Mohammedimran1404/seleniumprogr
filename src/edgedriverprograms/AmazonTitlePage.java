package edgedriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonTitlePage {

	public static void main(String[] args) {
		String expectedtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		System.setProperty("webdriver.edge.driver", "C:\\selenium jarfiles\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.amazon.in");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		if (actualtitle.equals(expectedtitle))
			System.out.println("pass");
		else
			System.out.println("fail");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
