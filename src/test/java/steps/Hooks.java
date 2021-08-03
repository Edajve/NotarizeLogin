package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.Driver;




public class Hooks {
    public static WebDriver driver;
    public static Scenario scenario;

    @Before
    public void openBrowser() {
        driver = Driver.getDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
