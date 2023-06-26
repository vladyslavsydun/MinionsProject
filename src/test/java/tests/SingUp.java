package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePagePl;
import pages.LoginPage;

public class SingUp extends InitialTest {
    @Test
    public void checkSingUp() throws InterruptedException {
        HomePagePl hpPL = new HomePagePl(driver);
        LoginPage lp = new LoginPage(driver);

        hpPL
                .clickSignInBtn()
                .clickEntrollBtn();
        lp
                .fillingFirstNameField("Tetiana")
                .fillingLastNameField("Romaniuk")
                .fillingEmailAddressField()
                .fillingPasswordField("Zxczxc1234")
                .fillingZipCodeField("43021")
                .fillingDateOfBirthField("11/12/1997")
                .fillingCellPhoneField()
                .clickPrivacyPolicyCheckBox()
                .clickJoinNow();

        Assert.assertEquals(lp.getErrorMessageTermsConditions().getText(), "You must accept the Terms & Conditions.");
    }
}
