package pages;

import base.BasePage;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {



    @FindBy(xpath = "//*[@id='p-679404493']/div/span")
    private WebElement addToBasketButonElement;

    public ResultPage(WebDriver driver, Eyes eyes) {
        super(driver,eyes);
        PageFactory.initElements(driver,this);
    }


    public void scrollDown(){
        time();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");

    }
    public void  addToBaskeButton(){
        time();
        addToBasketButonElement.click();
    }

}
