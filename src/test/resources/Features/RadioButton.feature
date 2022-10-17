
@tag
Feature: RadioButton
	Checking RadioButton Functionality
  @tag1
  Scenario:Verify the RadioButton Functionality
  Given Launch the Chrome Browser
  Then Navigate to RadioButton link
  Then Click on the Radio button
  
  @tag2
  Scenario: Verify User can see the success message after clicking RadioButton
  Given Launch the Chrome Browser
  Then Navigate to RadioButton link
  Then Click on the Radio button
  Then Verify the Success message
  
  @tag3
  Scenario: Verify No button is disable
   Given Launch the Chrome Browser
  Then Navigate to RadioButton link
  Then Click on the No Radio button
  
  
    
  