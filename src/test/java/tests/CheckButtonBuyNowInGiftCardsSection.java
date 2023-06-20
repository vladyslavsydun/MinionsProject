package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.VansGiftCardsPage;

public class CheckButtonBuyNowInGiftCardsSection extends AbstractBaseTest {

    @Test
    public void checkButtonBuyNowInGiftCardsSection() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.clickGiftCardsButton();

        Assert.assertTrue(homePage.getGiftCardsButton().isDisplayed());

        VansGiftCardsPage vansGiftCardsPage = new VansGiftCardsPage(driver);

        vansGiftCardsPage.clickBuyNowButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("cashstar"));
    }
}
