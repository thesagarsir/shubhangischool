import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Flipcart {

	@FindBy(xpath = "//input[@type='text']")
	WebElement searchBox;
	
	WebDriver driver = null;

	public Flipcart(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	
	@BeforeSuite
	void initilization() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test
	void Check_Title() throws Exception {
		
		Thread.sleep(3000);
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(3000);
		close.click();
		String actual = driver.getTitle();
		System.out.println(actual);
		String exp = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(actual, exp);
	}

	@Test
	void check_SearchBoxText() {
		String actual = searchBox.getText();
		Assert.assertEquals(actual, "er");

	}

}
