Feature:Login for facebook
  Scenario Outline: Login functionality
    Given User on Login page
    When user enter <username> and <password>
    And clicks on the signup button
    Then the user navigated to homepage
    Examples:
      |username||password|
      |user    ||1234    |

  Scenario : Login functionality
    Given User on Login page
    When user enter thew credentials
    And clicks on the signup button
    Then the user navigated to homepage
   |tharun|password|
    Then the user see the message displayed Login Successfully