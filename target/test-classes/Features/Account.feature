Feature: MobileTest

@MobileTest
Scenario: Home page navigation on mobile

Given User is landing on fb page 
When User login with valid credentials "geethika" and "password2"
Then Home page of FB is displayed "false"