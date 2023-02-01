package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

import static testbase.WebTestBase.driver;

public class Utility {

    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITY_WAIT = 20;

    public static void mouseHover(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }


    public static void selectValue(WebElement element, String term, String value) {
        Select dropDown = new Select(element);
        if (term.equalsIgnoreCase("byValue")) {
            dropDown.selectByValue(value);
        } else if (term.equalsIgnoreCase("byIndex")) {
            dropDown.selectByIndex(Integer.parseInt(value));
        } else if (term.equalsIgnoreCase("byVisibleText")) {
            dropDown.selectByVisibleText(value);
        } else {
            System.out.println("Please select the correct value");
        }


    }

    public static void scrolldown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4000)");
    }

    public static void switchToWindow(WebDriver driver) {
        String parentWindowId=driver.getWindowHandle();
        Set<String> allWindow=driver.getWindowHandles();
        for(String s:allWindow){
            if(!parentWindowId.contentEquals(s)){
                driver.switchTo().window(s);
            }
    }
    }

    public static  void getCookies(){

        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies){
             System.out.println(c);
        }
    }
    public static  void addCookies(String key1, String key2){
        Cookie cookie = new Cookie(key1,key2);
        driver.manage().addCookie(cookie);
    }

    public static  void deleteCookies(String key1, String key2){
        Cookie cookie = new Cookie(key1,key2);
        driver.manage().deleteCookie(cookie);
    }

}