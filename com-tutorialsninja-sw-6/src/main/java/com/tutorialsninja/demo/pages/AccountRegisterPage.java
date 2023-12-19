package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

public class AccountRegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement registerAccount;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomerText;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneNumber;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement subscribeRadioButton;
    @CacheLookup
    @FindBy(css = "input[value='1'][name='agree']")
    WebElement privacyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    public String verifyRegisterAccountText() {
        log.info("Verify register account link : " + registerAccount.toString());
        return getTextFromElement(registerAccount);
    }

    public String verifyTextReturningCustomerOnLoginPage() {
        log.info("Verify returning customer login link : " + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);
    }
    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
        log.info("Enter FirstName : " + firstName.toString());
    }
    public void enterLastName(String surname) {
        sendTextToElement(lastName, surname);
        log.info("Enter lastName : " + lastName.toString());
    }
    final String randomEmail = randomEmail();

    public void enterEmail(String emailAddress) {
        sendTextToElement(email, emailAddress);
        log.info("Enter an email : " + email.toString());
    }

    public static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }

    public void enterTelephoneNumber(String phone) {
        sendTextToElement(telephoneNumber, phone);
        log.info("Enter telephone number : " + telephoneNumber.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password : " + passwordField.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
        log.info("Enter confirm password : " + confirmPasswordField.toString());
    }

    public void clickOnSubscribeRadioButton() {
        clickOnElement(subscribeRadioButton);
        log.info("Click on Subscribe radio button : " + subscribeRadioButton.toString());
    }

    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyCheckBox);
        log.info("click On Privacy Policy CheckBox : " + privacyCheckBox.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("click On Continue Button : " + continueButton.toString());
    }
}
