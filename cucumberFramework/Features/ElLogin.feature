Feature: EL Login Functionality

@smoke
Scenario: Successful login with Valid Email and Valid Password credentials
Given User launched Chrome browser
When User opens the SignIn URL "https://dev-app.elderlylife.co.uk/"
And User Enter Email as "gleecustest88@gmail.com" and Password as "123456789"
When Click on Login button
Then Should open dashboard page
And Close the chrome Browser

@smoke
Scenario: Unsuccessful login with InValid Email and Valid Password credentials
Given User launched Chrome browser
When User opens the SignIn URL "https://dev-app.elderlylife.co.uk/"
And User Enter Email as "gleecustest1@gmail.com" and Password as "123456789"
When Click on Login button
Then Should display an error message
And Close the chrome Browser

Scenario: Unsuccessful login with Valid Email and Invalid Password credentials
Given User launched Chrome browser
When User opens the SignIn URL "https://dev-app.elderlylife.co.uk/"
And User Enter Email as "gleecustest1@gmail.com" and Password as "12345678"
And Click on Login button
Then Should display an error message
And Close the chrome Browser

Scenario: Unsuccessful login with InValid Email and Password credentials
Given User launched Chrome browser
When User opens the SignIn URL "https://dev-app.elderlylife.co.uk/"
And User Enter Email as "gleecustest111@gmail.com" and Password as "12345679"
And Click on Login button
Then Should display an error message
And Close the chrome Browser

Scenario: Unsuccessful login with Password lessthan 8 digits
Given User launched Chrome browser
When User opens the SignIn URL "https://dev-app.elderlylife.co.uk/"
And User Enter Email as "gleecustest1@gmail.com" and Password as "1234567"
And Click on Login button
Then Should display an error message as invalid password
And Close the chrome Browser


Scenario: Unsuccessful login with Email and Without Password credentials
Given User launched Chrome browser
When User opens the SignIn URL "https://dev-app.elderlylife.co.uk/"
And User Enter Email as "gleecustest1@gmail.com" and Password as ""
And Click on Login button
Then Should display an error message as invalid password
And Close the chrome Browser



Scenario: Unsuccessful login without Email and with Password credentials
Given User launched Chrome browser
When User opens the SignIn URL "https://dev-app.elderlylife.co.uk/"
And User Enter Email as "" and Password as "123456789"
And Click on Login button
Then Should display an error message as invalid email
And Close the chrome Browser

Scenario: Unsuccessful login without Email and Password credentials
Given User launched Chrome browser
When User opens the SignIn URL "https://dev-app.elderlylife.co.uk/"
And User Enter Email as "" and Password as ""
And Click on Login button
Then Should display an error message as invalid email and password
And Close the chrome Browser

Scenario: Unsuccessful login Unregistered Email Id
Given User launched Chrome browser
When User opens the SignIn URL "https://dev-app.elderlylife.co.uk/"
And User Enter Email as "gleecustest11a1@gmail.com" and Password as "123456789"
And Click on Login button
Then Should display an error message
And Close the chrome Browser








