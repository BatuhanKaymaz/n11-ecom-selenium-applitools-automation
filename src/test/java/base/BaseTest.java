package base;


import com.applitools.eyes.selenium.Eyes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    protected  WebDriver driver;
    protected  Eyes eyes ;


    @BeforeClass
    public  void setUp(){
       WebDriverManager.chromedriver().setup();
        if (driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
    }

    @AfterClass
    public void quitDriver(){
        if (driver != null) {
            driver.quit();
            System.out.println("Driver kapandı");
        }
        driver = null;
    }
}
