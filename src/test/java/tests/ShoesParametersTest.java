package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KidsShoesPage;

import static org.testng.AssertJUnit.assertTrue;

public class ShoesParametersTest extends AbstractBaseTest {

    @Test
    public void setParametersShoes() {
        HomePage homePage = new HomePage(driver);
        KidsShoesPage kidsShoesPage = new KidsShoesPage(driver);

        homePage
                .clickOnKidsShoes5To10YearsBtn();

        kidsShoesPage
                .clickParamKidsShoeSize10_5()
                .clickParamColorBlack()
                .clickBtnPattern()
                .clickBtnContainerPatternAnimalPrint();

        assertTrue(kidsShoesPage.getParameterChosenColor().isDisplayed());
        assertTrue(kidsShoesPage.getParameterChosen10_5().isDisplayed());
    }
}
