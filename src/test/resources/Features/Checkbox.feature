
@tag
Feature: Checkbox
	Check the functionality for checkbox
  @tag1
  Scenario: Verify User able to expand the node and check the checkbox
    Given Launch Chrome Browser
  	Then Navigate to the link
  	Then Expand the nodes by click on + button
  	And Click the Notes checkbox
  	Then Close the browser
  	
  @tag2
 	Scenario Outline: Verify User can see success text by check the checkbox
    Given Launch Chrome Browser
  	Then Navigate to the link
  	Then Expand the nodes by click on + button
  	And Click the "<check>" checkbox  
  	Then Verify the success text.
  	Then Close the browser
  	Examples:
  	| check  |
  	| Notes  |
  
  @tag3
  Scenario: Verify User can collapse the node 
  Given Launch Chrome Browser
  Then Navigate to the link
  Then Expand the nodes by click on + button
  Then Collapse the node by click on - button
  Then Close the browser
  
  @tag4
  Scenario: Verify User able to expand the node
	Given Launch Chrome Browser
  Then Navigate to the link
  Then Expand the nodes by click on + button
  Then Close the browser
  