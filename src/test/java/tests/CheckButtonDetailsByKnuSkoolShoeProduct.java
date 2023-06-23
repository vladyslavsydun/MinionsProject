package tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KnuSkoolPage;
import pages.KnuSkoolShoeProductPage;

public class CheckButtonDetailsByKnuSkoolShoeProduct extends AbstractBaseTest {

    @Test
    public void checkButtonDetailsByKnuSkoolShoeProduct() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        KnuSkoolShoeProductPage knuSkoolShoeProductPage = new KnuSkoolShoeProductPage(driver);
        KnuSkoolPage knuSkoolPage = new KnuSkoolPage(driver);

        homePage.getSearchBar();
        homePage.setText();
        homePage.getSearchLogoInSearchBar().click();
        knuSkoolPage.firstElementOnPage();
        CommonActions.jsClick(knuSkoolShoeProductPage.getDetailsButton(), driver);

        Assert.assertEquals(knuSkoolShoeProductPage.getTitleText().getText(), "PAY 4 INSTALLMENTS OF $18.75");

        CommonActions.jsClick(knuSkoolShoeProductPage.closeButton(), driver);
        Thread.sleep(1000);

        Assert.assertEquals(0, knuSkoolShoeProductPage.getAdditionalWindowSize());
    }
}
