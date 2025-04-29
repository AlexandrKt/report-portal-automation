Feature: Login functionality

  Scenario: Successful login
    Given the user is on the Report Portal login page
    When the user enters username "testuser"
    And the user enters password "password"
    And the user clicks the login button
    Then the user should be redirected to the dashboard page

  Scenario: Login with valid credentials
    When the user logs in with username "demo" and password "demodemo1"
    Then the user should be redirected to the dashboard page

  Scenario: Failed login with incorrect password
    Given the user is on the Report Portal login page
    When the user enters username "testuser"
    And the user enters password "wrongpassword"
    And the user clicks the login button
    # Then an error message "Invalid credentials" should be displayed

  Scenario: Failed login with incorrect username
    Given the user is on the Report Portal login page
    When the user enters username "wronguser"
    And the user enters password "password"
    And the user clicks the login button
    # Then an error message "Invalid credentials" should be displayed