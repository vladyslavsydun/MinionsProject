package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;


@Slf4j
abstract public class AbstractBaseTest {
    protected static WebDriver driver;

    public static String WEBDRIVER = "https://www.vans.com/en-us";

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(WEBDRIVER);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @AfterMethod
    public void closeBrowser() {
        log.info("<<<=== Teardown");
        driver.quit();
    }

    public void openUrl(String url) {
        driver.navigate().to(url);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    protected boolean urlContains(String urlPath) {
        return driver.getCurrentUrl().contains(urlPath);
    }
}
