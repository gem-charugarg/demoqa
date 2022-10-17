
@tag
Feature: Interaction Feature

  @tag1
  Scenario: Explore Resize option
    Given Launching the Chrome.
  	And Naviagate to Resizable page
  	Then Resize the box
  	
  	@tag2
  Scenario: Explore Draggable option
    Given Launching the Chrome.
  	And Naviagate to Draggable page
  	Then Perform Drag
  	
  	@tag3
  Scenario: Explore Draggable option
    Given Launching the Chrome.
  	And Naviagate to Draggable page
  	Then Perform Axis Restricted Drag
  	
  	@tag4
  Scenario: Explore dragDrop option
    Given Launching the Chrome.
  	And Naviagate to dragDrop  page
  	Then Explore dragDrop 
  	
  	@tag5
  Scenario: Explore Draggable option
    Given Launching the Chrome.
  	And Naviagate to Draggable page
  	Then Perform Container Restricted Drag
  	
  	 