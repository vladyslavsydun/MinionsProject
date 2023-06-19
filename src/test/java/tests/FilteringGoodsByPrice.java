package tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewArrivalsPage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilteringGoodsByPrice extends AbstractBaseTest {

    @Test
    public void filteringGoodsByPrice() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        homePage.clickBtnJustIn();

        NewArrivalsPage newArrivalsPage = new NewArrivalsPage(driver);
        newArrivalsPage.getSortRevelanceButton().click();
        newArrivalsPage.getPriceHighToLowButton().click();

        CommonActions.scroll(250);
        List<Double> prices = newArrivalsPage.itemsPrices().stream()
                .map(WebElement::getText)
                .map(str -> str.replace("$", ""))
                .map(Double::parseDouble)
                .toList();

        System.out.println("List of prices: " + prices);
        for (int i = 0; i < prices.size() - 1; i++) {
            Assert.assertTrue(prices.get(i) >= prices.get(i + 1));
        }
    }
}
