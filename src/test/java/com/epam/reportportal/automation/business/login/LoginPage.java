package com.epam.reportportal.automation.business.login;

import com.epam.reportportal.automation.core.browser.Browser;
import com.epam.reportportal.automation.core.configuration.Configuration;
import com.epam.reportportal.automation.core.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {

    private final WebDriver driver = Browser.getDriver();
    private final By usernameInput = By.id("input-1");
    private final By passwordInput = By.id("input-2");
    private final By loginButton = By.xpath("//button[@type='submit']");

    public void open() {
        driver.get(Configuration.getProperty("reportportal.url") + "/contact-us/general");
    }

    public void enterUsername(String username) {
        WebElement usernameField = WaitUtils.waitForElementVisible(driver, usernameInput);
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = WaitUtils.waitForElementVisible(driver, passwordInput);
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginBtn = WaitUtils.waitForElementVisible(driver, loginButton);
        loginBtn.click();
    }

    public void login(String username, String password) {
        open();
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
