package SeleniumSesions;

public class HubSpotLoginPage {

	

	public static void main(String[] args) throws InterruptedException {
		String browser= "chrome";
		String url= " http://www.hubspot.com/login";
		//i want to launch the browser with the help of WebDriverFactory class
		// you have to create an object of this particular class
		
		WebDriverFactory wf= new WebDriverFactory(); //now i can access all the methods 
		wf.launchBrowser(browser);
		wf.launchUrl(url);
		
Thread.sleep(5000); 

String title= wf.getPageTitle(); 
System.out.println("page title is " + title);

if(title.equals("HubSpot Login")) {
	System.out.println("correct title");
}
else {
	System.out.println("incorect title");
}
	wf.closeBrowser();
	
	
	}

}
