package com.xyz.bank.pages;

import com.cucumber.listener.Reporter;
import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _searchCustomerField;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement _searchCurrencyPound;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _processBtn;


    public void clickOnSearchCustomerField() {
        Reporter.addStepLog(" Clicking on search customer field" + _searchCustomerField.toString());
        clickOnElement(_searchCustomerField);
        log.info(" Clicking on search customer field" + _searchCustomerField.toString());
    }

    public void enterCustomerThatCreatedInFirstTest(int index) {
        Reporter.addStepLog(" Enter name on customer name field " + _searchCustomerField.toString());
        selectByIndexFromDropDown(_searchCustomerField, index);
        log.info(" Enter name on customer name field " + _searchCustomerField.toString());

    }

    public void clickOnSearchCurrencyField() {
        Reporter.addStepLog(" clicking on Pound currency field" + _searchCurrencyPound.toString());
        clickOnElement(_searchCurrencyPound);
        log.info(" clicking on Pound currency field" + _searchCurrencyPound.toString());
    }

    public void clickOnSearchCurrencyFieldPound(int index) {
        Reporter.addStepLog("Search Pound field from currency " + _searchCurrencyPound.toString());
        selectByIndexFromDropDown(_searchCurrencyPound, index);
        log.info("Search Pound field from currency " + _searchCurrencyPound.toString());
    }

    public void clickOnProcessButton(String str) {
        Reporter.addStepLog("Clicking on process button" + _processBtn.toString());
        clickOnElement(_processBtn);
        Alert alert = driver.switchTo().alert();
        String actualMessage = alertGetText();
        String expectedMessage = "Account created successfully with account Number :";
        Assert.assertTrue(str, actualMessage.contains(expectedMessage));
        alert.accept();
    }


}
