package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewArrivalsPage;

import static base.CommonActions.moveCursor;
import static org.testng.Assert.assertTrue;

public class NewArrivalsTest extends AbstractBaseTest {

    @Test
    public void ckeckIfProductsFromNewArrivals() {
        HomePage homePage = new HomePage(driver);
        NewArrivalsPage newArrivalsPage = new NewArrivalsPage(driver);

        moveCursor(homePage.getBtnShoes(), driver);
        homePage
                .getBtnNewArrivalsMens().click();

        assertTrue(newArrivalsPage.getNewArrivalsTextOnProducts().isDisplayed());
    }
}
