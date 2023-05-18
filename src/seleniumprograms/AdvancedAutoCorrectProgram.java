package seleniumprograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedAutoCorrectProgram {
	public WebDriver driver;

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jarfiles\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openurl(String url) {
		driver.get(url);
	}

	public WebElement setTextInGoogleSearchBox(String text) {
		By googlesearchboxL = By.name("q");
		WebElement googlesearchbox = driver.findElement(googlesearchboxL);
		googlesearchbox.sendKeys(text);
		return googlesearchbox;
	}

	public List<String> getsuggestedList() throws InterruptedException {
		Thread.sleep(3000);
		By suggestedlistL = By.xpath("//*[@class='OBMEnb']//child::*[contains(@class='wM6W7d')]");
		List<WebElement> suggestedlist = driver.findElements(suggestedlistL);
		List<String> suggestedlistvalues = new ArrayList<String>();
		for (WebElement ele : suggestedlist) {
			String data = ele.getText();
			suggestedlistvalues.add(data);
		}
		System.out.println(suggestedlistvalues);
		return suggestedlistvalues;
	}

	public boolean verifySuggestedListContainsSearchedText(List<String> suggestedlistvalues, String searchtext) {
		boolean status = true;
		for (int i = 0; i < suggestedlistvalues.size(); i++) {
			String actualdata = suggestedlistvalues.get(i);
			String expecteddata = searchtext.toLowerCase();
			if (!actualdata.contains(expecteddata)) {

				status = false;
				break;
			}
		}
		return status;

	}

	public int selectSpecificValueinSuggestedListAndHitEnterKey(List<String> suggestedlistvalues, String searchtext) {
		int position = 0;
		for (int i = 0; i < suggestedlistvalues.size(); i++) {
			String data =suggestedlistvalues.get(i);
			if(data.equalsIgnoreCase(searchtext));
			position=i;
			break;

		}
     return position;
}
	public void selectThirdOptionAndHitEnterKey(WebElement googlesearchbox,int position) throws InterruptedException {
		for (int i = 1; i <= position; i++) {
			Thread.sleep(3000);
			googlesearchbox.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(3000); // in real time thread.sleep is not use
		googlesearchbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	public void closebrowser() {
		driver.close();

	}
}
