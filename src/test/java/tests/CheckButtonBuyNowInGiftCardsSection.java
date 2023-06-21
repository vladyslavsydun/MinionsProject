package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.VansGiftCardsPage;

public class CheckButtonBuyNowInGiftCardsSection extends AbstractBaseTest {

    @Test
    public void checkButtonBuyNowInGiftCardsSection() {
        HomePage homePage = new HomePage(driver);
        VansGiftCardsPage vansGiftCardsPage = new VansGiftCardsPage(driver);

        homePage
                .clickGiftCardsButton();

        Assert.assertTrue(homePage.getGiftCardsButton().isDisplayed());

        vansGiftCardsPage
                .clickBuyNowButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("cashstar"));
    }
}
