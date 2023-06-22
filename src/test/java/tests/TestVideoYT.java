package tests;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import base.CommonActions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import static base.AbstractBase.sleep;


public class TestVideoYT extends AbstractBaseTest {
    @Test
    public void checkYouTubeRedirection() {

        HomePage homePage = new HomePage(driver);
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);

        CommonActions.scrollToElement(homePage.getBmx(), driver);
        homePage.getBmx().click();
        homePage.getVideo().click();
        sleep(2);
        for (int i = 0; i < 4; i++) {
            homePage.getArrowBtn().click();
        }
        sleep(1);
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='vf-video vf-video-tile__video']//iframe[@id='yt-video-bhK9BK2NNs4']")));
        sleep(1);
        driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/watch?v=bhK9BK2NNs4&embeds_referring_euri=https%3A%2F%2Fwww.vans.com%2F&embeds_referring_origin=https%3A%2F%2Fwww.vans.com&feature=emb_imp_woyt\"]")).click();
        abstractBasePage.goToNextTab(2);
        sleep(2);

        Assert.assertTrue(getUrl().contains("youtube.com"));
    }
}