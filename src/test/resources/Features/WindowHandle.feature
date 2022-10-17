
@tag
Feature: Window Handling
  @tag1
  Scenario: Handle new tab
  Then Launch the Chrome
  Then Navigate to WindowHandling link
  And Handling New Tab
  
  @tag2
  Scenario: Handle new Window
  Then Launch the Chrome
  Then Navigate to WindowHandling link
  And Handling New Window
  
  @tag3
  Scenario: Handle new Window
  Then Launch the Chrome
  Then Navigate to WindowHandling link
  And Handling New Window Message
  
    