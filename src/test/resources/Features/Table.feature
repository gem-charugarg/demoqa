
@tag
Feature: WebTables
  Checking Functionality of WebTables

  @tag1
  Scenario: Check column header names in Tables.
  Given Launch the Chrome.
  Then Navigate to the Webtable link
  And Verify the Column header names.
  Then Close browser.
    
 @tag2
 Scenario Outline: Verify User can add the row in the table
 Given Launch the Chrome.
 Then Navigate to the Webtable link
 Then Click on Add button
 Then Enter "<value1>" in First Name
 Then Enter "<value2>" in Last Name
 Then Enter "<value3>" in Email
 Then Enter "<value4>" in Age
 Then Enter "<value5>" in Salary
 Then Enter "<value6>" in Department
 Then Click on the submit button.
 
 Examples:
 |value1 |value2|value3       |value4|value5|value6|
 |Ram    |Singh |abc@gmail.com|25    |900000| IT   |
 
 @tag3
 Scenario Outline: Verify User can not add the row in the table if the required fielld is not added
 Given Launch the Chrome.
 Then Navigate to the Webtable link
 Then Click on Add button
 Then Enter "<value1>" in First Name
 Then Enter "<value2>" in Last Name
 Then Enter "<value3>" in Email
 Then Enter "<value4>" in Age
 Then Enter "<value5>" in Salary
 Then Click on the submit button.
 Examples:
 |value1 |value2|value3       |value4|value5|
 |Ram    |Singh |abc@gmail.com|25    |900000|