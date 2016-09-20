package TestSuites;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Library.ElementDeclaration;
import com.Library.browsers;


public class LoginTest {
	WebDriver driver;
	LoginPF objLogin;
	PresentationPF objPresentation;
	
	@BeforeMethod
	public void init(){
		driver =  browsers.selectBrowser(ElementDeclaration.browserCh);
		driver.get(ElementDeclaration.publicURL);
	}
	
	
	@AfterMethod
	public void close(){
		driver.quit();
	}
	
	/*
	 * LOGIN SUCCESSFULLY
	 * 1. Enter valid user name
	 * 2. Enter valid password
	 * 3. Click on Submit button
	 */
	@Test
	public void login(){
		objLogin = new LoginPF(driver);
		objPresentation = new PresentationPF(driver);
		objLogin.login(ElementDeclaration.inputValidUsername, ElementDeclaration.inputValidPassword);
		Assert.assertTrue(objPresentation.getMainPageTitle().equals(ElementDeclaration.headerMainText));
		
	}

}
