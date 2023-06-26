package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Base {
    protected static WebDriver driver;


    public static void navigate(String url) { driver.get(url);    }

    public static void click( By locator  ) {
        driver.findElement( locator ).click();
    }

    public static void sendKeys(By locator, String keys) {
        driver.findElement( locator ).sendKeys(keys);
    }

    public static String getText(By locator) {
        String s = driver.findElement(locator).getText();
        return s;
    }

}
