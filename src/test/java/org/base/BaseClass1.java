  e  package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public static WebDriver driver;
	static Actions action;
	static Alert alert;

	static JavascriptExecutor executor = (JavascriptExecutor) driver;
static Select s;

	// 1
	public  void getDriverch() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	// 2
	public void launchurl(String url) {
		driver.get(url);

	}

	// 3
	public void EnterText(WebElement element, String data) {
		element.sendKeys(data);

	}

	// 4
	public void btnClick(WebElement element) {

		element.click();

	}

	// 5
	public  WebElement locatingElement(String location, String value) {
		WebElement element = null;

		switch (location) {
		case "id":
			element = driver.findElement(By.id(value));

			break;
		case "name":
			element = driver.findElement(By.name(value));

			break;
		case "xpath":
			element = driver.findElement(By.xpath(value));

			break;
		case "className":
			element = driver.findElement(By.className(value));

			break;
		case "tagName":
			element = driver.findElement(By.tagName(value));

			break;

		default:

			System.out.println("Invalid Locator");
			break;
		}
		return element;
	}

	// 6
	public void Drag(WebElement element, WebElement element1) {
		Actions action = new Actions(driver);

		action.dragAndDrop(element, element1).perform();

	}

	// 7
	public void Move(WebElement element) {
		Actions action = new Actions(driver);

		action.moveToElement(element).perform();
	}

	// 8
	public void doclick(WebElement element) {

		action.doubleClick(element).perform();

	}

	// 9
	public void conClick(WebElement element) {

		action.contextClick(element).perform();
	}

	// 10
	public void gtcrturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// 11
	public void gttit() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// 12
	public void wait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}

	// 13
	public void webwait(int time, String link, String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(link), text));
	}

	// 14
	public void naviTo(String url) {
		driver.navigate().to(url);
	}

	// 15
	public void naviBack() {
		driver.navigate().back();
	}

	// 16
	public void navifor() {
		driver.navigate().forward();
	}

	// 17
	public void naviref() {
		driver.navigate().refresh();

	}

	// 18
	public void accept1() {
		alert.accept();

	}

	// 19
	public void diss() {
		alert.dismiss();

	}

	// 20
	public void send(String value) {
		alert.sendKeys(value);

	}

	// 21
	public void text1() {
		String text = alert.getText();
		System.out.println(text);
	}

	// 22
	public void sleep(int value) throws InterruptedException {
		Thread.sleep(value);

	}

	// 23
	public void acKeyd(String value) {
		action.keyDown(value).perform();

	}

	// 24
	public void acKeyup(String value) {
		action.keyUp(value).perform();

	}

	// 25
	public void acSendkey(String value) {
		action.sendKeys(value).perform();

	}

	// 26
//	public void screensot() {
//		
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//        System.out.println("screenshotAs");
//	}

	// 27
	public void fileLoc( String element) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(screenshotAs);
		FileUtils.copyFile(screenshotAs, new File(element));

	}

	// 28
	public void down1(String text) {
		WebElement down = driver.findElement(By.id(text));
		executor.executeScript("arguments[0].scrollIntoview(true)", down);

	}

	// 29
	public void close() {
		driver.quit();
	}

	// 30
	public void wHandeles(String p, String c) {
		Set<String> windowAll = driver.getWindowHandles();
		System.out.println(windowAll);
		for (String s : windowAll) {

			if (c.equals(p)) {

			} else {
				driver.switchTo().window(s);

			}
		}
	}

	public void whandle() {
		String window1 = driver.getWindowHandle();
		System.out.println(window1);

	}

	// 31
	public void findeles(String text) {
		List<WebElement> find = driver.findElements(By.xpath(text));
		for (int i = 0; i < find.size(); i++) {
			WebElement web = find.get(i);

			String text2 = web.getText();

		}

	}

	// 32
	public void selIn(int index) {
		s.selectByIndex(index);

	}

	// 33
	public void selval(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByValue(text);
	}

	// 34
	public void selvistxt(String text) {
		s.selectByVisibleText(text);

	}

	// 35
	public void sgetopt() {
		List<WebElement> op1 = s.getOptions();
		for (int i = 0; i < op1.size(); i++) {
			WebElement web1 = op1.get(i);
			String text = web1.getText();
		}
	}

	// 36
	public void sgetfirstop() {
		s.getFirstSelectedOption();

	}

	// 37
	public void getAllsel() {
		s.getAllSelectedOptions();

	}

	// 38
	public void deselectin(int index) {
		s.deselectByIndex(index);

	}

	// 39
	public void deselectAll() {
		s.deselectAll();

	}

	// 40
	public void deselval(String value) {
		s.deselectByValue(value);

	}

	// 41
	public void deseltext(String text) {
		s.deselectByVisibleText(text);
	}

	// 41
	public void getxeceldata(String locat, String sheetname, int value, int index) throws IOException {
		File file = new File(locat);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row1 = sheet.createRow(index);
		Cell createCell = row1.createCell(value);

	}

	// 42
	public void creatXcel(String location, String sheetname, int value, int index) throws IOException {
		File file = new File(location);
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet(sheetname);
		Row row = sheet.createRow(index);
		Cell cell = row.createCell(value);
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);
	}

	// 43
	public void getatribute(WebElement m, String name) {
		String string = m.getAttribute(name);
		System.out.println(string);
	}

	// 44
	public void fluentwait(int time, Duration interval, String text) {
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(time)).pollingEvery(interval);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(text)));
	}

	// 45
	public void submit(WebElement m) {
		m.submit();
	}

	// 46
	public void multi() {
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	// 47
	public void pagesour() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	// 48
	private void identify(int value) {
		System.identityHashCode(value);
	}

	// 49
	public void switchframe(int indox) {
		driver.switchTo().frame(indox);
	}

	// 50
	public void gettagname(WebElement m) {
		m.getTagName();
	}

//private void press(Robot keycode) throws AWTException {
//	Robot r = new Robot();
//	r.keyPress(keyEvent.keycode);
//}













}





