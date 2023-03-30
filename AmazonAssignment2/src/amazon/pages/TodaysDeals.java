package src.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TodaysDeals {

    WebDriver driver;

    public TodaysDeals(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(linkText = "See all deals")
    WebElement clickTodaysDeals;

    @FindBy(css = "#slot-12 > div > div > div > div:nth-child(2) > div > div:nth-child(1) > div > a:nth-child(1) > div > div > img")
    WebElement getThirdDeal;

    public void seeTodaysDeals(){
        clickTodaysDeals.click();
    }

    public void thirdDeal(){
        getThirdDeal.click();
    }

}
