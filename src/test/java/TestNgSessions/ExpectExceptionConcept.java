package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectExceptionConcept {

	@Test(expectedExceptions = ArithmeticException.class)  //(expectedExceptions = ArithmeticException.class)-means we can tell to testNg this exception is expected , pass this test case 
	public void getNumbertest() {
		System.out.println("get number test ");
		int i = 9/0;  // we are expecting back an exception Arithmetic Exception 
		
	}
	@Test(expectedExceptions = Exception.class)  //Exception.class- will pass this test case 
	public void getNumbertest1() {
		System.out.println("get number test 1 ");
		int i = 9/0;
	}		
	@Test(expectedExceptions = NullPointerException.class)  //NullPointerException.class- this test case will fail because we are expecting arithmetic exception 
	public void getNumbertest2() {
		System.out.println("get number test 2");
		int i = 9/0;
	}	
	@Test(expectedExceptions = Throwable.class) // Throwable.class--will pass this test case it means  any kind of exception or error it's a super class  
	public void getNumbertest3() {
		System.out.println("get number test 3");
		int i = 9/0;
	}	
	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class}) // it means eather of them , or nullpointer exception or algoritm exception 
	public void getNumbertes4 () {
		System.out.println("get number test 3");
		int i = 9/0;
	}	
}
