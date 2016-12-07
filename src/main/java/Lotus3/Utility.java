package Lotus3;

import org.openqa.selenium.WebElement;

/**
 * Created by Chahat on 22/11/2016.
 */
public class Utility extends DriverManager {

    public static void enterText (WebElement element, String text)
    {
        element.sendKeys(text);
    }

    public static void clickable (WebElement element)
    {
        element.click();
    }




}
