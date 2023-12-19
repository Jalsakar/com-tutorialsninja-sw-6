package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkOutText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement checkNewCustomerText;
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckoutButton;
    @CacheLookup
    @FindBy(css = "#button-account")
    WebElement continueTabButton;
    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailAddress;
    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement cityName;
    @CacheLookup
    @FindBy(name = "postcode")
    WebElement zipCode;
    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement countryName;
    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement zoneName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement addCommentIn;
    @CacheLookup
    @FindBy(css = "input[value='1'][name='agree']")
    WebElement termsAndConditions;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonForPayment;
    @CacheLookup
    @FindBy(xpath = "//div[@class ='alert alert-danger alert-dismissible']")
    WebElement checkWarningForPayment;

    public String verifyCheckOutText() {
        log.info("verify CheckOut Text : " + checkOutText.toString());
        return getTextFromElement(checkOutText);
    }
    public String verifyTextNewCustomer() {
        log.info("verify Text NewCustomer : " + checkNewCustomerText.toString());
        return getTextFromElement(checkNewCustomerText);
    }

    public void clickOnGuestCheckOutButton() {
        clickOnElement(guestCheckoutButton);
        log.info("click On Guest CheckOut Button : " + guestCheckoutButton.toString());
    }

    public void clickOnContinueButtonTab() {
        clickOnElement(continueTabButton);
        log.info("click On Continue ButtonTab : " + continueTabButton.toString());
    }

    public void enterFirstNameIntoTheFirstNameField(String name) {
        sendTextToElement(firstName, name);
        log.info("enter FirstName Into The FirstName Field : " + firstName.toString());
    }

    public void enterLastNameIntoTheLastNameField(String surname) {
        sendTextToElement(lastName, surname);
        log.info("enter LastName Into The LastName Field : " + lastName.toString());
    }

    public void enterEmailIntoTheEmailField(String email) {
        sendTextToElement(emailAddress, email);
        log.info("enter Email Into The Email Field : " + emailAddress.toString());
    }

    public void enterTelephoneIntoTheTelephoneField(String phone) {
        sendTextToElement(telephone, phone);
        log.info("enter Telephone Into The  Telephone Field : " + telephone.toString());
    }

    public void enterAddressIntoTheAddress1Field(String address) {
        sendTextToElement(addressField, address);
        log.info("enter Address Into The Address1 Field: " + addressField.toString());
    }

    public void enterCityIntoTheCityField(String city) {
        sendTextToElement(cityName, city);
        log.info("enter City Into The CityField : " + cityName.toString());
    }

    public void enterPostcodeIntoThePostCodeField(String postcode) {
        sendTextToElement(zipCode, postcode);
        log.info("enter Postcode Into The PostCode Field : " + zipCode.toString());
    }

    public void enterCountryIntoTheCountryField(String country) {
        selectByVisibleTextFromDropDown(countryName, country);
        log.info("enter Country Into The Country Field: " + countryName.toString());
    }

    public void enterZoneIntoTheZoneField(String zone) {
        selectByVisibleTextFromDropDown(zoneName, zone);
        log.info("enter Zone Into The ZoneField : " + zoneName.toString());
    }

    public void clickOnContinueButtonForGuest() {
        clickOnElement(continueButton);
        log.info("click On Continue Button ForGuest : " + continueButton.toString());
    }

    public void addCommentsAboutYourOrderIntoTheTextArea(String comment) {
        sendTextToElement(addCommentIn, comment);
        log.info("add Comments About Your Order Into The Text Area: " + addCommentIn.toString());
    }

    public void clickOnCheckBoxForTermsAndConditions() {
        clickOnElement(termsAndConditions);
        log.info("click On Check Box For Terms And Conditions : " + termsAndConditions.toString());
    }

    public void clickOnContinueButtonForPaymentMethod() {
        clickOnElement(continueButtonForPayment);
        log.info("click On Continue Button For Payment Method : " + continueButtonForPayment.toString());
    }

    public String verifyWarningMessageForPaymentMethod() {
        log.info("verify Warning Message For Payment Method : " + checkWarningForPayment.toString());
        return getTextFromElement(checkWarningForPayment);
    }

}
