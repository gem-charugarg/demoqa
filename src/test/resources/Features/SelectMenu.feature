@tag
Feature: Select Menu

  @tag1
  Scenario: Select Color from dropdown
  	Then Launch Chrome.
  	And Naviagate to Select Menu page
    And Select Old Style Select Menu from the Dropdown
    
 @tag2
  Scenario: Select Color from dropdown
  	Then Launch Chrome.
  	And Naviagate to Select Menu page   
    And Select multi-select values
    
 @tag3
  Scenario: Select Multiselect from dropdown
  	Then Launch Chrome.
  	And Naviagate to Select Menu page 
		And Select Multiselect drop down values
		
	@tag4
  Scenario: Select single value 
  	Then Launch Chrome.
  	And Naviagate to Select Menu page 
  	Then Select a avlue