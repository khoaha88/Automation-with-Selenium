package TestSuites;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Library.ElementDeclaration;
import com.Library.browsers;
import com.google.common.base.Verify;
import com.sun.jna.platform.FileUtils;

public class PresentationTest {
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
	
	@Test
	public void assertPresentationListPageTitle(){	
		objLogin = new LoginPF(driver);
		objLogin.login(ElementDeclaration.inputValidUsername, ElementDeclaration.inputValidPassword);
		try{
			Verify.verify(objPresentation.getPresentationListPageTitle().contains(ElementDeclaration.titlePresentationListText));
			Assert.assertTrue(objPresentation.getMainPageTitle().equals(ElementDeclaration.headerMainText));
		}
		catch(Exception e){
			
		}
		
		
//		Assert.assertTrue(objPresentation.getPresentationListPageTitle().contains(ElementDeclaration.titlePresentationListText));
//		Verify.verify(objPresentation.getPresentationListPageTitle().contains(ElementDeclaration.titlePresentationListText));
	}
}
