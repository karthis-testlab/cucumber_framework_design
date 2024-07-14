Feature: Sauce Demo E-commerce Application Login Feature
  
  As a registered customer
  I want login into the E-commerce Application
  So that I can purchase product which I want

  Scenario: Validate the inventory page with credentials
    Given the web user land into the login page
    When user enter the valid username and password
    And clicks on the login button
    Then user should redirect into inventory page successfully