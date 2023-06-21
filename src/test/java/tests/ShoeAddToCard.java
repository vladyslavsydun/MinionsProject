package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCardPage;
import pages.CartPage;

public class ShoeAddToCard extends AbstractBaseTest {
    @Test
    public void checkShoesAddToCard() {
        AddToCardPage addToCardPage = new AddToCardPage(driver);
        CartPage cartPage = new CartPage(driver);

        addToCardPage
                .clickShoeBtn();

        String priceBeforeOrdering = addToCardPage.getPrice();


        addToCardPage
                .clickAddToCartBtn()
                .clickSizeBtn()
                .clickAddToCardOnWindowBtn()
                .clickCheckoutBtn();

        Assert.assertEquals(cartPage.getOrderPrice(), priceBeforeOrdering);
        Assert.assertTrue(cartPage.getCartProduct().isDisplayed());
    }
}
