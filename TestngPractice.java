package org.testngpractice;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngPractice extends BassClass {
	
    
    @Test(invocationCount=5) 
    @Parameters({"a", "b"})
    private void facebookPass(String a,String b) {
    	driverSetup();
		browserLaunch("https://www.facebook.com/");
		
		WebElement userName = locatorsPath("id", "email");
		userName.sendKeys(a);
		
    	WebElement userPass=locatorsPath("id","pass");
    	sendKeys(b, userPass);
    	
	
		WebElement bClick = locatorsPath("xpath", "//button[@name='login']");
		clickButton(bClick);
	
		close();
	}
}