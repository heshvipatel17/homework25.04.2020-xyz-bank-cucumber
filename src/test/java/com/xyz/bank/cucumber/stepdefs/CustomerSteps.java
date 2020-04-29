package com.xyz.bank.cucumber.stepdefs;

/* By Jitendra Patel */

import com.xyz.bank.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CustomerSteps {
    @And("^I click on Home button$")
    public void iClickOnHomeButton() {
        new HomePage().clickOnHomeButton();
    }

    @Given("^I click on CustomerLogin button$")
    public void iClickOnCustomerLoginButton() {
        new HomePage().clickOnCustomerLoginLink();
    }

    @When("^I search for my name$")
    public void iSearchForMyName() {
//        new CustomersPage().clickOnSearchCustomerField();
        new CustomerLoginPage().searchCustomerName(6);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals(new AccountPage().verifyLogOutTxt(), "Logout");
    }

    @And("^I click on Deposit tab$")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositeTab();
    }

    @And("^I enter amount to be deposited$")
    public void iEnterAmountToBeDeposited() {
        new AccountPage().enterdDepositAmount100(100);
    }

    @And("^I click on Deposit button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositeButton();
    }

    @Then("^I should see a message displayed \"([^\"]*)\"$")
    public void iShouldSeeAMessageDisplayed(String depText) {
        Assert.assertEquals(new AccountPage().assertDepositeSuccessfulText(), depText);
    }
}