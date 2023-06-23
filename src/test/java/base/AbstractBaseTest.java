package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


@Slf4j
abstract public class AbstractBaseTest {
    protected static WebDriver driver;

    public static final String BASE_URL = "https://www.vans.com/en-us";

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser() {
        log.info("<<<=== Teardown");
        driver.quit();
    }

    @SneakyThrows
    public void sleep(long seconds) {
        Thread.sleep(seconds * 1000L);
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
