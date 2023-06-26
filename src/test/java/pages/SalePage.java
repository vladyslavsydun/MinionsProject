package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SalePage extends AbstractBasePage {
    public SalePage(WebDriver driver) {
        super(driver);
    }
    private static final String SALE_BTN = "//a[@style='display: flex; align-items: center; height: 100%; color: rgb(201, 25, 46);']";

    private static final String CARD_SALE_BTN = "(//div[@class='eyebrow vf-product-card__eyebrow'])[1]";

    public WebElement getSaleBtn() {
        return waitUntilElementToBeClickable(SALE_BTN);
    }
    public SalePage clickSaleBtn() {
        getSaleBtn().click();
        return this;
    }
    public WebElement getCardSaleBtn() {
        return waitUntilVisibilityOfElement(CARD_SALE_BTN);
    }
}
