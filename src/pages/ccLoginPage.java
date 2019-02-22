package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ccLoginPage {

	
	WebDriver driver;

    @FindBy(id="LoginName")

    WebElement user99GuruName;

    @FindBy(name="Password")

    WebElement password99Guru;    

    @FindBy(id="LoginBtn")

    WebElement login;
    
    public ccLoginPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
    
    //Set user name in textbox

    public void setUserName(String strUserName){

        user99GuruName.sendKeys(strUserName);     
    }

    //Set password in password textbox

    public void setPassword(String strPassword){

    password99Guru.sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

            login.click();

    }  
    
    //Get the title of Login Page

    public String getLoginTitle(){

     return    driver.getTitle();

    }
    
    public void loginToGuru99(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();           

    }
}
