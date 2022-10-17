
Feature: 	Login

Scenario: Successful login with valid credentials
Given Chrome is launched
When User login on "https://admin-demo.nopcommerce.com/login"
And User enters email as "admin@yourstore.com" and password as "admin"
And click on login
Then Page title shoud be "Dashboard / nopCommerce administration"
When user click on Logout link
Then Page title should be "Your store. Login"
And Close browser


Scenario Outline: Successful login with valid credentials
Given Chrome is launched
When User login on "https://admin-demo.nopcommerce.com/login"
And User enters email as "<email>" and password as "<password>"
And click on login
Then Page title shoud be "Dashboard / nopCommerce administration"
When user click on Logout link
Then Page title should be "Your store. Login"
And Close browser

Examples:
     |email|password|
     |admin@yourstore.com|admin|
     |admin1@yourstore.com|admin123|