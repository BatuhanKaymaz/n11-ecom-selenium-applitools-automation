package pages;

import base.BasePage;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends BasePage {
    @FindBy(xpath = "//span[contains(@class, 'removeProd') and contains(@class, 'svgIcon_trash')]")
    private WebElement deleteProductElement;
    @FindBy(className = "supriseDiscountContainer")
    private  WebElement ignoreElement;


    public  BasketPage(WebDriver driver, Eyes eyes){
        super(driver,eyes);
        PageFactory.initElements(driver,this);
    }

     public void controlProduct(){
         time();
         if (eyes != null) {
             try {
                 eyes.checkWindow("Product Added");
                 System.out.println("eyes.checkWindow 'Product added' başarılı.");
             } catch (Exception e) {
                 System.err.println("eyes.checkWindow 'Product added' hatası: " + e.getMessage());
             }
         }
         System.out.println("controlProduct bitişi.");
        }


    public void scrollDown(){
        time();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
    }

    public  void deleteProduct(){
         time();
         deleteProductElement.click();
    }
}