package Lotus3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Chahat on 22/11/2016.
 */
public class TestSuit extends DriverManager {

    @BeforeMethod
    public void open ()
    {
        DriverManager.openBrowser();
    }
    @AfterMethod
    public void close()
    {
        DriverManager.closeBrowser();
    }
@Test

    public void nike ()
{
    NikeTrainers nikeTrainers= new NikeTrainers();
    nikeTrainers.search();

}

}
