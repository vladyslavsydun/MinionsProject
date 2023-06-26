package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.doubleClick;

public class AddToCardPage extends AbstractBasePage {
    public AddToCardPage(WebDriver driver) {
        super(driver);
    }

    private static final String SHOES_BTN = "//a[@title='Shoes']";
    private static final String PRICE_BTN = "(//div[@class='vf-price vf-product-card__price'])[1]";
    private static final String FEEDBACK_BTN = "//span[@class='_acsBadgeLabel']";
    private static final String ADD_TO_CART_BTN = "(//button[contains(@class, 'add-to-cart-button')])[1]";
    private static final String SIZE_BTN = "(//button[@class='options-swatch__option round'])[1]";
    private static final String ADD_TO_CART_ON_WINDOW_BTN = "//button[@class='vf-button product-add-to-cart__cta vf-button--fullWidth vf-button--primary']";
    private static final String CHECKOUT_BTN = "//button[@class='vf-button minicart__button']";

    public WebElement getShoesBtn() {
        return waitUntilElementToBeClickable(SHOES_BTN);
    }

    public AddToCardPage clickShoeBtn() {
        doubleClick(getShoesBtn(), driver);
        return this;
    }

    public WebElement getPriceBtn() {
        return waitUntilVisibilityOfElement(PRICE_BTN);
    }

    public String getPrice() {
        return getPriceBtn().getText();
    }

    private WebElement getFeedbackBtn() {
        return waitUntilElementToBeClickable(FEEDBACK_BTN);
    }

    public WebElement getAddToCartBtn() {
        return waitUntilVisibilityOfElement(ADD_TO_CART_BTN);
    }

    public AddToCardPage clickAddToCartBtn() {
        getAddToCartBtn().click();
        return this;
    }

    public WebElement getSizeBtn() {
        return waitUntilElementToBeClickable(SIZE_BTN);
    }

    public AddToCardPage clickSizeBtn() {
        getSizeBtn().click();
        return this;
    }

    public WebElement getAddToCartOnWindowBtn() {
        return waitUntilElementToBeClickable(ADD_TO_CART_ON_WINDOW_BTN);
    }

    public AddToCardPage clickAddToCardOnWindowBtn() {
        getAddToCartOnWindowBtn().click();
        return this;
    }

    public WebElement getCheckoutBtn() {
        return waitUntilElementToBeClickable(CHECKOUT_BTN);
    }

    public AddToCardPage clickCheckoutBtn() {
        getCheckoutBtn().click();
        return this;
    }
}
