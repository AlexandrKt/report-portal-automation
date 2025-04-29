package com.epam.reportportal.automation.core.api;
import com.epam.reportportal.automation.core.configuration.Configuration;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
public class ApiService {
    protected RequestSpecification given() {
        return RestAssured.given()
                .baseUri(Configuration.getProperty("reportportal.api.url"))
                .auth().basic(Configuration.getProperty("reportportal.api.username"), Configuration.getProperty("reportportal.api.password"))
                .contentType("application/json");
    }
}
