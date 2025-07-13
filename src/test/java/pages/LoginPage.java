package pages;

import base.BasePage;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {
    @FindBy(id = "email")
    private WebElement typeEmailInput;

    @FindBy(id = "password")
    private  WebElement typePasswordInput ;

    @FindBy(id = "loginButton")
    private WebElement clickContinueButtonInput;



    public LoginPage(WebDriver driver, Eyes eyes) {
        super(driver,eyes);
        PageFactory.initElements(driver,this);
    }



    public void typeEmail(String email){
        time();
        typeEmailInput.sendKeys(email);
    }

    public void typePassword (String password){
        time();
        typePasswordInput.sendKeys(password);

    }

    public void clickButtonContinueButton(){
        time();
        clickContinueButtonInput.click();
    }
}
