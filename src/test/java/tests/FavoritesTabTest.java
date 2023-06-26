package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SalePage;

import static org.testng.Assert.assertTrue;


public class FavoritesTabTest extends AbstractBaseTest {
    @Test
    public void favoritesTabTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SalePage salePage = new SalePage(driver);

        homePage
                .goShoesWomanSlipOn();
        salePage
                .btnAddtoFavoritesClick();
//BUG
        assertTrue(homePage.getBtnFavoritesAfterAdding().isDisplayed());
    }
}
