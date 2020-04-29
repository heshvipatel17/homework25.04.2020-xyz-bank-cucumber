Feature: Customer Feature

  As a user I want to login and make a deposit

  Background: User should add a customer successfully
    Given   I am on Home page
    When    I click on BankManagerLogin button
    And     I click on Add Customer button
    And     I enter First name
    And     I enter Last name "Patel"
    And     I enter Post code "HA3"
    And     I click on Add Customer button
    And     I should add customer successfully
    And     I click on Open Account button
    And     I search for the customer by name that I added
    And     I select currency Pound
    And     I should open account successfully
    And     I click on Home button
    Then    I am on Home page

  Scenario: User should login to their account successfully
    Given   I click on CustomerLogin button
    When    I search for my name
    And     I click on Login button
    Then    I should login successfully

  Scenario: Verify the message when user makes a deposit in their account
    Given   I click on CustomerLogin button
    When    I search for my name
    And     I click on Login button
    And     I click on Deposit tab
    And     I enter amount to be deposited
    And     I click on Deposit button
    Then    I should see a message displayed "Deposit Successful"