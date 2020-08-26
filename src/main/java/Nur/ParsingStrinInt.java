package Nur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParsingStrinInt {

	public static void main(String[] args) {
//		String str= "true";
//		
//if(Boolean.parseBoolean(str)==true) {
//	
//	System.out.println("passed ");
//}
String str= "1.43";

//
// double change= Double.parseDouble(str); //double
// 
// double a =1.43; 
//
// System.out.println(str);

WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("http://aquimo.com/");

String pageText= driver.getPageSource();

System.out.println(pageText.contains("aquimo"));
}
}
