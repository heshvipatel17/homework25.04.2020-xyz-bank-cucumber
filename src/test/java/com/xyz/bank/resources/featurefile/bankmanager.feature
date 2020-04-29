#Feature: Bank Manager Feature
#As a user I want to add customer and open a account
#
#Background: User should add a customer successfully
#
#Given   I am on Home page
#When    I click on BankManagerLogin button
#And     I click on Add Customer button
#And     I enter First name
#And     I enter Last name "Patel"
#And     I enter Post code "HA3"
#And     I click on Add Customer button
#Then    I should add customer successfully
#
#Scenario: User should open account successfully
#Given   I click on Open Account button
#When    I search for the customer by name that I added
#And     I select currency Pound
#Then    I should open account successfully
#
#Scenario: User should delete a customer successfully
#Given   I click on Customers Button
#When    I search for the customer
#And     I click on delete button
#Then    I should delete the customer from the Customers list