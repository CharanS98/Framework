package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {
	
	
	
@BeforeClass
private void befclass() {
System.out.println("bef class");
}	
	@BeforeMethod
private void befmeth() {
System.out.println("bef meth");
}	
	@AfterClass
private void Aftclass() {
System.out.println("Aft class");
}	
	@AfterMethod
private void AftMeth() {
System.out.println("Aft meth");
}		 
	
	

@Test
private void te1() {
System.out.println("test1");
}
///@Parameters({"username","password"})
//
//@Test
//private void te2(String s,String s1) {
//System.out.println(s);
//System.out.println(s1);
//}











}
