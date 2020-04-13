$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Account.feature");
formatter.feature({
  "line": 1,
  "name": "MobileTest",
  "description": "",
  "id": "mobiletest",
  "keyword": "Feature"
});
formatter.before({
  "duration": 495072,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Home page navigation on mobile",
  "description": "",
  "id": "mobiletest;home-page-navigation-on-mobile",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is landing on fb page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User login with valid credentials \"geethika\" and \"password2\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Home page of FB is displayed \"false\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_landing_on_fb_page()"
});
formatter.result({
  "duration": 167381503,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "geethika",
      "offset": 35
    },
    {
      "val": "password2",
      "offset": 50
    }
  ],
  "location": "MyStepDefinitions.user_login_with_valid_credentials_something_and_something(String,String)"
});
formatter.result({
  "duration": 3524672,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 30
    }
  ],
  "location": "MyStepDefinitions.home_page_of_fb_is_displayed_something(String)"
});
formatter.result({
  "duration": 188369,
  "status": "passed"
});
formatter.after({
  "duration": 104448,
  "status": "passed"
});
});