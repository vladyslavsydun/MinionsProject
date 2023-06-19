package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class LoginPage extends AbstractBasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final String FIRST_NAME_FIELD = "//input[@id='firstname']";

    private static final String LAST_NAME_FIELD = "//input[@id='lastname']";

    private static final String EMAIL_ADDRESS = "//input[@id='emailaddress-']";

    private static final String PASSWORD = "//input[@id='password']";

    private static final String ZIP_CODE = "//input[@id='zipcode']";

    private static final String DATE_OF_BIRTH = "//input[@id='dateofbirth(mm/dd/yyyy)']";

    private static final String CELL_PHONE = "//input[@id='nationalnumber']";
    private static final String PRIVACY_POLICY_CHECH_BOX_BTN = "(//div[@role='checkbox'])[2]";

    private static final String JOIN_NOW = "//button[@data-testid='create-account__submit__button']";

    private static final String ERROR_MESSAGE_TERMS_CONDITIONS = "//input[@name='terms-text-checkbox']" +
            "/../../following-sibling::div[@class='vf-create-account__error-message']";

    public WebElement getFirstNameField() {
        return waitUntilVisibilityOfElement(FIRST_NAME_FIELD);
    }

    public LoginPage fillingFirstNameField(String firstName) {
        getFirstNameField().sendKeys(firstName);
        return this;
    }

    public WebElement getLastNameField() {
        return waitUntilVisibilityOfElement(LAST_NAME_FIELD);
    }

    public LoginPage fillingLastNameField(String lastName) {
        getLastNameField().sendKeys(lastName);
        return this;
    }

    public WebElement getEmailAddressField() {
        return waitUntilVisibilityOfElement(EMAIL_ADDRESS);
    }

    public LoginPage fillingEmailAddressField() {
        Random random = new Random();
        int randomNumber = random.nextInt((int) Math.pow(10, 7));
        String number = String.valueOf(randomNumber);
        getEmailAddressField().sendKeys("zxc" + number + "@gmail.com");
        return this;
    }

    public WebElement getPasswordField() {
        return waitUntilVisibilityOfElement(PASSWORD);
    }

    public LoginPage fillingPasswordField(String password) {
        getPasswordField().sendKeys(password);
        return this;
    }

    public WebElement getZipCodeField() {
        return waitUntilVisibilityOfElement(ZIP_CODE);
    }

    public LoginPage fillingZipCodeField(String zipCode) {
        getZipCodeField().sendKeys(zipCode);
        return this;
    }

    public WebElement getDateOfBirth() {
        return waitUntilVisibilityOfElement(DATE_OF_BIRTH);
    }

    public LoginPage fillingDateOfBirthField(String dateOfBirth) {
        getDateOfBirth().sendKeys(dateOfBirth);
        return this;
    }

    public WebElement getCellPhoneField() {
        return waitUntilVisibilityOfElement(CELL_PHONE);
    }

    public LoginPage fillingCellPhoneField() {
        Random random = new Random();
        int randomNumber = random.nextInt((int) Math.pow(10, 7));
        String number = String.valueOf(randomNumber);
        sleep(1);
        getCellPhoneField().sendKeys("406" + number);
        return this;
    }

    public WebElement getPrivacyPolicyCheckBoxField() {
        return waitUntilVisibilityOfElement(PRIVACY_POLICY_CHECH_BOX_BTN);
    }

    public LoginPage clickPrivacyPolicyCheckBox() {
        getPrivacyPolicyCheckBoxField().click();
        return this;
    }

    public WebElement getJoinNowField() {
        return waitUntilVisibilityOfElement(JOIN_NOW);
    }

    public LoginPage clickJoinNow() {
        sleep(0.3);
        getJoinNowField().click();
        return this;
    }

    public WebElement getErrorMessageTermsConditions() {
        return waitUntilVisibilityOfElement(ERROR_MESSAGE_TERMS_CONDITIONS);
    }

}
