Feature: TestLeaf Homepage

Background:
  Given user is in the landingpage
    When user clicks on home icon
@Dashboard
Scenario: Homepage testing -dashboard
    Given user on home icon
    When user clicks on dashboard
    Then user will on the dashboard page 
 
 @Auth  
Scenario: Homepage testing - Auth
    Given user on home icon and auth
    When user clicks on Auth and then basic auth popup window come up
    |admin|
    |testleaf|
    And user enters "username" and "pwd"
   