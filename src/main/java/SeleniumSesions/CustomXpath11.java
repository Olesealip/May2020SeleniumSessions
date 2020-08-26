package SeleniumSesions;

public class CustomXpath11 {

	public static void main(String[] args) {
		//there are 2 typoes of xpath :
		//1. absolute xpath -example:  //html/body/div/div[2]/div[3]/ul/li//input -its not recommended to use what if tomorrow your herarhy will change then your path will change  too 
		//2. relative xpath:Custome xpath - you can use xpath features and functions .you can use xpath Axes-consept of siblings , parent and child 
//i will be using the direct element instead of the complete hierarchy .
//example :	//input[@name='test ']  //@-responds for tag   // -tag
//this is the sintex : //tag[@atribut='value']

	//every browser has their own xpath

		
		
//       //tag[@atribute='value' and @atribute='value']
//		//input[@type='email' and @id='username']
	
		
		
		//tag[@attr='value']
		//input[@id='username']
		//input[@type='email']
		//button[@id='loginBtn']
		
		//tag[@attr1='value' and @attr2='value']
		//input[@type='email' and @id='username']
		//input[@type='email' and @id]
		//input[@type and @id]
		//input[@class='form-control private-form__control login-email']
		//input[@class='login-email'] -- not valid
		//form[@id='hs-login']//input[@id='username']
		//div[@class='private-form__input-wrapper']/input[@id='username']
		
		//ul[@class='footer-nav']/li/a
		
		//select[@id='Form_submitForm_Industry']/option -- 21 child (direct) elements
		//select[@id='Form_submitForm_Industry']//option -- 21 child (direct+indirect elements)
		
		//contains:
		//tag[contains(@id,'username')]
		//input[contains(@id,'username')]
		//input[@id='username']
		
//		<input id="username_123">
//		<input id="username_234">
//		<input id="username_344">
		
		
		
		
		//contains is used when you are getting dynamic value
		//input[contains(@id,'username_')]

		//input[contains(@id,'user') and @type='email']
		//input[contains(@id,'user') and contains(@type,'email')]
		//input[contains(@id,'username') and @type]
		
		//text()
		//a[text()='Platform']
		//a[text()='Platform' and @class='nav-label']
		//a[@class='nav-label' and text()='Platform']
		//a[contains(text(),'Platform')]
		//a[contains(text(),'Platform') and @class='nav-label']
		
		//starts-with:
		//input[starts-with(@id,'user')]
		
		// (//div[@class='private-form__input-wrapper']//input)[1]
		// (//div[@class='private-form__input-wrapper']//input)[2]
		
		// (//div[@class='input-group']//input)[1]
		// (//div[@class='input-group']//input)[position()=1]     //position means go to the specific position 
		// (//div[@class='input-group']//input)[last()]            //last =give me the last element  out of this collection
		// (//input[@type='text'])[last()]
		
		
		
		
		
		//in xpath you have write the exact value 
//    /- direct child of the parent 		
	
	
	
	
		
	
	}

}
