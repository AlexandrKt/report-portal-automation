package com.epam.reportportal.automation.stepdefinitions.login;

import com.epam.reportportal.automation.business.login.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage();

    @Given("the user is on the Report Portal login page")
    public void theUserIsOnTheReportPortalLoginPage() {
        loginPage.open();
    }

    @When("the user enters username {string}")
    public void theUserEntersUsername(String username) {
        loginPage.enterUsername(username);
    }

    @When("the user enters password {string}")
    public void theUserEntersPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the dashboard page")
    public void theUserShouldBeRedirectedToTheDashboardPage() {
        // Тут можна додати перевірку, що користувач дійсно на сторінці дашбордів
        Assertions.assertThat(new com.epam.reportportal.automation.business.dashboard.DashboardPage().getPageTitle())
                .contains("Dashboard");
    }

    @When("the user logs in with username {string} and password {string}")
    public void theUserLogsInWithUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }
}
