package TestSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Library.*;

public class LoginPF {
	WebDriver driver;


    @FindBy(xpath = ElementDeclaration.txtLoginUsername)
    WebElement userName;  
    
    @FindBy(xpath = ElementDeclaration.txtLoginPassword)
    WebElement password;
    
    @FindBy(xpath = ElementDeclaration.btnLoginSubmit)
    WebElement login;
    
    @FindBy(xpath = ElementDeclaration.headerMain)
    WebElement headerMain;
    
    public LoginPF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    //Set user name in textbox
    public void setUserName(String strUserName){
        userName.sendKeys(strUserName);
    }
    
  //Set password in password textbox
    public void setPassword(String strPassword){
    	password.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
    	login.click();
    }
    
    //Get Main page title
    public String getMainPageTitle(){
    	return headerMain.getText();
    }
    
//    //Get the title of Login Page
//    public String getLoginTitle(){
//     return    driver.findElement(titleText).getText();
//
//    }
    
    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void login(String strUserName,String strPasword){

        //Fill user name
        this.setUserName(strUserName);

        //Fill password
        this.setPassword(strPasword);

        //Click Login button
        this.clickLogin();              
    }


}
