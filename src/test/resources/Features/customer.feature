Feature: 	Customers

Scenario: Add new Customer
Given Chrome is launched
When User login on "https://admin-demo.nopcommerce.com/login"
And User enters email as "admin@yourstore.com" and password as "admin"
And click on login
Then User can view dashboard
When User Click on Customer Menu
And User click on Customer menu tab
Then User can view add new customer page
When User enter customer info
And Click on save button
Then User can view confirmation mesage "The new customer has been added successfully"
Then Close the browser
