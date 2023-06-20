package pages;

import base.AbstractBasePage;
import base.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.InitialTest;

import static base.CommonActions.moveCursor;

public class HomePage extends AbstractBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String BTN_LOGO = "//a[contains(@class,'vf-header__logo-link large-only')]";
    private static final String BTN_LIVE_CHAT = "//a[contains(@class, 'gtm-live-chat')]";
    private static final String FIELD_INPUT_MESSAGE = "//textarea[@id = 'tcChat_txtInput_input']";
    private static final String LIVE_CHAT = "//div[@id='tc_chat_boxchatWindow']";
    private static final String LIVE_CHAT_SEND_BUTTON = "//button[@id='tcChat_btnSend_img']";
    private static final String LIVE_CHAT_ANSWER_MESSAGE_ONE = "//span[contains(text (), 'We are sorry for the inconvenience!  Would you like to chat with a live agent?')]";
    private static final String LIVE_CHAT_ANSWER_MESSAGE_TWO = "//span[contains(text (), 'Was this helpful?')]";
    private static final String BTN_JUST_IN = "(//a[contains(@class, 'vf-button--tertiary')])[2]";
    private static final String INSTAGRAM_LOGO_BUTTON = "//a[@class='icon icon-instagram']";

    public WebElement getLiveChat() {
        return waitUntilVisibilityOfElement(LIVE_CHAT);
    }

    public WebElement getLiveChatAnswerOne() {
        return driver.findElement(By.xpath(LIVE_CHAT_ANSWER_MESSAGE_ONE));
    }

    public WebElement getLiveChatAnswerTwo() {
        return driver.findElement(By.xpath(LIVE_CHAT_ANSWER_MESSAGE_TWO));
    }

    public WebElement getLiveChatSendButton() {
        return driver.findElement(By.xpath(LIVE_CHAT_SEND_BUTTON));
    }

    public void clickliveChatSendButton() {
        getLiveChatSendButton().click();
    }

    public WebElement getJustInBtn() {
        return waitUntilElementToBeClickable(BTN_JUST_IN);
    }

    public HomePage clickBtnJustIn() {
        moveCursor(getJustInBtn(), driver);
        getJustInBtn().click();
        return this;
    }

    public WebElement getInstagramLogoButton() {
        return waitUntilElementToBeClickable(INSTAGRAM_LOGO_BUTTON);
    }

    public WebElement getLogo() {
        return driver.findElement(By.xpath(BTN_LOGO));
    }

    public WebElement getBtnLiveChat() {
        return waitUntilElementToBeClickable(BTN_LIVE_CHAT);
    }

    public HomePage clickBtnLiveChat() {
        waitUntilVisibilityOfElement(BTN_LIVE_CHAT);
        moveCursor(getBtnLiveChat(), driver);
        getBtnLiveChat().click();
        return this;
    }

    public WebElement getFieldInputMessage() {
        return waitUntilVisibilityOfElement(FIELD_INPUT_MESSAGE);
    }

    public HomePage liveChatInsertMessage(String message) {
        HomePage homePage = new HomePage(driver);
        homePage.
                clickBtnLiveChat();
        homePage.getFieldInputMessage().sendKeys(message + Keys.ENTER);
        return this;
    }


    // TestMenuBar
    private static final String ACCESSORIES = "//a[@title=\"Accessories\"]";

    public WebElement getMenu() {
        return driver.findElement(By.xpath(ACCESSORIES));
    }

    private static final String ITEM_ALL_ACCESSORIES = "//a[@class=\"vf-link\"]";

    public WebElement getMenuItem() {
        return driver.findElement(By.xpath(ITEM_ALL_ACCESSORIES));
    }


}








