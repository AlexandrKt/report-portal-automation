package com.epam.reportportal.automation.business.dashboard;
import com.epam.reportportal.automation.core.browser.Browser;
import com.epam.reportportal.automation.core.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DashboardPage {

    private final WebDriver driver = Browser.getDriver();
    private final By pageTitle = By.xpath("//h2[contains(@class, 'pageTitle')]");

    public String getPageTitle() {
        WebElement titleElement = WaitUtils.waitForElementVisible(driver, pageTitle);
        return titleElement.getText();
    }
}
