package TestSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Library.*;

public class PresentationPF {
	WebDriver driver;
	
	@FindBy(xpath = ElementDeclaration.headerMain)
	WebElement headerMain;
	
	@FindBy(xpath = ElementDeclaration.titlePresentationList)
    WebElement titlePresentationList;
	
	public PresentationPF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	//Get Main page title
    public String getMainPageTitle(){
    	return headerMain.getText();
    }
	
    //Get Presentation List Page title
	public String getPresentationListPageTitle(){
		return titlePresentationList.getText();
	}
	
}
