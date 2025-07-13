package pages;

import base.BasePage;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends BasePage {
    @FindBy(xpath = "//span[contains(@class, 'removeProd') and contains(@class, 'svgIcon_trash')]")
    private WebElement deleteProductElement;

    public  BasketPage(WebDriver driver, Eyes eyes){
        super(driver,eyes);
        PageFactory.initElements(driver,this);
    }

     public void controlProduct(){
        time();

         System.out.println("if bloğuna girildi mi?");
         if (eyes != null) {
             try {
                 // Burada eyes'in açık olduğundan emin olmak için sadece null kontrol yap, çünkü getIsOpen() her SDK'da yok
                 eyes.check("Buy Button Control", Target.window());
                 System.out.println("eyes.check başarıyla çalıştı.");
             } catch (Exception e) {
                 System.err.println("eyes.check sırasında hata: " + e.getMessage());
                 e.printStackTrace();
             }
         } else {
             System.err.println("eyes objesi null, check işlemi yapılmadı.");
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