package com.xyz.bank.pages;

import com.cucumber.listener.Reporter;
import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _searchCustomerField;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement _deleteCustomer;

    public void clickOnSearchCustomerField() {
        Reporter.addStepLog(" Clicking on search customer field" + _searchCustomerField.toString());
        clickOnElement(_searchCustomerField);
        log.info(" Clicking on search customer field" + _searchCustomerField.toString());
    }

    public void enterCustomerThatCreatedInCustomerPage(String cusName) {
        Reporter.addStepLog(" Enter text "+ cusName+" to search customer field" + _searchCustomerField.toString());
        sendTextToElement(_searchCustomerField, cusName);
        log.info(" Enter text "+ cusName+"to search customer field" + _searchCustomerField.toString());
    }

    public void clickOnDeleteButton() {
        Reporter.addStepLog(" Delete customer " + _deleteCustomer.toString());
        clickOnElement(_deleteCustomer);
        log.info(" Delete customer " + _deleteCustomer.toString());
    }


}
