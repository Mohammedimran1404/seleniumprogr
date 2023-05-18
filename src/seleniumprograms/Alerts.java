package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Alerts extends AutoCorrect {
	public void clickOnAlertPageBtn(String alertTxtBtn) {
		By alertBtnL = By.xpath("//*[contains(text(),'" + alertTxtBtn + "')]");
		WebElement alertBtn = driver.findElement(alertBtnL);
		alertBtn.click();
	}

	public void handleConfirmAlertBox() throws InterruptedException {
		this.clickOnAlertPageBtn("Alert with OK & Cancel ");
		this.clickOnAlertPageBtn("click the button to display a confirm box ");
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Alert confirm msg : " + alert.getText());
		alert.accept();
		By alertmsgL=By.id("demo");
		WebElement alertmsg = driver.findElement(alertmsgL);
		Assert.assertTrue(alertmsg.getText().equals("You pressed Ok"),"Test script Failed as expected msg not displayed");
	}
	public void handlePromptAlert() throws InterruptedException {
		this.clickOnAlertPageBtn("Alert with Textbox ");
		this.clickOnAlertPageBtn("click the button to demonstrate the prompt box ");
		Alert alert=driver.switchTo().alert();
		System.out.println("message : "+alert.getText());
		alert.sendKeys("imran");
		Thread.sleep(3000);
		alert.accept();

	}

	public static void main(String[] args) throws InterruptedException {
		Alerts obj = new Alerts();
		obj.launchbrowser();
		obj.openurl("https://demo.automationtesting.in/Alerts.html");
		obj.handleConfirmAlertBox();
		obj.handlePromptAlert();
		

	}
}
