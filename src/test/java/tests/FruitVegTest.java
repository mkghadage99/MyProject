package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FruitVegPage;
import pages.HomePage;
import testbase.WebTestBase;

import static java.lang.Thread.sleep;

public class FruitVegTest extends WebTestBase {
    FruitVegPage fruitVegPage;
    HomePage homePage;

    public FruitVegTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        fruitVegPage = new FruitVegPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void verifySearchFunctionality() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseHoverr();
        Thread.sleep(4000);
        homePage.mouseHoverr1();
        Thread.sleep(4000);
        homePage.fruitClick();
        Thread.sleep(4000);
        fruitVegPage.shopByCategory(prop.getProperty("searchText"));
        //softAssert.assertEquals(fruitVegPage.getTextOfFruitVegPage(),"Fruits & Vegetables",  "Search text should be match");
        fruitVegPage.searchClick();
        Thread.sleep(4000);
        softAssert.assertAll();
    }

    @Test
    public void verifyDropdown() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseHoverr();
        Thread.sleep(4000);
        homePage.mouseHoverr1();
        Thread.sleep(4000);
        homePage.fruitClick();
        Thread.sleep(4000);
        fruitVegPage.shopByCategory(prop.getProperty("searchText"));
        fruitVegPage.searchClick();
        fruitVegPage.selectDropdown();
        Thread.sleep(4000);
        softAssert.assertAll();
    }

    @Test
    public void verifyCheckbox() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseHoverr();
        homePage.mouseHoverr1();
        homePage.fruitClick();
        Thread.sleep(4000);
        fruitVegPage.shopByCategory(prop.getProperty("searchText"));
        fruitVegPage.searchClick();
        fruitVegPage.checkBoxClick();
        Thread.sleep(6000);
        fruitVegPage.imgCarrotClick();
        softAssert.assertAll();
    }

    @Test      // https://www.bankofbaroda.in/
    public void verifyWindowhandle() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        fruitVegPage.windowHandles();
        Thread.sleep(4000);
        softAssert.assertAll();
    }


    @AfterMethod
    public void afterMethod() {
        driver.close();

    }
}
