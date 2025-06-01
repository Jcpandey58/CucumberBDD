Feature: Login

Scenario: Successful login

Given User navigates to application
And User clicks the login link
When User Enter the username as TESTBDD@123.COM
And User enters the password as testBDD
Then User click the login button
And login should be success

  When user click on books
  And click Health Book link
  Then click add to cart button
  And success message  should be displayed

#Scenario: Failed login
#
#Given User navigates to application
#And User clicks the login link
#When User Enter the username as TESTBDD@123.COM
#And User enters the password as testBDD
#Then User click the login button
#And login should be failed