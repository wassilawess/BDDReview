$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want a login page so that only authentic",
  "description": "users will be able to login",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: Valid users should be able to login"
    },
    {
      "line": 5,
      "value": "#     Given i am on techfios site"
    },
    {
      "line": 6,
      "value": "#     When i enter username and password"
    },
    {
      "line": 7,
      "value": "#     And  i click on sign in button"
    },
    {
      "line": 8,
      "value": "#     Then Dashboard page should diplay"
    },
    {
      "line": 9,
      "value": "#"
    }
  ],
  "line": 12,
  "name": "Valid users should be able to login using example",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login-using-example",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "i am on techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user logs in with valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login-using-example;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login-using-example;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123"
      ],
      "line": 18,
      "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login-using-example;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5799811972,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Valid users should be able to login using example",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login-using-example;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "i am on techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user logs in with valid \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_techfios_site()"
});
formatter.result({
  "duration": 92680844,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    },
    {
      "val": "abc123",
      "offset": 49
    }
  ],
  "location": "LoginSteps.user_logs_in_with_valid_and(String,String)"
});
formatter.result({
  "duration": 3174782002,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "duration": 1505072666,
  "status": "passed"
});
formatter.after({
  "duration": 2590513589,
  "status": "passed"
});
});