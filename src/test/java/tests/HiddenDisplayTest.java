package tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HiddenDisplayTest extends AbstractBaseTest {
    @Test
    public void hiddenDisplay() {

        HomePage homePage = new HomePage(driver) ;
        CommonActions commonActions = new CommonActions();

        CommonActions.scrollToElement(homePage.getRegion(),driver);
        homePage.getRegion().click();
        homePage.getRegionItem().click();

        CommonActions.scrollToElement(homePage.getContactUs(),driver);
        homePage.getContactUs().click();

        CommonActions.scrollToElement(homePage.getCategory(),driver);
        homePage.getCategory().click();
        homePage.getItemOrder().click();

        homePage.getSubject().click();

        homePage.getItemCancelOrder().click();

        System.out.println(homePage.getInputAddressSize());
        System.out.println(homePage.getInputPhoneSize());
        System.out.println(homePage.getInputFirstLastNameSize());
        System.out.println(homePage.getInputOrderNumberSize());
        System.out.println(homePage.getInputMessageSize());

        Assert.assertEquals(0, homePage.getInputFirstLastNameSize());
        Assert.assertEquals(0, homePage.getInputAddressSize());
        Assert.assertEquals(0, homePage.getInputPhoneSize());
        Assert.assertEquals(0, homePage.getInputOrderNumberSize());
        Assert.assertEquals(0, homePage.getInputMessageSize());

    }
}
