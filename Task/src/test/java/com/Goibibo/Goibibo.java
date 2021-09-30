package com.Goibibo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Goibibo {
	
	
	WebDriver driver = null;
	@Test
	void Test_1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thesa\\Desktop\\Chrome94\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		WebElement ele = driver.findElement(By.id("gosuggest_inputSrc"));
		ele.click();
		ele.sendKeys("Delhi");
		driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
	}
}
