
@tag
Feature: Textbox

  @tag1
  Scenario Outline: Verify uesr able to submit the details.
  Given I launch Chrome Browser
  Then Open website demoqa.com
  Then Enter the value in "<field1>" Full Name 
  Then Enter the value in "<field2>" Email
  Then Enter the value in "<field3>" Current Address
	Then Enter the value in "<field4>" Permanent Address
	And Click on submit button.
	Then Close the browser.
	Examples:
	| field1   |field2         | field3         | field4        |
	|abc       | abc@gmail.com | Krishna Colony |Krishna Colony |
	
	@tag2
	Scenario Outline: Verify User details on submmiting the details.
	Given I launch Chrome Browser
  Then Open website demoqa.com
  Then Enter the value in "<field1>" Full Name 
  Then Enter the value in "<field2>" Email
  Then Enter the value in "<field3>" Current Address
	Then Enter the value in "<field4>" Permanent Address
	And Click on submit button.
	Then Verify the details of users
	Then Close the browser.
	Examples:
	| field1   |field2         | field3        | field4        |
	|abc       |abc@gmail.com  |Krishna Colony |Krishna Colony |
  