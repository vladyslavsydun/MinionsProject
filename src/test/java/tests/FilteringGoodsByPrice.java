package tests;

import base.AbstractBase;
import base.AbstractBaseTest;
import base.CommonActions;
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

        CommonActions.scrollToBottonOfThePage(driver);
        AbstractBase.sleep(300);

        List<Double> prices = newArrivalsPage.itemsPrices().stream()
                .map(WebElement::getText)
                .map(str -> str.replace(" ", ""))
                .map(str -> str.replace("$", ""))
                .map(Double::parseDouble).sorted().toList();

        System.out.println(prices);
    }
}
