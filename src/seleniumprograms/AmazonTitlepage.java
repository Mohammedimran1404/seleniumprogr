package seleniumprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonTitlepage {
	public static void main(String[] args) {
		String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";			
		System.setProperty("webdriver.chrome.driver","C:\\selenium jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		driver.get("http://www.amazon.in"); //open URl
	    String actualtitle=driver.getTitle(); // to get a title
	    System.out.println(actualtitle); 
	    if(actualtitle.equals(expectedtitle))
	    	System.out.println("test script is pass");
	    else
	    	System.out.println("test script is fail");
	    String url = driver.getCurrentUrl(); // to get the current url
	    System.out.println(url);
	    driver.close(); // to close browser

	}

}
