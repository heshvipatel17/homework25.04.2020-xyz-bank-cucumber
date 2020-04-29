package com.xyz.bank.pages;

import com.cucumber.listener.Reporter;
import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement _addCustomerLink;

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement _openAccountLink;

    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    WebElement _customersLink;


    public void clickOnAddCustomerLink() {
        Reporter.addStepLog(" Clicking on add customer link" + _addCustomerLink.toString());
        clickOnElement(_addCustomerLink);
        log.info(" Clicking on add customer link" + _addCustomerLink.toString());

    }

    public void clickOnOpenAccountLink() {
        Reporter.addStepLog(" Clicking on open account link" + _openAccountLink.toString());
        clickOnElement(_openAccountLink);
        log.info(" Clicking on open account link" + _openAccountLink.toString());
    }

    public void clickOnCustomersLink() {
        Reporter.addStepLog(" Clickink on customer link" + _customersLink.toString());
        clickOnElement(_customersLink);
        log.info(" Clickink on customer link" + _customersLink.toString());
    }

}
