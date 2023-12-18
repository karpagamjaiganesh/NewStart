Feature: Leafground browing page 

Background:
Given user login leafground page
When user clicks browser icon

@Alert
Scenario: Browing page Alert test
When user see the Alert icon click
And click on alert simple dialog box 
Then get a popup alert click ok

@Frames
Scenario: Browing page frame test
When user see the frame icon click
And click on how many frames inside
Then get a number of frames

Scenario: Browing page window test
When user see the window icon click
And click on open with delay button
Then two windows need to popup


