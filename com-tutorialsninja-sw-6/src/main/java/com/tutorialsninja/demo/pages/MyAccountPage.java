package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement clickOnMyAccount;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement accountCreation;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueAccountButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement accountLogOutText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueLogOutButton;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement checkTextForMyAccount;

    public String verifyTheMessageYourAccountHasBeenCreated() {
        log.info("Verify The Message Your Account Has Been Created : " + accountCreation.toString());
        return getTextFromElement(accountCreation);
    }

    public void clickOnMyAccountLink() {
        mouseHoverToElementAndClick(clickOnMyAccount);
        log.info("Click On My Account Link : " + clickOnMyAccount.toString());
    }

    public void clickOnContinueAccountButton() {
        log.info("Click On Continue Account Button : " + continueAccountButton.toString());
        clickOnElement(continueAccountButton);
    }

    public String verifyTextForAccountLogOut() {
        log.info("Verify Text For Account LogOut : " + accountLogOutText.toString());
        return getTextFromElement(accountLogOutText);
    }

    public void clickOnContinueLogOutButton() {
        clickOnElement(continueLogOutButton);
        log.info("Click On Continue LogOut Button : " + continueLogOutButton.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click On Login Button : " + loginButton.toString());
    }

    public String verifyTheTextMyAccount() {
        log.info("Verify The Text MyAccount : " + checkTextForMyAccount.toString());
        return getTextFromElement(checkTextForMyAccount);
    }
}
