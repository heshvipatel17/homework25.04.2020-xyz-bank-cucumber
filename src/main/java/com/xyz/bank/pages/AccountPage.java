package com.xyz.bank.pages;

import com.cucumber.listener.Reporter;
import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement _verifylogOutText;

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement _depositeTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amountToBeDepositedField;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _depositebtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _verifyDepositSuccessfulText;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement _withdrawlTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amountToBeWithdrawlsField;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _withdrawlBtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyTransactionSuccessfulText;



    public void assertLogOutText(String logOutTxt) {
        Reporter.addStepLog(" Verify logout text " + logOutTxt + " dispalyed on login page" + _verifylogOutText.toString());
        verifyText(_verifylogOutText, "Logout");
        log.info(" Verify logout text " + logOutTxt + " dispalyed on login page" + _verifylogOutText.toString());

    }

    public String verifyLogOutTxt() {
        Reporter.addStepLog(" Click on logout button " + _verifylogOutText.toString());
        log.info(" Click on logout button " + _verifylogOutText.toString());
        return getTextFromElement(_verifylogOutText);
    }

    // Method for click ondeposit tab
    public void clickOnDepositeTab() {
        Reporter.addStepLog(" Click on deposit tab " + _depositeTab.toString());
        clickOnElement(_depositeTab);
        log.info(" Click on deposit tab " + _depositeTab.toString());

    }

    // Method for enter deposit field
    public void enterdDepositAmount100(int amount) {
        Reporter.addStepLog(" Enter £100 on deposit field " + _amountToBeDepositedField.toString());
        sendTextToElement(this._amountToBeDepositedField, String.valueOf(amount));
        log.info(" Enter £100 on deposit field " + _amountToBeDepositedField.toString());
    }

    // Method for Click on deposit button
    public void clickOnDepositeButton() {
        Reporter.addStepLog(" Clicking on deposite button " + _depositebtn.toString());
        clickOnElement(_depositebtn);
        log.info(" Clicking on deposite button " + _depositebtn.toString());
    }

    public String assertDepositeSuccessfulText() {
        Reporter.addStepLog(" Verify Deposite successful text displayed on account page" + _verifyDepositSuccessfulText.toString());
        log.info(" Verify Deposite successful text displayed on account page" + _verifyDepositSuccessfulText.toString());
        return getTextFromElement(_verifyDepositSuccessfulText);

    }

    public void clickOnWithdrawlTab() {
        Reporter.addStepLog(" Clicking withdrawal tab" + _withdrawlTab.toString());
        clickOnElement(_withdrawlTab);
        log.info(" Clicking withdrawal tab" + _withdrawlTab.toString());
    }

    public void enterWithdrawlAmount50(String withdrawalAmt) {
        Reporter.addStepLog(" Enter £50 in withdrawal field" + withdrawalAmt + " to withdraw money" + _amountToBeWithdrawlsField.toString());
        sendTextToElement(_amountToBeWithdrawlsField, withdrawalAmt);
        log.info(" Enter £50 in withdrawal field" + withdrawalAmt + " to withdraw money" + _amountToBeWithdrawlsField.toString());
    }

    public void clicOnWithdrawlButton() {
        Reporter.addStepLog(" Clicking withdrawal button " + _withdrawlBtn.toString());
        clickOnElement(_withdrawlBtn);
        log.info(" Clicking withdrawal button " + _withdrawlBtn.toString());
    }

    public void assertTransactionSuccessfulText(String tranSuccessTxt) {
        Reporter.addStepLog(" Verify transaction success text " + tranSuccessTxt + " for withdrawal amt" + _verifyDepositSuccessfulText.toString());
        verifyText(verifyTransactionSuccessfulText, "Transaction successful");
        log.info(" Verify transaction success text " + tranSuccessTxt + " for withdrawal amt" + _verifyDepositSuccessfulText.toString());
    }
}
