package tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestMenuBar  extends AbstractBaseTest {
    @Test
    private void menuBar() {
        HomePage homePage = new HomePage(driver) ;

        CommonActions.moveCursor(homePage.getMenu(), driver);
        CommonActions.moveCursor(homePage.getMenuItem(), driver);
        homePage.getMenuItem().click();

        Assert.assertEquals (getUrl() , "https://www.vans.com/en-us/accessories-c00083?icn=topnav");
    }
}
