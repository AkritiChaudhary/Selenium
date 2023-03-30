package src.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import src.utils.Utilities;

public class NewAddress {

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    WebElement accounts;
    public void clickAccount(){
        accounts.click();
    }

    @FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")
    WebElement yourAddress;
    public void selectYourAddressBox(){
        yourAddress.click();
    }

    @FindBy(id="ya-myab-plus-address-icon")
    WebElement addAddress;
    public void addAddressBox(){
        addAddress.click();
    }

    @FindBy(id="address-ui-widgets-enterAddressFullName")
    WebElement fullName;
    public void addFullName(){
        fullName.sendKeys(Utilities.name);
    }

    @FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
    WebElement mobile;
    public void addMobile(){
        mobile.sendKeys(Utilities.moblie);
    }

    @FindBy(id="address-ui-widgets-enterAddressPostalCode")
    WebElement pincode;
    public void addPincode(){
        pincode.sendKeys(Utilities.pin);
    }

    @FindBy(id="address-ui-widgets-enterAddressLine1")
    WebElement addressLine1;
    public void addAddressline1(){
        addressLine1.sendKeys(Utilities.address1);
    }

    @FindBy(id="address-ui-widgets-enterAddressLine2")
    WebElement addressLine2;
    public void addAddressLine2(){
        addressLine2.sendKeys(Utilities.address2);
    }

    @FindBy(id="address-ui-widgets-landmark")
    WebElement landmark;
    public void addLandmark(){
        landmark.sendKeys(Utilities.landmark);
    }

    @FindBy(id="#address-ui-widgets-enterAddressCity")
    WebElement city;
    public void addCity(){
        city.sendKeys(Utilities.city);
    }

    @FindBy(xpath="//*[@id=\'address-ui-widgets-enterAddressStateOrRegion\']/span/span")
    WebElement addState;
    public void addStateName(){
        addState.click();
    }

    @FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8")
    WebElement addStateDropDown;
    public void addStateNameDropDown(){
        addStateDropDown.click();
    }

    @FindBy(css="#address-ui-widgets-addr-details-address-type-and-business-hours > span > span")
    WebElement addressType;
    public void clickaddressType(){
        addressType.click();
    }

    @FindBy(id="dropdown1_1")
    WebElement addressTypeSelection;
    public void addressTypeDropDown(){
        addressTypeSelection.click();
    }

    @FindBy(css="#address-ui-widgets-form-submit-button > span > input")
    WebElement addressAdd;
    public void addressAdded(){
        addressAdd.click();
    }





}
