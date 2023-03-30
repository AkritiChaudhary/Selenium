package src.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import src.utils.Utilities;

public class SearchMobiles {

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox1;

    public void clearSomething2(){
        searchBox1.clear();
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox2;

    public void searchSomething2(){
        searchBox2.sendKeys(Utilities.searchText);
    }

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    public void searchButtonClick(){
        searchButton.click();
    }

    @FindBy(xpath = "//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[23]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")
    WebElement oneMobile;

    public void clickProduct(){
        oneMobile.click();
    }

    @FindBy(css="#nav-hamburger-menu > i")
    WebElement leftNav;

    public void clickleftNav(){
        leftNav.click();
    }

    @FindBy(css="#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(15) > a")
    WebElement leftNavMobiles;

    public void clickleftNavMobiles(){
        leftNavMobiles.click();
    }

    @FindBy(css="#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(3) > a")
    WebElement leftNavAll;

    public void clickleftNavAllMobiles(){
        leftNavAll.click();
    }

    @FindBy(id = "nav-logo-sprites")
    WebElement amazonLogo;

    public void amazonLogoGet(){
        amazonLogo.click();
    }



}
