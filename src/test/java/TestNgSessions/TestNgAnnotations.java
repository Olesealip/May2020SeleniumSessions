package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
//BS - before suit
	//BT - before test
	//BC- before class
	//BF- before method - BM will be executet before each and every test 
	
//BM
	//T1
//AM
//BM
	//T2
//AM
	
	//AC
	//AT
	//AS
	
	
	@BeforeSuite
	public void beforeSuitMethod() {
	System.out.println("before suit---create user in DB");	
	}	
	@BeforeTest  // means before class , when you execute your test class
	public void beforeTest() {
	System.out.println("before test----upload user details");	
	}
	@BeforeClass
	public void beforeClass(){
	System.out.println("Before Class----launch browser and URL");	
		
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method ---- login to the application ");
	}
	@Test(priority = 1)
	public void verifyUserNameTest() {
		System.out.println(" test1--Verify user name test ");
		int i = 9/0; 	 //it will throw an exception 
	}
	@Test(priority = 2)
	public void verifyUserAccountName() {
		System.out.println("Test 2-- verify user account test");
		
	}
	@AfterMethod 
	public void logout() {
		 System.out.println("After Method----Logout from  the application");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class--");
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test----Delete user from DB ");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("After Suite---Disconect from DB");
	}	
	}
//rs: 
//[RemoteTestNG] detected TestNG version 6.14.3
//before suit---create user in DB
//before test----upload user details
//Before Class----launch browser and URL
//Before method ---- login to the application 
// test1--Verify user name test 
//After Method----Logout from  the application
//Before method ---- login to the application 
//Test 2-- verify user account test
//After Method----Logout from  the application
//After class--
//After Test----Delete user from DB 
//PASSED: verifyUserNameTest
//PASSED: verifyUserAccountName
//
//===============================================
//    Default test
//    Tests run: 2, Failures: 0, Skips: 0
//===============================================
//
//After Suite---Disconect from DB
//
//===============================================
//Default suite
//Total tests run: 2, Failures: 0, Skips: 0
//	
//
