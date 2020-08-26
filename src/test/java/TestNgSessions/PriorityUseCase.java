package TestNgSessions;
// nonpriority test cases will be picked first and will be executed on their alfabetic order 
//if you have test cases with the same priority test cases will be pick up on basis of alfabetic order 
import org.testng.annotations.Test;

public class PriorityUseCase {

	@Test (priority = 1)
	public void test1() {
	System.out.println("test 1");
	}	
	@Test(priority = 3)
	public void test2() {
		System.out.println("test 2");	
		}
	
	@Test(priority = 2)
    public void test3() {
	System.out.println("test 3");	


    }	
    @Test(priority = 5)
    public void test4() {
	System.out.println("test 4");	


    }	
    @Test(priority = 6)
    public void test5() {
	System.out.println("test 5");	


    }	
   @Test(priority = 4)
    public void test6() {
	System.out.println("test 6");	
}

	
	
	
}
