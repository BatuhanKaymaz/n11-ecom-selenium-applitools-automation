package base;


import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Secrets;

import java.time.Duration;

public class BaseTest {
    protected   WebDriver driver;
    protected  Eyes eyes ;


    @BeforeClass
    public  void setUp(){
       WebDriverManager.chromedriver().setup();
        if (driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            eyes = new Eyes();
            eyes.setApiKey(Secrets.apiKey());
            eyes.open(driver,"N11 Test","N11 Test",new RectangleSize(1920,1080));

        }
    }

    @AfterClass
    public void quitDriver(){
        if (driver != null) {
            if (eyes.getIsOpen()) {
                System.out.println("Applitools Eyes oturumu hala açık, abort ediliyor...");
                eyes.abort(); //
            } else {

                System.out.println("Applitools Eyes oturumu zaten kapalı.");
            }
            driver.quit();
            System.out.println("Driver kapandı");
        }
        driver = null;
    }
}
