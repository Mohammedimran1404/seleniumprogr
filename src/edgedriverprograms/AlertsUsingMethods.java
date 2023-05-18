package edgedriverprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertsUsingMethods {
	public WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\selenium jarfiles\\msedgedriver.exe");
		 driver = new EdgeDriver();		
	}
	public void openurl(String url) {
		driver.get(url);
	}
	public void clickOnAlertBtn(String AlertTxtBtn) {
		By AlertBtnL =By.xpath("//*[contains(text(),'"+AlertTxtBtn +"')]");
		WebElement AlertBtn = driver.findElement(AlertBtnL);
		AlertBtn.click();	
	}
	public void handleSimpleAlert() throws InterruptedException {
		this.clickOnAlertBtn("Alert with OK ");
		this.clickOnAlertBtn("click the button to display an  alert box:");
		Alert alert = driver.switchTo().alert();
		System.out.println("message : "+alert.getText());
		Thread.sleep(3000);
		alert.accept();	
	}
	public void handleConfirmationAlert() throws InterruptedException {
		this.clickOnAlertBtn("Alert with OK & Cancel ");
		this.clickOnAlertBtn("click the button to display a confirm box ");
		Alert alert = driver.switchTo().alert();
		System.out.println("Message : "+alert.getText());
		Thread.sleep(3000);
		alert.accept();
	}
	public void handlePromptAlert() throws InterruptedException {
		this.clickOnAlertBtn("Alert with Textbox ");
		this.clickOnAlertBtn("click the button to demonstrate the prompt box ");
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("kiya karre miyan");
		System.out.println("msg : "+alert.getText());
		Thread.sleep(3000);
		alert.accept();
	}
	public static void main(String[] args) throws InterruptedException {
		AlertsUsingMethods obj = new AlertsUsingMethods();
		obj.launchBrowser();
		obj.openurl("https://demo.automationtesting.in/Alerts.html");
		obj.handleSimpleAlert();
		obj.handleConfirmationAlert();
		obj.handlePromptAlert();
	}

}
