
@tag
Feature: Checking Alert Functionality

  @tag1
  Scenario: Click button to see alert
  Then Launch the Browser
  Then Navigate to Alert link
  Then Click on Alert button
  And Click on ok
  
  
  @tag2
  Scenario: Click alert will appear after 5 seconds
  Then Launch the Browser
  Then Navigate to Alert link
  Then Click on waiting Alert button and accept it.
  
  @tag3
  Scenario: Click alert will appear after 5 seconds
  Then Launch the Browser
  Then Navigate to Alert link
  And Click On button, confirm box will appear 

  @tag4
  Scenario: Click alert will appear after 5 seconds
  Then Launch the Browser
  Then Navigate to Alert link
  And On button click, prompt box will appear
  
  @tag5
  Scenario: Verify the Success message1
  Then Launch the Browser
  Then Navigate to Alert link
  And Verify Success message when confirm box will appear.
  
  @tag6
  Scenario: Verify the Success message2
  Then Launch the Browser
  Then Navigate to Alert link
  And Verify Success message when prompt box will appear.
  
  