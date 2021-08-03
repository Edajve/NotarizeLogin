package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    static int timeoutForExplicitWait = Integer.parseInt(ConfigReader.getProperty("timeoutForExplicitWait"));

    public static WebDriverWait wait(WebDriver driver) {
        return new WebDriverWait(driver, timeoutForExplicitWait);
    }

    public static void waitForPageTitle(WebDriver driver, String title) {
        wait(driver).until(ExpectedConditions.titleIs(title));
    }

    public static void waitForElementVisible(WebDriver driver, WebElement element) {
        wait(driver).until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementClickable(WebDriver driver, WebElement element) {
        wait(driver).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUrl(WebDriver driver, String url) {
        wait(driver).until(ExpectedConditions.urlMatches(url));
    }

}

