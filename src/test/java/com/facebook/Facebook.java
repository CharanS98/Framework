package com.facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class Facebook {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Chetty Charan");

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("15226681");

		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();

		TakesScreenshot screen = (TakesScreenshot) driver;
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		FileUtils.copyFile(screenshotAs, new File("B:\\Selenium screen shots//chettry1.png"));

	}
}
