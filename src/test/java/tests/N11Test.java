package tests;

import base.BaseTest;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import org.testng.annotations.Test;
import pages.BasketPage;
import pages.LoginPage;
import pages.ResultPage;
import pages.TabBarPage;
import utils.Secrets;


public class N11Test extends BaseTest {
    Eyes eyes ;
    TabBarPage tabBarPage ;
    LoginPage loginPage;
    ResultPage resultPage ;
    BasketPage basketPage ;

    @Test(priority = 1)
    public void tabBarPag(){

        driver.get("https://www.n11.com/");
        tabBarPage = new TabBarPage(driver,eyes);
        tabBarPage.clickLoginButton();
        tabBarPage.accesCookie();
    }

    @Test(priority = 2)
    public void loginPage (){
        loginPage = new LoginPage(driver,eyes);
        loginPage.typeEmail(Secrets.getEmail());
        loginPage.typePassword(Secrets.getPassword());
        loginPage.clickButtonContinueButton();
        tabBarPage.searchBox("laptop");
    }

    @Test(priority = 3)
    public void resultPage(){
        resultPage = new ResultPage(driver,eyes);
        resultPage.scrollDown();
        resultPage.addToBaskeButton();
        tabBarPage.basketButton();

    }


    @Test(priority = 4)
    public void basketPage(){
        basketPage = new BasketPage(driver,eyes);
        eyes = new Eyes();
        eyes.open(driver, "N11 Test Application", "Basket Page Visual Test", new RectangleSize(1920, 1080));
        basketPage.controlProduct();
        basketPage.scrollDown();
        eyes.close();
        basketPage.deleteProduct();

    }





}
