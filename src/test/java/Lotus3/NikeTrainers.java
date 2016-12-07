package Lotus3;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Chahat on 22/11/2016.
 */
public class NikeTrainers extends DriverManager {


    @FindBy(id="txtSearch")
    private WebElement _search;

    @FindBy(xpath = ".//*[@id='cmdSearch']/span")
    private WebElement _searchOption;

    @FindBy(linkText = "Trainers")
    private WebElement _trainers;

    @FindBy(className = "row")
    private WebElement _clickanywhere;

    @FindBy(xpath = ".//*[@id='navlist']/li/div/div[2]/div[1]/div[1]/a/span[1]")
    private List<WebElement> _shoeslocators;

    @FindBy(xpath = ".//*[@id='navlist']/li/div/div[1]/a[1]/img")
    private List<WebElement> _mustbuy;

    @FindBy(id="FiltersHeader")
    private WebElement _assertion;


    public void search ()
    {
        Utility.enterText(_search, "Nike Trainers");
        Utility.clickable(_clickanywhere);
        Utility.clickable(_searchOption);
        Utility.clickable(_clickanywhere);


         List<WebElement>shoes=_shoeslocators;
        System.out.println("Number of Nike shoes present on this page:  " + shoes.size());

         List<WebElement>mustBUY=_mustbuy;
        System.out.println("Images with Must BUY are: " + mustBUY.size());

        Assert.assertEquals(_assertion.getText(),"REFINE BY");
        System.out.println("User is on result page.");

    }
}
