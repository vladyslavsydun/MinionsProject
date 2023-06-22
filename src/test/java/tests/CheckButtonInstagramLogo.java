package tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckButtonInstagramLogo extends AbstractBaseTest {

    @Test
    public void checkButtonInstagramLogo() {
        HomePage homePage = new HomePage(driver);

        CommonActions.scrollToBottonOfThePage(driver);
        homePage.getInstagramLogoButton();

        Assert.assertTrue(getUrl().contains("vans"));
    }
}
