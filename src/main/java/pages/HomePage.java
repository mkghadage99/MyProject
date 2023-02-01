package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

import static testbase.WebTestBase.driver;

public class HomePage {
    @FindBy(xpath = "//a[@class='dropdown-toggle meganav-shop']")
    WebElement shopBy;

    @FindBy(xpath = "//a[@qa='catL1']")
    WebElement fruitVeg;

    @FindBy(xpath = "//span[@qa='itemsCount']")
    WebElement scrollup;

    @FindBy(xpath = "//img[@class='img-responsive ng-scope lazyautosizes lazyloaded']")
    WebElement scrollupp;



    public HomePage(WebDriver driver){
        PageFactory.initElements(WebTestBase.driver, this);

    }
    public void mouseHoverr(){
        Utility.mouseHover(driver,shopBy);
    }
    public void mouseHoverr1(){
        Utility.mouseHover(driver,fruitVeg);
    }

    public void fruitClick(){

        fruitVeg.click();
    }

    public void validateScroll() {
        Utility.scrolldown();
    }

    public void getCoo(){
        Utility.getCookies();

    }

    public void addCoo(){
        Utility.addCookies("Hello", "World");
    }
    public void deleteCoo(){
        Utility.deleteCookies("Hello", "World");

    }



}


