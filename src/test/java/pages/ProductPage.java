package pages;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasketPage{

    @FindBy(className = "addBasketUnify")
    private WebElement addToBasketElement;

    public  ProductPage(WebDriver driver, Eyes eyes){
        super(driver,eyes);
        PageFactory.initElements(driver,this);
    }

    public void addToBasket(){
        time();
        addToBasketElement.click();
        time();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)", "");

    }
}
