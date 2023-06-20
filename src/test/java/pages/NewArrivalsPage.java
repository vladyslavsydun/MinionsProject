package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewArrivalsPage extends AbstractBasePage {
    public NewArrivalsPage(WebDriver driver) {
        super(driver);
    }

    private static final String SORT_REVELANCE_BUTTON = "//select[@class='vf-select__select' and @id='Sort']";
    private static final String PRICE_HIGH_TO_LOW_BUTTON = "//option[@class='vf-select__option' and @value='priceHighToLow']";
    private static final String CHECK_PRODUCTS_FROM_THE_LIST = "//div[@class='row full-height align-left-sm align-right-md align-right-lg']//div[@class='vf-product-card vf-product-card--vans-card']//div[@class='vf-price vf-product-card__price']//span";
    private static final String VIEW_MORE_BUTTON = "//button[@class='vf-theme-button vf-theme-button-vans vf-color vf-color-secondary vf-size vf-size-md']";

    public WebElement getSortRevelanceButton() {
        return driver.findElement(By.xpath(SORT_REVELANCE_BUTTON));
    }

    public WebElement getPriceHighToLowButton() {
        return driver.findElement(By.xpath(PRICE_HIGH_TO_LOW_BUTTON));
    }

    public WebElement getCheckProductsFromTheList() {
        return driver.findElement(By.xpath(CHECK_PRODUCTS_FROM_THE_LIST));
    }

    public List<WebElement> itemsPrices() {
        return waitUntilVisibilityOfElementsLocated(CHECK_PRODUCTS_FROM_THE_LIST);
    }

    public WebElement getViewMoreAction() {
        return waitUntilVisibilityOfElement(VIEW_MORE_BUTTON);
    }

    public WebElement getLastPrice() {
        int lastElement = itemsPrices().size();
        return itemsPrices().get(lastElement - 5);
    }
}