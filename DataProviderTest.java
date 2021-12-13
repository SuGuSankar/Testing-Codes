package org.testngpractice;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest extends BassClass {
	
	@DataProvider (name="idPassword")
	public Object dataProvider() {
		
		return new Object[][] {
			{"sugu121412@gmail.com","1225325323"},{"raghu1241214@gmail.com","0977298353"},{"woijhowiehoi@gmail.com","ioihw810905234"}
};
	}
	
	@Test(dataProvider="idPassword")
	private void testing(String s, String s1) {
		
		driverSetup();
		browserLaunch("https://www.facebook.com/");
		
		WebElement userName = locatorsPath("id", "email");
		sendKeys(s, userName);
		
		WebElement userPass = locatorsPath("id", "pass");
		sendKeys(s1, userPass);
		
		WebElement buttonClick = locatorsPath("xpath", "//button[@name='login']");
		clickButton(buttonClick);
		
		close();
	}
}
