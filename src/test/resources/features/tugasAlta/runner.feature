Feature: Login

  Background:
    Given user is in Login Page

  Scenario: user successfully login
    And user input email
    And user input password
    When user click on Login Button
    Then user is directed to Profile page

  Scenario: user unsuccessfully login
    And user input email
    When user click on Login Button
    Then user should see a warning