package com.sheetdatas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation2 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\FrameWork1\\Excel Sheets\\automation66 sheet.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet crt = workbook.createSheet("Automation");

		WebElement drop = driver.findElement(By.id("Skills"));
		Select s = new Select(drop);
		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) { 
			Row createRow = crt.createRow(i);
			Cell createCell1 = createRow.createCell(0);
			WebElement ele = options.get(i);
			String text = ele.getText();
			System.out.println(text);

			createCell1.setCellValue(text);	
		}
		

		FileOutputStream file1 = new FileOutputStream(file);
		workbook.write(file1);
	}
}
