package com.myTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {



@Test
public void crmLoginPageTest() {
Assert.assertEquals(driver.getTitle(),"HubSpot Login");	
}


}


