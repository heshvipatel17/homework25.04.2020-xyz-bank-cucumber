$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/xyz/bank/resources/featurefile/customer.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Feature",
  "description": "\r\nAs a user I want to login and make a deposit",
  "id": "customer-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15522337500,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User should add a customer successfully",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on BankManagerLogin button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Add Customer button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter First name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter Last name \"Patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter Post code \"HA3\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on Add Customer button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should add customer successfully",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Open Account button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I search for the customer by name that I added",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select currency Pound",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should open account successfully",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Home button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I am on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 60830300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnBankManagerLoginButton()"
});
formatter.result({
  "duration": 174475900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 234230400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterFirstName()"
});
formatter.result({
  "duration": 278185200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patel",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 73865000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HA3",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterPostCode(String)"
});
formatter.result({
  "duration": 67955300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 271190700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldAddCustomerSuccessfully()"
});
formatter.result({
  "duration": 202926100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnOpenAccountButton()"
});
formatter.result({
  "duration": 71310400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSearchForTheCustomerByNameThatIAdded()"
});
formatter.result({
  "duration": 648605900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectCurrencyPound()"
});
formatter.result({
  "duration": 128515900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldOpenAccountSuccessfully()"
});
formatter.result({
  "duration": 272759200,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iClickOnHomeButton()"
});
formatter.result({
  "duration": 146467600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 119700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User should login to their account successfully",
  "description": "",
  "id": "customer-feature;user-should-login-to-their-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I click on CustomerLogin button",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I search for my name",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerSteps.iClickOnCustomerLoginButton()"
});
formatter.result({
  "duration": 60018600,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iSearchForMyName()"
});
formatter.result({
  "duration": 1464709200,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 60952600,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 871401700,
  "status": "passed"
});
formatter.after({
  "duration": 633768000,
  "status": "passed"
});
formatter.before({
  "duration": 17254430400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User should add a customer successfully",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on BankManagerLogin button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Add Customer button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter First name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter Last name \"Patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter Post code \"HA3\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on Add Customer button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should add customer successfully",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Open Account button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I search for the customer by name that I added",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select currency Pound",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should open account successfully",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Home button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I am on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 327700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnBankManagerLoginButton()"
});
formatter.result({
  "duration": 972992800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 520226700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterFirstName()"
});
formatter.result({
  "duration": 310542800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patel",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 81811400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HA3",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterPostCode(String)"
});
formatter.result({
  "duration": 131180800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 72676300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldAddCustomerSuccessfully()"
});
formatter.result({
  "duration": 130850400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnOpenAccountButton()"
});
formatter.result({
  "duration": 111324800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSearchForTheCustomerByNameThatIAdded()"
});
formatter.result({
  "duration": 699592700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectCurrencyPound()"
});
formatter.result({
  "duration": 119747900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldOpenAccountSuccessfully()"
});
formatter.result({
  "duration": 70862600,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iClickOnHomeButton()"
});
formatter.result({
  "duration": 106786100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 119200,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verify the message when user makes a deposit in their account",
  "description": "",
  "id": "customer-feature;verify-the-message-when-user-makes-a-deposit-in-their-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "I click on CustomerLogin button",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I search for my name",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on Deposit tab",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter amount to be deposited",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on Deposit button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I should see a message displayed \"Deposit Successful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerSteps.iClickOnCustomerLoginButton()"
});
formatter.result({
  "duration": 80407100,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iSearchForMyName()"
});
formatter.result({
  "duration": 371991200,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 68353900,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iClickOnDepositTab()"
});
formatter.result({
  "duration": 239216800,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iEnterAmountToBeDeposited()"
});
formatter.result({
  "duration": 274344400,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iClickOnDepositButton()"
});
formatter.result({
  "duration": 75044100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit Successful",
      "offset": 34
    }
  ],
  "location": "CustomerSteps.iShouldSeeAMessageDisplayed(String)"
});
formatter.result({
  "duration": 42430600,
  "status": "passed"
});
