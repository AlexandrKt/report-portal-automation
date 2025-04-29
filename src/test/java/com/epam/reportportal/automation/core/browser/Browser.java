package com.epam.reportportal.automation.core.browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
public class Browser {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browserType = Configuration.getProperty("browser");
            if (browserType == null || browserType.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (browserType.equalsIgnoreCase("safari")) {
                driver = new SafariDriver();
            } else {
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
