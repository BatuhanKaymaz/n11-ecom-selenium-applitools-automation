package base;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract  class BasePage {
    protected WebDriver driver ;
    protected Eyes eyes ;

    public BasePage(WebDriver driver , Eyes eyes){
        this.driver =driver;
        this.eyes = eyes;

        PageFactory.initElements(driver, this);
    }

    public void time(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }





}
