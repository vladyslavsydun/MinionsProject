package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.scrollToElement;

public class KidsShoesPage extends AbstractBasePage {

    public KidsShoesPage(WebDriver driver) {
        super(driver);
    }

    private static final String BTN_FIRST_PRODUCT_ADD_TO_CART = "//div[@id='VN000VHE6BT']//button[contains(@class ,'product-card__a')]";
    private static final String POP_UP_AFTER_ADDING_TO_CART = "//div[@class='vf-modal__content']";
    private static final String PARAMETER_KIDS_SHOE_SIZE_10_5 = "//a[@icon='shoe-style-10.5']";
    private static final String PARAMETER_COLOR_BLACK = "//a[contains(@href, '/en-us/kids/shoes/kids-5-10-years-c3101?f=Color,Bla')]//div";
    private static final String PARAMETER_BTN_PATTERN = "//button[@aria-label='Pattern']";
    private static final String PARAMETER_BTN_CONTAINER_PATTERN_ANIMAL_PRINT = "//span[contains(text (),'Animal Print (2)')]/preceding-sibling::div";
    private static final String PARAMETER_BTN_PRICE = "//button[@aria-label='Price']";
    private static final String PARAMETER_BTN_COLOR = "//div[@id='tab-panel-name-color']";
    private static final String PARAMETER_CHOSEN_COLOR_BLACK = "//div[@class='category__filters-applied-wrapper large-only']//button[@aria-label='Reset'][1]";
    private static final String PARAMETER_CHOSEN_10_5 = "//div[@class='category__filters-applied-wrapper large-only']//button[@aria-label='Reset'][2]";
    private static final String MAX_VALUE_INPUT = "//input[@id='max-price-input']";

    public WebElement getParameterChosen10_5() {
        return waitUntilVisibilityOfElement(PARAMETER_CHOSEN_10_5);
    }

    public WebElement getParameterChosenColor() {
        return waitUntilVisibilityOfElement(PARAMETER_CHOSEN_COLOR_BLACK);
    }

    public WebElement getParameterBtnColor() {
        return waitUntilVisibilityOfElement(PARAMETER_BTN_COLOR);
    }

    public WebElement getBtnParameterPrice() {
        return waitUntilVisibilityOfElement(PARAMETER_BTN_PRICE);
    }

    public WebElement getBtnContainerPatternAnimalPrint() {
        return waitUntilVisibilityOfElement(PARAMETER_BTN_CONTAINER_PATTERN_ANIMAL_PRINT);
    }

    public WebElement getBtnPattern() {
        return waitUntilVisibilityOfElement(PARAMETER_BTN_PATTERN);
    }

    public WebElement getParamColorBlack() {
        return waitUntilElementToBeClickable(PARAMETER_COLOR_BLACK);
    }

    public WebElement getParamKidsShoeSize10_5() {
        return waitUntilVisibilityOfElement(PARAMETER_KIDS_SHOE_SIZE_10_5);
    }

    public WebElement getPopUpAfterAddingToCart() {
        return waitUntilVisibilityOfElement(POP_UP_AFTER_ADDING_TO_CART);
    }

    public WebElement getBtnFirstProductAddToCart() {
        return waitUntilVisibilityOfElement(BTN_FIRST_PRODUCT_ADD_TO_CART);
    }

    public WebElement getMaxPrice() {
        return waitUntilVisibilityOfElement(MAX_VALUE_INPUT);
    }

    public KidsShoesPage clickParamKidsShoeSize10_5() {
        getParamKidsShoeSize10_5().click();
        return this;
    }

    public KidsShoesPage clickParamColorBlack() {
        scrollToElement(getParameterBtnColor(), driver);
        getParamColorBlack().click();
        return this;
    }

    public KidsShoesPage clickBtnPattern() {
        scrollToElement(getBtnPattern(), driver);
        getBtnPattern().click();
        return this;
    }

    public KidsShoesPage clickBtnContainerPatternAnimalPrint() {
        getBtnContainerPatternAnimalPrint().click();
        return this;
    }
}
