package src.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethod {

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    WebElement accounts;
    public void clickAccount(){
        accounts.click();
    }

    @FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")
    WebElement paymentoptionbox;
    public void clickPaymentOptionBox(){
        paymentoptionbox.click();
    }

    @FindBy(xpath="//*[@id=\'pp-lIpJ6k-26\']/span/input")
    WebElement paymentoption;
    public void selectPaymentOption(){
        paymentoption.click();
    }

    @FindBy(id = "nav-logo-sprites")
    WebElement amazonLogo;

    public void amazonLogoGet(){
        amazonLogo.click();
    }

}
