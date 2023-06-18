package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class LiveChatTest extends AbstractBaseTest {

    @Test
    public void messagingLiveChat() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        homePage.clickBtnLiveChat();
        homePage.liveChatInsertMessage("Good afternoon, i want to buy some goods in your store. Can you help me with it?");
        homePage.clickliveChatSendButton();

        assertTrue(homePage.getLiveChatAnswerOne().isDisplayed(), "Answer one is not displayed");
        assertTrue(homePage.getLiveChatAnswerTwo().isDisplayed(), "Answer one is not displayed");
    }
}
