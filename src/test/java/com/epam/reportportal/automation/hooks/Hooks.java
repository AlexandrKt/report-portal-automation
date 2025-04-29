package com.epam.reportportal.automation.hooks;

import com.epam.reportportal.automation.core.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import com.epam.reportportal.client.ReportPortalClient;
import com.epam.reportportal.listeners.ItemStatus;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class Hooks {

    private static final Logger logger = LoggerFactory.getLogger(Hooks.class);
    //private ReportPortalClient reportPortalClient;

    @Before
    public void setUp() {
        logger.info("Starting test execution...");
        // reportPortalClient = new ReportPortalClient(Configuration.getProperty("reportportal.api.url"), Configuration.getProperty("reportportal.project.name"));
        // reportPortalClient.startTestRun("Test Run " + new Date());
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            logger.error("Scenario '{}' failed.", scenario.getName());
            // reportPortalClient.log(scenario.getName(), "Scenario Failed: " + scenario.getStatus(), ItemStatus.FAILED, new Date());
        }
        Browser.quitDriver();
        logger.info("Test execution finished.");
        // if (reportPortalClient != null) {
        //     reportPortalClient.finishTestRun();
        // }
    }
}
