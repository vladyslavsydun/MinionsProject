package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GotQuestionsPage extends AbstractBasePage {

    public GotQuestionsPage(WebDriver driver) {
        super(driver);
    }

    private static final String EMAIL_BUTTON_IN_CONTACT_US_SECTION = "(//p[@class='ccu__text ccu__text--cap'])[2]";
    private static final String TITLE_CONTACT_EMAIL = "//a[@href='mailto:US_Customer_Care@Vans.com']";

    public WebElement getEmailButtonInContactUsSection() {
        return waitUntilVisibilityOfElement(EMAIL_BUTTON_IN_CONTACT_US_SECTION);
    }

    public WebElement getTitleContactEmail() {
        return waitUntilVisibilityOfElement(TITLE_CONTACT_EMAIL);
    }
}
