package TakeScrrenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ScreenShot {
	static WebDriver driver = null;

	@Parameters({ "url", " screenshotpath" })
	@Test
	void launchUrl(String url, String screenshotpath) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thesa\\Desktop\\Chrome94\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File( screenshotpath));
		driver.close();

	}

}
