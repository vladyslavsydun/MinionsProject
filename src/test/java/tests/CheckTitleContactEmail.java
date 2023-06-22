package tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GotQuestionsPage;
import pages.HomePage;

public class CheckTitleContactEmail extends AbstractBaseTest {

    @Test
    public void checkTitleContactEmail() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        GotQuestionsPage gotQuestionsPage = new GotQuestionsPage(driver);

        CommonActions.scrollToBottonOfThePage(driver);
        CommonActions.doubleClick(homePage.getContactUsButton(), driver);
        Thread.sleep(1500);
        CommonActions.doubleClick(gotQuestionsPage.getEmailButtonInContactUsSection(), driver);

        Assert.assertEquals(gotQuestionsPage.getTitleContactEmail().getText(), "US_Customer_Care@Vans.com");
    }
}
