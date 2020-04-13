Feature: FB login

Background: 
Given validate the user
When Browser is invoked
Then checkif browser is opened


@RegTest
Scenario: Home page navigation
Given User is landing on fb page
When User login with valid credentials "geethika" and "password1"
Then Home page of FB is displayed "true"


Scenario: Home page navigation

Given User is landing on fb page
When User login with valid credentials "geethika" and "password2"
Then Home page of FB is displayed "false"


Scenario: Home page navigation

Given User is landing on fb page
When User login with following credentials 
| geethika | abcd |
Then Home page of FB is displayed "false"

@RegTest
Scenario Outline: Home page navigation

Given User is landing on fb page
When User login with valid credentials <Username> and password <Password>
Then Home page of FB is displayed "false"

Examples:
|Username | Password |
|user1    | pass1    |
|user2    | pass2    |
|user3    | pass3    |
