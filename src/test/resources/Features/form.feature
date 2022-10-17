
@tag
Feature: Form

  
  @tag1
  Scenario Outline: Fill the form
  	Then Launching the browser
  	And Naviagate to form page
    Then Enter the "<value1>" in First Name in Practice form.
    Then Enter the "<value2>" in Last Name in Practice form.
    Then Enter the "<value3>" in Email in Practice form.
    Then Choose the Gender from  Practice form
    Then Enter the "<value4>" in Mobile Number
    Then Select the value from Calendar
    Then Enter the "<value5>" in subjects
    And Choose the Hobbies from Practice form
    Then Select the photo to upload
    And Enter the "<value6>" for address
    #Then Select the State from Dropdown
    #And Select the City from Dropdown
    #And Click on Submit button

    Examples:
    |value1 | value2 | value3       | value4     |value5  |value6                 |
    | abcd  | wxyz   |abc@gmail.com | 1234567890 |English |Krishna Colony Mathura |
