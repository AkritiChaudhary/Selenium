package src.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import src.utils.Utilities;

public class Login {

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    WebElement accounts;
    public void clickAccount(){
        accounts.click();
    };

    @FindBy(id = "ap_email")
    WebElement email;
    public void enterEmail(){
        email.sendKeys(Utilities.email);
    }

    @FindBy(id="continue")
    WebElement continueButton;
    public void enterContinue(){
        continueButton.click();
    }


    @FindBy(id = "ap_password")
    WebElement password;
    public void enterPassword(){
        password.sendKeys(Utilities.pass);
    }


    @FindBy(id = "signInSubmit")
    WebElement clickSignIn;
    public void signInSubmit(){
        clickSignIn.click();
    }
}
