package com.xyz.bank.cucumber.stepdefs;
/* By Jitendra Patel */

import com.cucumber.listener.Reporter;
import com.xyz.bank.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog("I am on Home page");
    }

    @When("^I click on BankManagerLogin button$")
    public void iClickOnBankManagerLoginButton() {
        new HomePage().clickOnBankManagerLoginLink();
    }

    @And("^I click on Add Customer button$")
    public void iClickOnAddCustomerButton() {
        new BankManagerLoginPage().clickOnAddCustomerLink();
    }

    @And("^I enter First name$")
    public void iEnterFirstName() {
        new AddCustomerPage().enterFirstName();
    }

    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastname) {
        new AddCustomerPage().enterLastName(lastname);
    }

    @And("^I enter Post code \"([^\"]*)\"$")
    public void iEnterPostCode(String postCode) {
        new AddCustomerPage().enterPostCode(postCode);
    }

    @Then("^I should add customer successfully$")
    public void iShouldAddCustomerSuccessfully() {
        new AddCustomerPage().clickOnAddCustomerButton("Customer added successfully with customer id :");
    }

    @Given("^I click on Open Account button$")
    public void iClickOnOpenAccountButton() {
        new BankManagerLoginPage().clickOnOpenAccountLink();

    }

    @When("^I search for the customer by name that I added$")
    public void iSearchForTheCustomerByNameThatIAdded() {
//        new OpenAccountPage().clickOnSearchCustomerField();
        new OpenAccountPage().enterCustomerThatCreatedInFirstTest(6);
    }

    @And("^I select currency Pound$")
    public void iSelectCurrencyPound() {
//        new OpenAccountPage().clickOnSearchCurrencyField();
        new OpenAccountPage().clickOnSearchCurrencyFieldPound(2);
    }

    @Then("^I should open account successfully$")
    public void iShouldOpenAccountSuccessfully() {
        new OpenAccountPage().clickOnProcessButton("Account created successfully with account Number :");
    }

    @Given("^I click on Customers Button$")
    public void iClickOnCustomersButton() {
        new BankManagerLoginPage().clickOnCustomersLink();
    }

    @When("^I search for the customer$")
    public void iSearchForTheCustomer() {
//        new CustomersPage().clickOnSearchCustomerField();
        new CustomersPage().enterCustomerThatCreatedInCustomerPage("Jitu");
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        new CustomersPage().clickOnDeleteButton();
    }

    @Then("^I should delete the customer from the Customers list$")
    public void iShouldDeleteTheCustomerFromTheCustomersList() {

    }
}