package pages;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends AbstractBasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private static final String CART_PRODUCT = "//div[@class='cart-product-list']";
    private static final String ORDER_TOTAL_BTN = "//td[@class='cart-product__price large-only']//span";

    public WebElement getCartProduct() {
        return waitUntilElementToBeClickable(CART_PRODUCT);
    }

    public WebElement getPriceInOrder() {
        return waitUntilVisibilityOfElement(ORDER_TOTAL_BTN);
    }

    public String getOrderPrice() {
        return getPriceInOrder().getText();
    }
}


