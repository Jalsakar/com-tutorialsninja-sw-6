package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNoteBooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNoteBooksPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//h2[normalize-space()='Laptops & Notebooks'])[1]")
    WebElement laptopsAndNotebooksText;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='input-sort'])[1]")
    WebElement sortByPriceHighToLow;
    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    WebElement arrayListOfProducts;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement dropDownPath;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement price;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement product;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement checkTextMacBook;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessageForAddingProduct;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement linkToShoppingCartInsideMessage;
    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> priceList;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByPrice;

    public void originalProductPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        log.info("Original product list" + priceList.toString());
    }

    public void sortByPriceHightoLow() {
        log.info("Product Sort by High low price" + sortByPrice.toString());
        selectByVisibleTextFromDropDown(sortByPrice, "Price (High > Low)");
    }

    public void afterSortByPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        log.info("After sort by price" + priceList.toString());
    }

    public String verifyTheTextLaptopsAndNotebooksOnPage() {
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public void selectSortByPriceHighToLow(String options) {
        selectByVisibleTextFromDropDown(sortByPriceHighToLow, options);
        getArrayListOfProductsInChoice(arrayListOfProducts);
        log.info("select Sort By Price High To Low : " + sortByPriceHighToLow.toString());
        log.info("select Sort By Price High To Low : " + arrayListOfProducts.toString());
    }

    public String verifyProductPriceArrangeInHighToLow() {
        log.info("verify Product Price Arrange In High To Low: " + arrayListOfProducts.toString());
        return verifyTheProductArrangementInArrayList(arrayListOfProducts);
    }

    public void selectPriceHighToLow(String inputSelectPriceOrder) {
        selectByVisibleTextFromDropDown(dropDownPath, inputSelectPriceOrder);
        log.info("select Price High To Low : " + dropDownPath.toString());
    }

    public void sortByPrice(String option) {
        selectByVisibleTextFromDropDown(price, option);
        log.info("sort By Price : " + price.toString());
    }

    public void selectMacBookProduct() {
        clickOnElement(product);
        log.info("select MacBook Product : " + product.toString());

    }

    public String verifyTheTextMacBook() {
        log.info("verify The Text MacBook : " + checkTextMacBook.toString());
        return getTextFromElement(checkTextMacBook);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("click On Add To Cart : " + addToCart.toString());
    }

    public String verifySuccessMessageForAddingProductToShoppingCart() {
        log.info("verify Success Message For Adding Product To Shopping Cart : " + successMessageForAddingProduct.toString());
        return getTextFromElement(successMessageForAddingProduct);
    }

    public void clickOnLinkToShoppingCartMessage() {
        clickOnElement(linkToShoppingCartInsideMessage);
        log.info("click On Link To Shopping Cart Message : " + linkToShoppingCartInsideMessage.toString());
    }
}
