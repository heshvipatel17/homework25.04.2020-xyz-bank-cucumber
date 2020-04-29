package com.xyz.bank.pages;

import com.cucumber.listener.Reporter;
import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _searchCreatedcustomerName;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _loginBtn;

    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement _verifyYourNameText;


    public void clickOnLoginButton() {
        Reporter.addStepLog(" Clicking onn login button" + _loginBtn.toString());
        clickOnElement(_loginBtn);
        log.info(" Clicking onn login button" + _loginBtn.toString());
    }


    public void searchCustomerName(int index) {
        Reporter.addStepLog(" Enter text "+ index+" to search customer field" + _searchCreatedcustomerName.toString());
        selectByIndexFromDropDown(_searchCreatedcustomerName, index);
        log.info(" Enter text "+ index+"to search customer field" + _searchCreatedcustomerName.toString());
    }



    public void assertYourNameText(String yourNameTxt) {
        Reporter.addStepLog("Verify your name text " + yourNameTxt + " displayed on login page" + _verifyYourNameText.toString());
        verifyText(_verifyYourNameText, "Your Name :");
        log.info("Verify your name text " + yourNameTxt + " displayed on login page" + _verifyYourNameText.toString());
    }
}
