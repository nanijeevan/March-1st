Feature: Login
Scenario: Successful login with valid credentials
Given User Launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And user enters Email as "admin@yourstore.com" and Password as "admin"
And click on Login
Then Page title should be "Dashboard / nopCommerce administration"
When User click on Logout link
Then Page title should be "Your store. Login"
And close browser


Scenario: Unsuccessful login with Invalid Email and Valid Password credentials
Given User Launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And user enters Email as "admin123@yourstore.com" and Password as "admin"
And click on Login
Then Page title should be "Your store. Login"
And close browser




Scenario: Unsuccessful login with Invalid Email and Password credentials
Given User Launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And user enters Email as "admin123@yourstore.com" and Password as "admin123"
And click on Login
Then Page title should be "Your store. Login"
And close browser


Scenario: Unsuccessful login with Valid Email and InValid Password credentials
Given User Launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And user enters Email as "admin@yourstore.com" and Password as "admin"
And click on Login
Then Page title should be "Your store. Login"
And close browser

Scenario: Unsuccessful login with Email and without Password credentials
Given User Launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And user enters Email as "admin@yourstore.com" and Password as ""
And click on Login
Then Page title should be "Your store. Login"
And close browser


Scenario: Unsuccessful login without Email and with Password credentials
Given User Launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And user enters Email as "" and Password as "admin"
And click on Login
Then Page title should be "Your store. Login"
And close browser

Scenario: Unsuccessful login without and Password credentials
Given User Launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And user enters Email as "" and Password as ""
And click on Login
Then Page title should be "Your store. Login"
And close browser











