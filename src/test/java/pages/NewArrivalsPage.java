package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewArrivalsPage extends AbstractBasePage{
    public NewArrivalsPage(WebDriver driver) {
        super(driver);
    }

    private static final String SORT_REVELANCE_BUTTON = "//select[@class='vf-select__select' and @id='Sort']";
    private static final String PRICE_HIGH_TO_LOW_BUTTON = "//option[@class='vf-select__option' and @value='priceHighToLow']";
    private static final String CHECK_PRODUCTS_FROM_THE_LIST = "//div[@class='vf-product-card vf-product-card--vans-card']";

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
}
