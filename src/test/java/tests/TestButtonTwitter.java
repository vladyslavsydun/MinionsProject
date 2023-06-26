package tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestButtonTwitter extends AbstractBaseTest {
    @Test
    public void buttonTwiter() {
        HomePage homePage = new HomePage(driver);

        CommonActions.scrollToElement(homePage.getBtn(), driver);
        homePage.getBtn().click();

        Assert.assertTrue(getUrl().contains("VANS"));
    }

}
