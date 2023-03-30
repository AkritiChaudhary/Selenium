package src.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartCheck {

    WebDriver driver;

    public CartCheck(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    public void searchSomething(){
        searchBox.sendKeys("earphones");
    }

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    public void searchButtonClick(){
        searchButton.click();
    }

    @FindBy(css = "##search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(8) > div > span > div > div > div > div > div:nth-child(2) > div.sg-col.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20 > div > div > div:nth-child(1) > h2 > a > span")
    WebElement oneEarphone;

    public void clickProduct(){
        oneEarphone.click();
    }

    @FindBy(xpath = "//*[@id=\'add-to-cart-button\']")
    WebElement addCart;

    public void addToCart(){
        addCart.click();
    }

    @FindBy(id= "quantity")
    public static WebElement quantity;

    public void checkQuantity(){
        quantity.click();
    }


}
