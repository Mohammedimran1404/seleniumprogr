package seleniumprograms;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AdvancedAutoCorrectProgramTest {

	public static void main(String[] args) throws InterruptedException {
		String url = "http://www.google.com";

		AdvancedAutoCorrectProgram obj= new AdvancedAutoCorrectProgram();
		obj.launchbrowser();
		obj.openurl(url);
		WebElement googlesearchbox =obj.setTextInGoogleSearchBox("Selenium");
		List<String> suggestedlistvalues=obj.getsuggestedList();
		boolean status=obj.verifySuggestedListContainsSearchedText(suggestedlistvalues, "Selenium");
		Assert.assertTrue(status);
		int position =obj.selectSpecificValueinSuggestedListAndHitEnterKey(suggestedlistvalues, "selenium ide");
		obj.selectThirdOptionAndHitEnterKey(googlesearchbox, position);
		//obj.closebrowser();



	}

}
