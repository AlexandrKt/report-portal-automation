package com.epam.reportportal.automation.stepdefinitions.dashboard;

import com.epam.reportportal.automation.business.dashboard.DashboardPage;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

public class DashboardSteps {
    private final DashboardPage dashboardPage = new DashboardPage();

    @Then("the dashboard page title should contain {string}")
    public void theDashboardPageTitleShouldContain(String expectedTitle) {
        Assertions.assertThat(dashboardPage.getPageTitle()).contains(expectedTitle);
    }
}
