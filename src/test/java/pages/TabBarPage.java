package pages;

import base.BasePage;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabBarPage extends BasePage {


    @FindBy(className = "btnSignIn")
    private WebElement clickLoginButton;
    @FindBy(id = "searchData")
    private WebElement searchBoxInput;
    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div[4]/a")
    private WebElement basketButtonElement;


    public TabBarPage(WebDriver driver, Eyes eyes) {
        super(driver,eyes);
        PageFactory.initElements(driver,this);
    }

    public void clickLoginButton(){
        time();
        clickLoginButton.click();
    }

    public void searchBox(String data){
        time();
        searchBoxInput.sendKeys(data+ Keys.ENTER);
    }

    public void basketButton(){
        time();
        basketButtonElement.click();

    }


}
