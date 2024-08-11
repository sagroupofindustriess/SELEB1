Feature: Validate login functionality

	 @SmokeTest
  Scenario: Login Application
    Given Navigate STH application
    And Enter uname and password
    When I click on login button
    And wait for some time to load the page
    Then Home page should display
    And Validate home page

	@EndtoEndTest
  Scenario Outline: Validate login with <uname> & <pwd>
    Given Navigate STH application
    And Enter "<uname>" and "<pwd>"
    When I click on login button
    When validate error message

    Examples: 
      | uname | pwd   |
      | Fname | Fpwd  |
      | Sname | Sname |
