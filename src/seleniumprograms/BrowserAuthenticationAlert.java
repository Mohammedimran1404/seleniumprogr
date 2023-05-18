package seleniumprograms;

public class BrowserAuthenticationAlert extends Alerts {

	public static void main(String[] args) throws InterruptedException {
		BrowserAuthenticationAlert obj = new BrowserAuthenticationAlert();
		obj.launchbrowser();
		Thread.sleep(3000);
		obj.openurl("http://admin:admin@the-internet.herokuapp.com/");
		obj.clickOnAlertPageBtn("Basic Auth");

	}

}
//in these we have used multilevel inheritance Autocorrect is grandfather
//Alert is father and BrowserAuthenticationAlert is child
// //*[contains(text(),'Basic Auth')] if we use contains 