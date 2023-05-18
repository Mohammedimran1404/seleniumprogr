package seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
public static void takescreenshot(WebDriver driver,String imagename) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File(".//screenshots//"+imagename+".png"));
}
		

	}
// 		ScreenShot.takescreenshot(driver, "img1");// to take screenshot we have created another class calling


