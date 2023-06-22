package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class KnuSkoolPage extends AbstractBasePage {

    public KnuSkoolPage (WebDriver driver) {
        super(driver);
    }

    private static final String FIRST_ELEMENT_ON_PAGE = "(*//a[@data-v-15f7da53])[1]";

    public void  firstElementOnPage() {
        waitUntilElementToBeClickable(FIRST_ELEMENT_ON_PAGE).click();
    }
}
