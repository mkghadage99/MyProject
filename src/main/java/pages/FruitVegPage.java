package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

import static testbase.WebTestBase.driver;

public class FruitVegPage {
    @FindBy(id = "sel1")
    WebElement dropDown;

    @FindBy(xpath = "//img[@class='img-responsive blur-up lazyautosizes lazyloaded']")
    WebElement image;

    @FindBy(xpath = "//input[@qa='searchBar']")

    WebElement shopByCategoryTextBox;

    @FindBy(xpath = "//button[@qa='searchBtn']")
    WebElement SearchBtn;


    @FindBy(xpath = "(//span[text()='India'])[1]")
    WebElement india;

    @FindBy(xpath = "//a[@title='Youtube']")
    WebElement Twitter;

  //  @FindBy(id = "openwindow")//a[@title='Youtube']
            //WebElement Twitter;

    public FruitVegPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void shopByCategory(String searchText) {
        shopByCategoryTextBox.click();
        shopByCategoryTextBox.sendKeys(searchText);

    }

    public void searchClick() {
        SearchBtn.click();
    }

    public void selectDropdown() {
        dropDown.click();
        Utility.selectValue(dropDown, "byVisibleText", "Price - Low to High");
    }


    public void checkBoxClick() {
        india.click();

    }

    public void imgCarrotClick() {
        image.click();
    }

    public void windowHandles()  {
        Utility.switchToWindow(driver);
        Twitter.click();
    }



}



