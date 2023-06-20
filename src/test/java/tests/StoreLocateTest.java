package tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import static base.AbstractBase.sleep;

public class StoreLocateTest extends AbstractBaseTest {
    @Test
    private void locationVerificationTest() {

        HomePage homePage = new HomePage(driver);
        CommonActions commonActions = new CommonActions();

        CommonActions.scrollToElement(homePage.getLocation(), driver);
        homePage.getLocation().click();
        CommonActions.scrollToElement(homePage.getMenu(), driver);
        sleep(3);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='vf-frame']"))) ;
        homePage.getInputLocal().sendKeys("United State");
        homePage.getClickMenuBar().click();
        homePage.getNumItem().click();
        CommonActions.doubleClick(homePage.getButtonSearch(), driver);
        sleep(3);
        CommonActions.scrollToElement(homePage.getTextLink(), driver);
        homePage.getTextLink().click();

        Assert.assertEquals(homePage.getTitleLocation().getText().trim(),"STORE DETAILS FOR VANS - SHOES, CLOTHING & MORE DEALER / STORE LOCATION IN Tulsa, OK | USA374");
    }
}
