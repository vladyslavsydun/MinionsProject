package tests;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SalePage;
public class TestSale extends AbstractBaseTest {
    @Test
    public void checkTestSale() {
        SalePage salePage = new SalePage(driver);

        salePage
                .clickSaleBtn();

        Assert.assertTrue(salePage.getSaleBtn().isDisplayed());
    }

}
