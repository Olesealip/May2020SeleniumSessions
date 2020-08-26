package TestNgSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	@Test(invocationCount = 10)// invocationCount = 10- means the test will be executed 10 time 
public void createUserTest() {
	System.out.println("Create user test");	
	}
}
