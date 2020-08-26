package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropHandle10 {
	//there are two elements available. one you cannot move but second one you can move 
	//the target is you have to drag it on first element which is unmoveble 
	//1. you click and holded
	//then you move to particular element 
	//then drop it 

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceElement= driver.findElement(By.id("draggable"));
      WebElement targetElement= driver.findElement(By.id("droppable"));
      
      //now we have to move the movable element into the target we can do this with actions class
      //we have to create an object of actions class 
     
      Actions ac= new Actions(driver); //new Actions()- you have to give the webdriver
     
    //  ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();//.build- it will collect all this three methods together in a chain //.perfor - will perform an action
      //here we have 3 actions - three methods 
      //we use actions class when we are using multiple actions , a chain
     // when you want to perform actions class you have to use buils and perform at the end othervise it will not perform.
	
       //if you dont want to use the method from the obove :ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
      //we can use:
      ac.dragAndDrop(sourceElement,targetElement).perform(); //here we have only one single actions - one method, so you dont need to use.build  
      
      
      
      Thread.sleep(3000);
    driver.quit();
	}

}
//in Select class we have to pass WebElement in Actions class we have to pass webDriver