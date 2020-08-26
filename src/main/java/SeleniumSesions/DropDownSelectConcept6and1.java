package SeleniumSesions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectConcept6and1 {
static WebDriver driver;
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		
//		By country= By.id("Form_submitForm_Country");
//im going to create a WebElement 
		//WebElement countryElement=driver.findElement(country);
		
		//create select class object
		
//		Select select=new Select(countryElement);
//		List<WebElement> dropList= select.getOptions(); //getOptions()-what ever options are available at drop down list give it to me
//	System.out.println(dropList.size());
//	
//	//print the value of each and every option
//	for(int i=0; i<dropList.size(); i++) {
//	
//		//i have to reach for the specific element
//		String text= dropList.get(i).getText();
//		System.out.println(text);
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country= By.id("Form_submitForm_Country");
		By industry=By.id("Form_submitForm_Industry");
		List<String> countryList= getDropDownOptionsValues(country);
		System.out.println(countryList);
		
		List<String> industryList= getDropDownOptionsValues(industry);
		System.out.println(industryList);
	}
	
	public static List<String> getDropDownOptionsValues(By locator) {
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
		 public static WebElement getElement(By locator) {
				WebElement element= driver.findElement(locator);
			return element;

}
		 }//rs: 232
//[- Select Country -, Afghanistan, Albania, Algeria, American Samoa, Andorra, Angola, Anguilla, Antigua and Barbuda, Argentina, Armenia, Aruba, Australia, Austria, Azerbaijan, Bahamas, Bahrain, Bangladesh, Barbados, Belarus, Belgium, Belize, Benin, Bermuda, Bhutan, Bolivia, Bosnia and Herzegowina, Botswana, Bouvet Island, Brazil, Brunei Darussalam, Bulgaria, Burkina Faso, Burundi, Cambodia, Cameroon, Canada, Cape Verde, Cayman Islands, Central African Republic, Chad, Chile, China, Christmas Island, Cocos (Keeling) Islands, Colombia, Comoros, Congo, Cook Islands, Costa Rica, Cote D'Ivoire, Croatia, Cuba, Cyprus, Czech Republic, Denmark, Djibouti, Dominica, Dominican Republic, East Timor, Ecuador, Egypt, El Salvador, Equatorial Guinea, Eritrea, Estonia, Ethiopia, Falkland Islands (Malvinas), Faroe Islands, Fiji, Finland, France, French Guiana, French Polynesia, French Southern Territories, Gabon, Gambia, Georgia, Germany, Ghana, Gibraltar, Greece, Greenland, Grenada, Guadeloupe, Guam, Guatemala, Guinea, Guinea-bissau, Guyana, Haiti, Heard and Mc Donald Islands, Honduras, Hong Kong, Hungary, Iceland, India, Indonesia, Iran, Iraq, Ireland, Israel, Italy, Jamaica, Japan, Jordan, Kazakhstan, Kenya, Kiribati, North Korea, South Korea, Kuwait, Kyrgyzstan, Laos, Latvia, Lebanon, Lesotho, Liberia, Libya, Liechtenstein, Lithuania, Luxembourg, Macau, Macedonia, Madagascar, Malawi, Malaysia, Maldives, Mali, Malta, Marshall Islands, Martinique, Mauritania, Mauritius, Mayotte, Mexico, Moldova, Monaco, Mongolia, Morocco, Mozambique, Myanmar, Namibia, Nauru, Nepal, Netherlands, Netherlands Antilles, New Caledonia, New Zealand, Nicaragua, Niger, Nigeria, Niue, Norfolk Island, Northern Mariana Islands, Norway, Oman, Pakistan, Palau, Panama, Papua New Guinea, Paraguay, Peru, Philippines, Poland, Portugal, Puerto Rico, Qatar, Reunion, Romania, Russian Federation, Rwanda, St Kitts and Nevis, St Lucia, St Vincent and the Grenadines, Samoa, San Marino, Sao Tome and Principe, Saudi Arabia, Senegal, Seychelles, Sierra Leone, Singapore, Slovakia, Slovenia, Solomon Islands, Somalia, South Africa, South Georgia, Spain, Sri Lanka, Sudan, Suriname, Swaziland, Sweden, Switzerland, Syrian Arab Republic, Taiwan, Tajikistan, Tanzania, Thailand, Togo, Tokelau, Tonga, Trinidad and Tobago, Tunisia, Turkey, Turkmenistan, Turks and Caicos Islands, Tuvalu, Uganda, Ukraine, United Arab Emirates, United Kingdom, United States, Uruguay, Uzbekistan, Vanuatu, Venezuela, Vietnam, Virgin Islands, Western Sahara, Yemen, Yugoslavia, Zambia, Zimbabwe, South Sandwich Islands, St Helena, St Pierre and Miquelon, Vatican City, Wallis and Futuna Islands, Zaire]
//21
//[- Select Your Industry -, Aerospace, Agriculture / Forestry, Automotive, Business Services / Consultancy - Non IT, Computer / Technology - Reseller (inc VAR), Computer / Technology - Services / Consultancy, Computer / Technology - Manufacturer, Education, Electronics, Finance/ Banking / Insurance / Real Estate / Legal, Government - National / Federal (inc Military), Government - Local, Healthcare, Manufacturing - Non Computer Related, Media / Marketing / Entertainment / Publishing / PR, Retail / Wholesale, Telecoms / Communications, Transportation / Distribution, Travel, Other]

