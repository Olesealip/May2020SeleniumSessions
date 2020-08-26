package SeleniumSesions;
import java.time.Duration;
//here are collections of all utils
//to call all this methods we have to create an object ot this particular class
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil8 {
	
	//this element util is haviong its own private WebDriver
	private WebDriver driver;
	private WebDriverWait wait;
	//we craete a constractor of this particular class
	public ElementUtil8 (WebDriver driver, int timeOut) { //constructor says you give me the web driver, and give the same driver to -private WebDriver driver;so you use this keyword
	this.driver=driver;	
	this.wait= new WebDriverWait(driver,timeOut)	;
	}
	/**
	 * This is used to create WebElement on the basis of By locator
	 * @param locator
	 * @return WebEleme nt
	 */
	
	public  WebElement getElement(By locator) {
		WebElement element= null;        //we will create this web elemnt initialy pointing to null
		//if any acceacption is here please catch the ecxeption wit try catch block
		try {
		
		//now on basis of By locator you create a webElement 
		 element= driver.findElement(locator);
		}
		catch(Exception e ) {//anykind of exception
		System.out.println("element could not be created..." + locator);
		}
		return element;
		
	}
	
	public void  doClick(By locator) {// do click says you give me by locator and then i will call this guy getElement 
	getElement(locator).click();
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		}
	public String  doGetText(By locator) {
		return getElement(locator).getText();
	}
	public boolean doIsDysplayed(By locator) {
		return getElement(locator).isDisplayed(); //if element is displayed on the page i will give you true overvise false
		
	}
	//****************this are my actions methods************************
	//generic method 
		public  void doActionsClick(By locator ) {
			Actions ac=new Actions(driver);
			ac.click(getElement(locator)).perform();
		}
			public  void doActionsSendKeys(By locator, String value ) {
			Actions ac=new Actions(driver);
			ac.sendKeys(getElement(locator), value).perform();
			
			}
	//**************this is my drop down utils******************
	public  void doSelectValuesByVisibleText(By locator, String value ) {
		getElement(locator);
		Select select =new Select(getElement(locator));//getElement(locator)-is returning you a WebElement
		select.selectByVisibleText(value);
	}
	
	public  void doSelectvaluesByIndex(By locator, int index) {
		Select select= new Select (getElement(locator));
		select.selectByIndex(index);
		}
	
	public  void doSelectByValue(By locator, String value) {
		Select select= new Select (getElement(locator));
		select.selectByValue(value);
		}
	
	
	public  List<String> getDropDownOptionsValues(By locator) {
		//we will use array list to store all the text values all the collection
		
		//we will declare one array list
		
		List<String>optionsList= new ArrayList<String>(); //List- is a parent interface of ArrayList
		Select select=new Select(getElement(locator));
	
		List<WebElement> dropList= select.getOptions(); //getOptions()-what ever options are available at drop down list give it to me
	System.out.println(dropList.size());
	
	for(int i=0; i<dropList.size(); i++) {
    String text= dropList.get(i).getText();		
	
    //to print index number with the value 	
  //  System.out.println(i+"-->"+text); //(i+text)- index number with the value //we dont want this text to be printed on the console
	
    optionsList.add(text); //text will be inside the for loop
	
	}
	return optionsList;
}
	
	public void selectValuesFromDropDownList( By locator, String value) {
		List<WebElement> dayList = driver.findElements (locator); //this method will return list of web elements
		
		for(int i=0; i<dayList.size(); i++) {
			String text=dayList.get(i).getText();
			
			if(text.equals(value)) {
				dayList.get(i).click();//select 18 and click//then you click the work is done so you break then loop.
				break;
}
			}
		}
	
//*****************************wait utils*******************************
	

public  String doGetPageTitleWithContains(int timeOut, String title ) {
	
	wait.until(ExpectedConditions.titleContains(title));
	return driver.getTitle();
}

public String doGetPageTitle( int timeOut,String title) {
	
	wait.until(ExpectedConditions.titleIs(title));
	return driver.getTitle();
}
public  String doGetPageCurentUrl( int timeOut, String urlValue ) {
	
	wait.until(ExpectedConditions.urlContains(urlValue ));
	return driver.getCurrentUrl();
}
public  WebElement waitForEmement(  int timeOut, By locator) {
	
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
}
//this method saying i will give you webelement and then do  . click 
public WebElement waitForElementToBeClickble(By locator, int timeOut) {
	
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
public  WebElement waitForEmementtoBeVisible(int timeOut, By locator) {
	WebElement element= getElement(locator);
	return wait.until(ExpectedConditions.visibilityOf(element));
}

public  List<WebElement> visibilityOfAllElements(int timeOut, By locator) {
	
	return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
}
//you give me a locator i will wait for this particular element to be clickable  and then i will click on it 
public void  clickWhenready(By locator, int timeOut) {
	
	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(locator));
    element.click();
}
public  Alert waitForAlertPresent(int timeOut) {

return wait.until(ExpectedConditions.alertIsPresent());
}

//created your own custom wait 

public boolean isElementDisplayed(By locator, int timeOut) {
	WebElement element= null;
	boolean flag =false;
	for(int i = 0; i<timeOut; i++) {
		
		try {
			element= driver.findElement(locator);
			flag= element.isDisplayed();
			break;
			}  catch (Exception e) {
		System.out.println("waiting for element to be present on a page -->" +i+ "secs" );		
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e1) {
		}
	  }
   }
return flag;
}
//***********************************FluentWait Utils ******************************************
public   WebElement  waitForElementWithFluentWaitConcept( By locator, int timeOut ) {
	Wait<WebDriver>wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(15)) //what is a maximum timeout you have to wait on that 
            .pollingEvery(Duration.ofSeconds(3)) // how many time will go in there 5 times 15/3
            .ignoring(NoSuchElementException.class); //if you are finding any exception write ingnoring this particular exception//add  unimplemented method  
return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}
//generic method 
		public  WebElement  waitForElementWithFluentWait(final By locator, int timeOut ) {
			Wait<WebDriver>wait = new FluentWait<WebDriver>(driver)
	                .withTimeout(Duration.ofSeconds(15)) //what is a maximum timeout you have to wait on that 
	                .pollingEvery(Duration.ofSeconds(3)) // how many time will go in there 5 times 15/3
	                .ignoring(NoSuchElementException.class); //if you are finding any exception write ingnoring this particular exception//add  unimplemented method  

			WebElement element = wait.until(new Function<WebDriver,WebElement>(){

	public WebElement apply(WebDriver driver) {
		
		return driver.findElement(locator);	
	}
	});
			return element;
	}}


