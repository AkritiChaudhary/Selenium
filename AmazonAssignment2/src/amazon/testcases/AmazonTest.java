package src.amazon.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import src.amazon.pages.*;
import src.utils.Base;





public class AmazonTest extends Base{

    Base base;

    @BeforeSuite
    public  void amazon(){
        base = new Base();
        base.init_driver();
        base.init_property();
    }


    @Test(priority = 0)
    public void verifyDealsAction(){

        TodaysDeals td=PageFactory.initElements(driver, TodaysDeals.class);
        td.seeTodaysDeals();
        //td.thirdDeal();

    }

    @Test(priority = 1)
    public void cartCheckAction(){
        CartCheck cc= PageFactory.initElements(driver,CartCheck.class);
        cc.searchSomething();
        cc.searchButtonClick();
//        cc.clickProduct();
//        cc.addToCart();
//        //Assert.assertEquals(cc.().getAttribute("value"), Utilities.quantityNeeded);
//        Set<String> ids = driver.getWindowHandles();
//        Iterator<String> it = ids.iterator();
//        String parentId = it.next();
//        String childId = it.next();
//        driver.switchTo().window(childId);
        driver.navigate().back();
    }

    @Test(priority = 2)
    public void MobileSearch(){
        SearchMobiles ms = PageFactory.initElements(driver,SearchMobiles.class);
        ms.clearSomething2();
        ms.searchSomething2();
        ms.searchButtonClick();
//      Set<String> ids = driver.getWindowHandles();
//      Iterator<String> it = ids.iterator();
//      String parentId = it.next();
//      String childId = it.next();
//      driver.switchTo().window(childId);
        //ms.clickProduct();
        ms.clickleftNav();
        ms.clickleftNavMobiles();
        ms.clickleftNavAllMobiles();
        ms.amazonLogoGet();

    }

    @Test(priority = 3)
    public void AmazonLogin(){
        Login lo = PageFactory.initElements(driver,Login.class);
        lo.clickAccount();
        lo.enterEmail();
        lo.enterContinue();
        lo.enterPassword();
        lo.signInSubmit();
    }

    @Test(priority = 4)
    public void MyOrders(){
        MyOrders mo =PageFactory.initElements(driver,MyOrders.class);
        mo.clickAccount();
        mo.clickOrderBox();
        mo.clickOrderFilter();
        mo.pastYearOrder();
        mo.amazonLogoGet();

    }

    @Test(priority = 5)
    public void PaymentMethods(){
        PaymentMethod pm=PageFactory.initElements(driver,PaymentMethod.class);
        pm.clickAccount();
        pm.clickPaymentOptionBox();
        pm.selectPaymentOption();
        pm.amazonLogoGet();
    }

    @Test(priority = 6)
    public void NewAddress(){
        NewAddress na=PageFactory.initElements(driver,NewAddress.class);
        na.clickAccount();
        na.selectYourAddressBox();
        na.addAddressBox();
        na.addFullName();
        na.addMobile();
        na.addPincode();
        na.addAddressline1();
        na.addAddressLine2();
        na.addLandmark();
//        na.addCity();
//        na.addStateName();
//        na.addStateNameDropDown();
        na.clickaddressType();
        na.addressTypeDropDown();
        na.addressAdded();
    }





}
