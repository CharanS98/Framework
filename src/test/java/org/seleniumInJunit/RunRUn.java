package org.seleniumInJunit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunRUn {
	static WebDriver driver;


@BeforeSuite
private void launchBrowser() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
}
 
@Test
  
private void facebook() {
	
driver.get("https://www.facebook.com/login/");
}

@Test
private void Flipkart() {
driver.get("https://www.flipkart.com/");
}

@Test
private void automation() {
driver.get("http://demo.automationtesting.in/Register.html");
}

@AfterSuite
private void close() {
driver.close();
}










}
