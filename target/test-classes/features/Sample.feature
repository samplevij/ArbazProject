Feature: Validate the Login screen

@smoke
  Scenario Outline: Validate the Login function
    Given I am opening the url "https://demo.guru99.com/test/newtours/"
    When I Enter the credentials as "<username>" and "<password>"
    And I click the Login Button
    Then Login is successful and I am on booking page

    Examples: 
      | username | password |
      | mani.v   | test     |
      | google   | demo     |
