package com.bmw.test;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BMW_Test_Base {
	public WebDriver driver;
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.bmw.in/en");
	  driver.manage().window().maximize();
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}