package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement click;
    @CacheLookup
    @FindBy(css = "div[id='content'] h1")
    WebElement productName;

    @CacheLookup
    @FindBy(name = "quantity")
    WebElement quantityField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;

    public void selectProduct(String product) {
        sendTextToElement(click, product);
        log.info("Select Products : " + click.toString());
    }

    public String getTextFromProductsName() {
        log.info("Get Text From Products Name : " + productName.toString());
        return getTextFromElement(productName);
    }

    public void enterQuantity(String qty) {
        clearTextFromField(quantityField);
        sendTextToElement(quantityField, qty);
        log.info("Entering Quantity : " + quantityField.toString());
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Click On Add To Cart : " + addToCart.toString());
    }

    public String getProductText() {
        log.info("Getting Product Text : " + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartLinkIntoSuccessMessage() {
        clickOnElement(shoppingCartLink);
        log.info("Click On Shopping Cart Link In to Success Message : " + shoppingCartLink.toString());
    }
}
