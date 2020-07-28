$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/RegisterUser.feature");
formatter.feature({
  "line": 1,
  "name": "Filling the Registration Form of Mercury Tours",
  "description": "",
  "id": "filling-the-registration-form-of-mercury-tours",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User Navigates to Mercury Registration Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Mercury Home Page --\u003e Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterUserStepDefs.setUp()"
});
formatter.result({
  "duration": 21242493000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User Fills the Registration Form",
  "description": "",
  "id": "filling-the-registration-form-of-mercury-tours;user-fills-the-registration-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User Fills First Name as \"Nethmini\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Fills Last Name as \"Senanayake\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Fills Phone Number as \"06 55 563 091\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Fills Email as \"david.p.91@malinator.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Fills User Name as \"david.p.91@malinator.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Fills Passoword as \"Nethmini@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Fills Confrim Password as \"Nethmini@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Clicks on Submit Button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Note should denote your User Name is \"david.p.91@malinator.com\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Nethmini",
      "offset": 26
    }
  ],
  "location": "RegisterUserStepDefs.setFirstNameAs(String)"
});
formatter.result({
  "duration": 174186500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Senanayake",
      "offset": 25
    }
  ],
  "location": "RegisterUserStepDefs.LastNameAs(String)"
});
formatter.result({
  "duration": 136513600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "06 55 563 091",
      "offset": 28
    }
  ],
  "location": "RegisterUserStepDefs.setPhoneNumberAs(String)"
});
formatter.result({
  "duration": 141091800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "david.p.91@malinator.com",
      "offset": 21
    }
  ],
  "location": "RegisterUserStepDefs.setEmailAs(String)"
});
formatter.result({
  "duration": 227194300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "david.p.91@malinator.com",
      "offset": 25
    }
  ],
  "location": "RegisterUserStepDefs.setUserNameAs(String)"
});
formatter.result({
  "duration": 222040400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nethmini@123",
      "offset": 25
    }
  ],
  "location": "RegisterUserStepDefs.setPassowordAs(String)"
});
formatter.result({
  "duration": 143228500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nethmini@123",
      "offset": 32
    }
  ],
  "location": "RegisterUserStepDefs.setConfrimPasswordAs(String)"
});
formatter.result({
  "duration": 154594200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserStepDefs.clicksOnSubmitButton()"
});
formatter.result({
  "duration": 3410509500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "david.p.91@malinator.com",
      "offset": 38
    }
  ],
  "location": "RegisterUserStepDefs.noteShouldDenoteYourUserNameIs(String)"
});
formatter.result({
  "duration": 302045400,
  "status": "passed"
});
});