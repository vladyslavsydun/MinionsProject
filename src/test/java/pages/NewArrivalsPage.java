package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewArrivalsPage extends AbstractBasePage {
    public NewArrivalsPage(WebDriver driver) {
        super(driver);
    }

    private static final String NEW_ARRIVALS_TEXT_ON_PRODUCTS = "//div[@class='eyebrow vf-product-card__eyebrow']/span[contains(text(), 'New Arrival')]";

    public WebElement getNewArrivalsTextOnProducts() {
        return waitUntilVisibilityOfElement(NEW_ARRIVALS_TEXT_ON_PRODUCTS);
    }

}
