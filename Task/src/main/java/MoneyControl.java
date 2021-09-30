import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MoneyControl {
	@Test
	void Test_1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.moneycontrol.com/stocks/marketstats/indexcomp.php?optex=NSE&opttopic=indexcomp&index=9");
		List<WebElement> nifty50 = driver.findElements(By.xpath("//a[starts-with(@href,'/india/stockpri')]"));
		Thread.sleep(3000);
		for (WebElement webElement : nifty50) {
			String companesName = webElement.getText();
			System.out.println(companesName);

			if (companesName.equals("SBI")) {
				Thread.sleep(3000);
				String Sbichange = driver.findElement(By.xpath(
						"//a[starts-with(@href,'/india/stockpricequote/infrastructuregeneral/adaniportsspecialeconomiczone/MPS')]//parent::td//following-sibling::td[contains(@style,'color:#d60614')]//following-sibling::td[@style='color:#d60614']"))
						.getText();
				System.out.println("% change of Sbi = " + Sbichange);

			}
		}

	}
}
