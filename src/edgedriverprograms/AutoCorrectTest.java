package edgedriverprograms;

import org.openqa.selenium.WebElement;

public class AutoCorrectTest {

	public static void main(String[] args) throws InterruptedException {
		AutoCorrect obj = new AutoCorrect();
		obj.LaunchBrowser();
		obj.OpenURl("http://www.google.com");
		WebElement googlesearchbox = obj.AddTxtInGoogleSearchbox("Selenium");
		obj.searchThirdoptionAndHitEnterKey(googlesearchbox);
		obj.closeBrowser();
	}

}
