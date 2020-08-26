package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class WhyWebDriverNotChromeDriver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//why WebDriver driver=new ChromeDriver();
		//why not  ChromeDriver driver=new ChromeDriver();?
		//rs: - for crossbrowsing 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);

	}

}
