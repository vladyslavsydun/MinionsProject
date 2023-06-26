package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KidsShoesPage;

import static base.CommonActions.moveCursor;
import static base.CommonActions.scrollToElement;
import static org.testng.Assert.assertTrue;

public class AddingToCartTest extends AbstractBaseTest {

    @Test
    public void addingKidsShoesToCart() {
        HomePage homePage = new HomePage(driver);
        KidsShoesPage kidsShoesPage = new KidsShoesPage(driver);

        moveCursor(homePage.getBtnShoes(), driver);
        homePage
                .getBtnShoesKids5_10_Years()
                .click();
        scrollToElement(kidsShoesPage.getBtnFirstProductAddToCart(), driver);
        kidsShoesPage
                .getBtnFirstProductAddToCart()
                .click();

        assertTrue(kidsShoesPage.getPopUpAfterAddingToCart().isDisplayed());
    }
}
