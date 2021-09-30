package com.JavaScrptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriipt {
	WebDriver driver = null;

	@Test (priority=0)
	void initilization() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thesa\\Desktop\\Chrome94\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://javabykiran.com/playground/");

	}

	@Test(priority = 1)
	void scrol_Down() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement link = driver.findElement(By.linkText(""));
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("JavaByKiran.com")));
		Thread.sleep(3000);
		driver.findElement(By.linkText("JavaByKiran.com")).click();
		//link.click();

	}

	/*
	 * @Test(priority = 2) void refresh() throws InterruptedException {
	 * JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(3000);
	 * js.executeScript("history.go(0)"); }
	 */

	@Test(priority = 2)
	void scrollOperation() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement mockInterview = driver.findElement(By.xpath("//span[text()='Mock Interview Sessions']"));
		Thread.sleep(3000);
		js.executeScript("argument[0].scrollIntoView();", mockInterview);
		Thread.sleep(3000);
		mockInterview.click();

	}

	/*
	 * @Test void clickOperetion() throws InterruptedException { JavascriptExecutor
	 * js = (JavascriptExecutor) driver; WebElement mockInterview =
	 * driver.findElement(By.xpath("//span[text()='Mock Interview Sessions']"));
	 * Thread.sleep(3000); js.executeScript("argument[0].click();", mockInterview);
	 * 
	 * }
	 */
}
