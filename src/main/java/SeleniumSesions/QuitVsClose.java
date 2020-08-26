package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","/Users/olesea/Downloads/chromedriver"); //this are configuration to launch Chrome 
		WebDriver driver= new ChromeDriver();
		
		//case 1 using method quit
		//when you are sending the request first time you will have a session id . so it will maintain the same session id until you send the request quit
		//driver.get("http://www.google.com"); //we debug and see the id number 7af5e9b423df6befee359f8ab90b8452
		//System.out.println(driver.getTitle()); //here we see again the same id number 7af5e9b423df6befee359f8ab90b8452

		//driver.quit(); //is used to close the browser //id 7af5e9b423df6befee359f8ab90b8452
       
     //System.out.println(driver.getTitle()); //id is "null"// rs: NoSuchSessionException: Session ID is null.Using WebDriver after calling quit()?
	
        //case 2  using close method 
        
        driver.get("http://www.google.com");  //session id ChromeDriver: chrome on MAC (d3e4bef37b889ba079205627175a1c4e)
      System.out.println(driver.getTitle());   // id  (d3e4bef37b889ba079205627175a1c4e)
        driver.close();  //id: (d3e4bef37b889ba079205627175a1c4e)
   
        //we are trying to get the title aftter the browser is closed . no we will not get the title .even thogh we are using the same session id but because we closed the browser the id had expired 
       // System.out.println(driver.getTitle());  //id : (d3e4bef37b889ba079205627175a1c4e)//rs: selenium.NoSuchSessionException: invalid session id
        
     //  to open new session 
        driver= new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle()); 
        driver.close(); 
	}

}
