package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.login.Login;
import org.openqa.selenium.WebElement;

public class BaseClass22 extends BaseClass1 {
	public static void main(String[] args) throws IOException, AWTException {

		BaseClass1 bb = new BaseClass1();
		bb.getDriverch();
		bb.wait(30);
		bb.launchurl("http://adactinhotelapp.com/");

		Login l = new Login();

		WebElement name = l.getTxtUsername();
		bb.EnterText(name, "Chettrycharan007");

		WebElement passs = l.getTxtPassword();
		bb.EnterText(passs, "15226681");

		WebElement btnlogin = l.getBtnlogin();
		btnlogin.click();

		WebElement location = bb.locatingElement("id", "location");
		bb.selval(location, "Los Angeles");

		WebElement hotelName = bb.locatingElement("id", "hotels");
		bb.selval(hotelName, "Hotel Sunshine");

		WebElement roomType = bb.locatingElement("id", "room_type");
		bb.selval(roomType, "Super Deluxe");

		WebElement roomNos = bb.locatingElement("id", "room_nos");
		bb.selval(roomNos, "1");

		WebElement inDate = bb.locatingElement("id", "datepick_in");
		inDate.clear();
	//Robot r = new Robot();
	//r.keyPress(KeyEvent.VK_CLEAR);
//		r.keyPress(KeyEvent.VK_A);
	//r.keyRelease(KeyEvent.VK_CLEAR);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_DELETE);
//		r.keyRelease(KeyEvent.VK_DELETE);
		bb.EnterText(inDate, "25/04/2022");

		WebElement outDate = bb.locatingElement("id", "datepick_out");
		outDate.clear();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyPress(KeyEvent.VK_DELETE);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_DELETE);
	bb.EnterText(outDate, "26/04/2022");

		WebElement AdultsperRoom = bb.locatingElement("id", "adult_room");
		bb.selval(AdultsperRoom, "2");

		WebElement childPerRoom = bb.locatingElement("id", "child_room");
		bb.selval(childPerRoom, "0");

		WebElement btnsrch = bb.locatingElement("id", "Submit");
		btnsrch.click();

		WebElement btn2 = bb.locatingElement("id", "radiobutton_0");
		bb.Move(btn2);
		bb.btnClick(btn2);

		WebElement btn3 = bb.locatingElement("id", "continue");
		btn3.click();

		WebElement firstName = bb.locatingElement("id", "first_name");
		bb.EnterText(firstName, "Chettry");

		WebElement lastName = bb.locatingElement("id", "last_name");
		bb.EnterText(lastName, "charan");

		WebElement adress = bb.locatingElement("id", "address");
		bb.EnterText(adress, "Trichy");

		WebElement cardNum = bb.locatingElement("id", "cc_num");
		bb.EnterText(cardNum, "5432 1122 3345 9900");

		WebElement cardType = bb.locatingElement("id", "cc_type");
		bb.selval(cardType, "VISA");

		WebElement exMonth = bb.locatingElement("id", "cc_exp_month");
		bb.selval(exMonth, "12");

		WebElement exYear = bb.locatingElement("id", "cc_exp_year");
		bb.selval(exYear, "2022");

		WebElement cardCvv = bb.locatingElement("id", "cc_cvv");
		bb.EnterText(cardCvv, "007");

		WebElement btn4 = bb.locatingElement("id", "book_now");
		btn4.click();

		WebElement btn5 = bb.locatingElement("id", "my_itinerary");
		btn5.click();

		bb.fileLoc("B:\\Selenium screen shots/adaction.png");
		
		

	}

}
