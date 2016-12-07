package Lotus3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chahat on 22/11/2016.
 */
public class DriverManager {

    protected static WebDriver driver;

    public DriverManager()
    {
        PageFactory.initElements(driver, this);
    }


    public static void openBrowser()
    {
        String browser = "ChromeDriver";

        if(browser.equalsIgnoreCase("ChromeDriver"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Browser_Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
       else if(browser.equalsIgnoreCase("InternetExplorerDriver"))
       {
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\Browser_Driver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            driver =new FirefoxDriver();
        }

        driver.get("http://www.sportsdirect.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void closeBrowser()
{
    driver.quit();
}
}
