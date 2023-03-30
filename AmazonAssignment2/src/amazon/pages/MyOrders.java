package src.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOrders {

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    WebElement accounts;
    public void clickAccount(){
        accounts.click();
    }

    @FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div")
    WebElement orderBox;
    public void clickOrderBox(){
        orderBox.click();
    }

    @FindBy(css="#a-autoid-1-announce > span")
    WebElement orderFilters;
    public void clickOrderFilter(){
        orderFilters.click();
    }

    @FindBy(id="orderFilter_3")
    WebElement pastOrder;
    public void pastYearOrder(){
        pastOrder.click();
    }

    @FindBy(id = "nav-logo-sprites")
    WebElement amazonLogo;

    public void amazonLogoGet(){
        amazonLogo.click();
    }



}
