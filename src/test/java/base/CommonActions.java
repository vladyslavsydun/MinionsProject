package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class CommonActions {
    public void moveCursor(WebElement element, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void doubleClick(WebElement element, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).build().perform();
    }

    public void jsClick(WebElement element, WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void scrollToElement(WebElement element, WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViev(true);", element);
    }
}
