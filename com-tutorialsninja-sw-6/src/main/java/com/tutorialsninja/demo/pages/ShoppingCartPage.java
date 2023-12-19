package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement text;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'MacBook')])[2]")
    WebElement checkNameOfProductMacBook;
    @CacheLookup
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement clearTheQtyBox;
    @CacheLookup
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement updateTheBox;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement modifiedSuccessMessage;
    @CacheLookup
    @FindBy(xpath = "(//td[contains(text(),'£737.45')])[3]")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOutButton;

    public String verifyThatYouHaveSuccessfullyAddedProductsToTheCart() {
        log.info("verify That You Have Successfully Added Products To The Cart : " + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public String verifyShoppingCartText() {
        log.info("verify Shopping Cart Text : " + text.toString());
        return getTextFromElement(text);
    }

    public String verifyProductName() {
        log.info("verify Product Name : " + productName.toString());
        return getTextFromElement(productName);
    }

    public String verifyModel() {
        log.info("verify Model : " + model.toString());
        return getTextFromElement(model);
    }

    public String verifyTotal() {
        log.info("verify Total : " + total.toString());
        return getTextFromElement(total);
    }

    public String verifyProductNameIsMacBook() {
        log.info("verify Product Name Is MacBook : " + checkNameOfProductMacBook.toString());
        return getTextFromElement(checkNameOfProductMacBook);
    }

    public void clearTheQtyBox() {
        clearTextField(clearTheQtyBox);
        log.info("clear The Qty Box : " + clearTheQtyBox.toString());
    }

    public void enterQuantityIntoTheBox(String qty) {
        sendTextToElement(changeQuantity, qty);
        log.info("enter Quantity Into The Box : " + changeQuantity.toString());
    }

    public void clickOnUpdateTheQuantityBox() {
        clickOnElement(updateTheBox);
        log.info("click On Update The Quantity Box : " + updateTheBox.toString());
    }

    public String verifyUpdatedSuccessMessage() {
        log.info("verify Updated Success Message : " + modifiedSuccessMessage.toString());
        return getTextFromElement(modifiedSuccessMessage);
    }

    public String verifyTotalPrice() {
        log.info("verify Total Price : " + totalPrice.toString());
        return getTextFromElement(totalPrice);

    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
        log.info("click On CheckOut Button : " + checkOutButton.toString());
    }
}
