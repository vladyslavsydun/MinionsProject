package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VansGiftCardsPage extends AbstractBasePage {
    public VansGiftCardsPage(WebDriver driver) {
        super(driver);
    }

    private static final String BUY_NOW_BUTTON = "//a[contains(@class, 'vf-button') and contains(., 'Buy Now')]";

    public WebElement getBuyNowButton() {
        return waitUntilVisibilityOfElement(BUY_NOW_BUTTON);
    }

    public void clickBuyNowButton() {
        getBuyNowButton().click();
        moveToNextPage();
    }
}
