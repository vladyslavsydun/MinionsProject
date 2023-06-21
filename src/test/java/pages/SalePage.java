package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.moveCursor;
import static base.CommonActions.scrollToElement;

public class SalePage extends AbstractBasePage {
    public SalePage(WebDriver driver) {
        super(driver);
    }

    private static final String SALE_PARAMETER_WOMEN = "//span[@aria-label='Women (419)']/preceding-sibling::div";
    private static final String SALE_BTN_ADD_TO_FAVORITES_FIRST_PRODUCT = "//button[@aria-label='Add to Favorites Slip-On Checkerboard Shoe']/*";

    public WebElement getBtnAddToFavoritesFirstProduct() {
        return waitUntilElementToBeClickable(SALE_BTN_ADD_TO_FAVORITES_FIRST_PRODUCT);
    }

    public WebElement getSaleParameterWomen() {
        return driver.findElement(By.xpath(SALE_PARAMETER_WOMEN));
    }

    public SalePage btnAddtoFavoritesClick(){
        scrollToElement(getBtnAddToFavoritesFirstProduct(), driver);
        moveCursor(getBtnAddToFavoritesFirstProduct(), driver);
        getBtnAddToFavoritesFirstProduct().click();
        return this;
    }
}
