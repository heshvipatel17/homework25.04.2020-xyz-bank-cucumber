package com.xyz.bank.pages;

import com.cucumber.listener.Reporter;
import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement _firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement _lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement _postCodeField;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _addCustomerbtn;

    public void enterFirstName() {
        String firstName = "Jitu" + Utility.getRandomString(2);
        Reporter.addStepLog(" Enter first name " + firstName + " to the first name field" + _firstNameField.toString());
        sendTextToElement(_firstNameField, firstName);
        log.info(" Enter first name " + firstName + " to the first name field" + _firstNameField.toString());
    }

    public void enterLastName(String lastName) {
        Reporter.addStepLog(" Enter last name " + lastName + " to the last name field" + _lastNameField.toString());
        sendTextToElement(_lastNameField, lastName);
        log.info(" Enter last name " + lastName + " to the last name field" + _lastNameField.toString());
    }

    public void enterPostCode(String postCode) {
        Reporter.addStepLog(" Enter post code " + postCode + " to the post code field" + _postCodeField.toString());
        sendTextToElement(_postCodeField, postCode);
        log.info(" Enter post code " + postCode + " to the post code field" + _postCodeField.toString());
    }

    public void clickOnAddCustomerButton(String str) {
        Reporter.addStepLog(" Clicking on add customer button " + _addCustomerbtn.toString());
        waitUntilElementToBeClickable(_addCustomerbtn, 10);
        clickOnElement(_addCustomerbtn);
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        String expectedMessage = "Customer added successfully with customer id :";
        Assert.assertTrue(str, actualMessage.contains(expectedMessage));
        alert.accept();

    }


}
