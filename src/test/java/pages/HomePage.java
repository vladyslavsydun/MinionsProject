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
    private static final String BTN_SHOES = "//a[@data-navigation='00081']";
    private static final String SHOES_BTN_WOMEN_SLIPON = "//a[contains(@href, '/en-us/categories/classic-slip-ons-c5315?f=Gender,W')]";
    private static final String BTN_FAVORITES = "//div[contains(text (), 'Favorites')]";
    private static final String BTN_FAVORITES_AFTER_ADDING_GOODS = "//div[contains(text (), 'Favorites')]/span[contains(text (), '(1)')]";
    private static final String BTN_NEW_ARRIVALS_MENS = "//a[contains(@href , '/en-us/mens/shoes/n')]";
    private static final String BTN_SHOES_KIDS_5_10_YEARS = "//a[contains(@href, '/en-us/kids/shoes/k')]";

    public HomePage clickOnKidsShoes5To10YearsBtn() {
        moveCursor(getBtnShoes(), driver);
        getBtnShoesKids5_10_Years().click();
        return this;
    }

    public WebElement getBtnShoesKids5_10_Years() {
        return waitUntilVisibilityOfElement(BTN_SHOES_KIDS_5_10_YEARS);
    }

    public WebElement getBtnNewArrivalsMens() {
        return waitUntilVisibilityOfElement(BTN_NEW_ARRIVALS_MENS);
    }

    public WebElement getBtnFavoritesAfterAdding() {
        return waitUntilVisibilityOfElement(BTN_FAVORITES_AFTER_ADDING_GOODS);
    }

    public WebElement getBtnFavorites() {
        return waitUntilVisibilityOfElement(BTN_FAVORITES);
    }

    public WebElement getShoesWomanSlipOn() {
        return waitUntilElementToBeClickable(SHOES_BTN_WOMEN_SLIPON);
    }

    public WebElement getLiveChat() {
        return waitUntilVisibilityOfElement(LIVE_CHAT);
    }

    public WebElement getBtnShoes() {
        return waitUntilVisibilityOfElement(BTN_SHOES);
    }

    public WebElement getLiveChatAnswerOne() {
        return waitUntilVisibilityOfElement(LIVE_CHAT_ANSWER_MESSAGE_ONE);
    }

    public WebElement getLiveChatAnswerTwo() {
        return waitUntilVisibilityOfElement(LIVE_CHAT_ANSWER_MESSAGE_TWO);
    }

    public WebElement getLiveChatSendButton() {
        return waitUntilVisibilityOfElement(LIVE_CHAT_SEND_BUTTON);
    }

    public void clickliveChatSendButton() {
        getLiveChatSendButton().click();
    }

    public WebElement getLogo() {
        return waitUntilVisibilityOfElement(BTN_LOGO);
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
        clickBtnLiveChat()
                .getFieldInputMessage().sendKeys(message + Keys.ENTER);
        return this;
    }

    public HomePage goShoesWomanSlipOn() {
        moveCursor(getBtnShoes(), driver);
        getShoesWomanSlipOn().click();
        return this;
    }
}



