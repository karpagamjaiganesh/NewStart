
Feature: Element icon features

Background:
    Given user login with leafground
    When user clicks on element icon
@text
Scenario: Element ICON text Box testing
    When clicks on text box 
    And click clear the text
    Then clear the text 
    And confirm that text box is blank

Scenario: Element ICON dropdown testing
   When clicks on dropdown
    And click choose course
    Then select palyright
    
Scenario: Element ICON waits testing
    When clicks on waits
    And click Wait for Invisibility  also click
    Then i am about to hide button hides with in seconds
    
    