Feature: Login

  Scenario: login Successful

    Given User navigates to application
    When user click on login button
    When User Enter the username as dharun@123.com
    And User enters the password as
    Then User click the login button
    And login should be success
