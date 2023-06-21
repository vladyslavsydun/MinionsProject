package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    private static final String GIFT_CARDS_BTN = "//div[contains(@class, 'vf-utility-nav__text') and contains(text(), 'Gift Cards')]";


    public WebElement getLiveChat() {
        return waitUntilVisibilityOfElement(LIVE_CHAT);
    }
    public WebElement getLiveChatAnswerOne() {
        return driver.findElement(By.xpath(LIVE_CHAT_ANSWER_MESSAGE_ONE));
    }public WebElement getLiveChatAnswerTwo() {
        return driver.findElement(By.xpath(LIVE_CHAT_ANSWER_MESSAGE_TWO));
    }
    public WebElement getLiveChatSendButton() {
        return driver.findElement(By.xpath(LIVE_CHAT_SEND_BUTTON));
    }

    public WebElement getGiftCardsButton() {
        return waitUntilVisibilityOfElement(GIFT_CARDS_BTN);
    }

    public HomePage clickGiftCardsButton() {
        getGiftCardsButton().click();
        return this;
    }

    public void clickliveChatSendButton(){
        getLiveChatSendButton().click();
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
}



