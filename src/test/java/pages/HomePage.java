package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String BTN_LOGO = "//a[contains(@class,'vf-header__logo-link large-only')]";

    public WebElement getLogo() {
        return driver.findElement(By.xpath(BTN_LOGO));
    }
}


