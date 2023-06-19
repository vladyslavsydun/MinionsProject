package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePl extends AbstractBasePage {
    public HomePagePl(WebDriver driver) {
        super(driver);
    }

    private static final String SING_IN_BTN = "//button[@aria-label='Sign In']";

    private static final String CLOSE_BUTTON = "//button[@class='popup-close']";

    private static final String ENROLL_BTN = "//button[@class='sign-in-wrapper__create-account-button sign-in-wrapper__create-account-button']";

    public WebElement getSingInBtn() {
        return waitUntilElementToBeClickable(SING_IN_BTN);
    }

    public WebElement getCloseButton() {
        return waitUntilElementToBeClickable(CLOSE_BUTTON);
    }

    public HomePagePl clickSignInBtn() {
        getSingInBtn().click();
        return this;
    }

    public HomePagePl clickEntrollBtn() {
        getEntrollBtn().click();
        return this;
    }

    private WebElement getEntrollBtn() {
        return waitUntilElementToBeClickable(ENROLL_BTN);
    }


}
