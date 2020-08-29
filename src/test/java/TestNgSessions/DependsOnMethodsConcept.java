package TestNgSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
// all the annotation are optional 
	@Test
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0; 
	}
	@Test(dependsOnMethods= "loginTest") // we will create dependancy 
	public void homePageTest() {
	System.out.println("New Home Test");	
		}
	@Test(dependsOnMethods= "loginTest")
	public void dealsPageTest() {
	System.out.println("deals test");	
	}
	
	//
	
}// after first test case fail it will skip other following test cases