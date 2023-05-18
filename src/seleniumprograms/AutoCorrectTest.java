package seleniumprograms;

import org.openqa.selenium.WebElement;

public class AutoCorrectTest {

	public static void main(String[] args) throws InterruptedException {
		String url = "http://www.google.com";
		AutoCorrect obj = new AutoCorrect();
		obj.launchbrowser();
		obj.openurl(url);
		WebElement googlesearchbox =obj.setTextInGoogleSearchBox("Selenium");
		obj.selectThirdOptionAndHitEnterKey(googlesearchbox);
		obj.closebrowser();

	}

}
