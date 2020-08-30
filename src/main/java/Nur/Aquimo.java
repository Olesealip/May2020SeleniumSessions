package Nur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Aquimo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		long start = System.currentTimeMillis();
				driver.get("http://dev.aquimo.com/index.html");
				driver.manage().deleteAllCookies();
				long finish = System.currentTimeMillis();
				long totalTime = finish - start; 
				System.out.println("Total number- "+totalTime); 

		WebElement home=driver.findElement(By.xpath("//div[text()='Home'] "));
		
		
		
		
		
		String beforeColor= home.getCssValue("color");
	
	System.out.println(beforeColor);
		
		
		
//		Actions action = new Actions(driver);
//	 action.moveToElement(home).perform();
//	 
//	String afterColor= home.getCssValue("color");
//		
//	 System.out.println(afterColor);
//		
//	if(beforeColor.equals(afterColor))	{
//		System.out.println("failed");
//	}
//				
//	else {
//		System.out.println("Passed");
//	}
	
		if(home.isDisplayed())	{
			System.out.println(home.getText()+ " Passed");
		}	
				
		else {
			System.out.println(home.getText()+ " Failed");
		}		
				
				
				
				
	Thread.sleep(3000);

	}

	
	
	
	

	
	
}



