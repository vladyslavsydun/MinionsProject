package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KnuSkoolShoeProductPage extends AbstractBasePage {

    public KnuSkoolShoeProductPage (WebDriver driver) {
        super(driver);
    }

    private static final String DETAILS_BUTTON = "(//button[@class='klarna__text--details klarna__text--details klarna__text--details vf-theme-link vf-color-primary'])[1]";
    private static final String CLOSE_BUTTON = "//button[@class='vf-button modal__close-button']";
    private static final String TITLE_TEXT = "(//h2[contains(@class, 'vf-heading__title')])[3]";
    private static final String ADDITIONAL_WINDOW = "//div[contains(@class, 'vf-modal__content')]";

    public WebElement getDetailsButton() {
        return waitUntilElementToBeClickable(DETAILS_BUTTON);
    }

    public WebElement getTitleText() {
        return waitUntilVisibilityOfElement(TITLE_TEXT);
    }

    public int getAdditionalWindowSize(){
        return driver.findElements(By.xpath(ADDITIONAL_WINDOW)).size();
    }

    public WebElement closeButton() {
        return waitUntilVisibilityOfElement(CLOSE_BUTTON);
    }
}
