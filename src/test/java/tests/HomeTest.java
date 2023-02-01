package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    HomePage homePage;

    public HomeTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage(driver);
    }

    @Test
    public void verifyMouseHover() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        homePage.mouseHoverr();
        Thread.sleep(6000);
        homePage.mouseHoverr1();
        Thread.sleep(6000);
        homePage.fruitClick();
        softAssert.assertAll();
    }

    @Test
    public void verifyScrolldown() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        homePage.validateScroll();
        Thread.sleep(6000);
        homePage.getCoo();
        homePage.addCoo();
        Thread.sleep(6000);
        softAssert.assertAll();
    }

    @Test
    public void verifyGetaddcookie() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        homePage.getCoo();
        Thread.sleep(6000);
        homePage.addCoo();
        Thread.sleep(6000);
        homePage.deleteCoo();
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
