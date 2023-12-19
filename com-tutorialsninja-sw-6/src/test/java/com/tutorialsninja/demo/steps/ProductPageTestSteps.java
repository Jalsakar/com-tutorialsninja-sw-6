package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.LaptopsAndNoteBooksPage;
import com.tutorialsninja.demo.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductPageTestSteps {
    @Then("User should navigate to the product page and see text for {string}")
    public void userShouldNavigateToTheProductPageAndSeeTextFor(String message) {
        Assert.assertEquals(new ProductPage().getTextFromProductsName(), message, "Incorrect message displayed!");

    }
    @And("User enter the Qty require as {string}")
    public void userEnterTheQtyRequireAs(String qty) {
        new ProductPage().enterQuantity(qty);
    }

    @And("User click on Add to cart button")
    public void userClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCart();

    }
    @Then("User should able to verify the message Success: You have added {string} to your shopping cart!")
    public void userShouldAbleToVerifyTheMessageSuccessYouHaveAddedToYourShoppingCart(String product) {
        String actualMessage = new LaptopsAndNoteBooksPage().verifySuccessMessageForAddingProductToShoppingCart();
        String expectedMessage = "Success: You have added " + product + " to your shopping cart!\n" + "×";
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect Message displayed!");
    }


    @And("user click on Link Shopping Cart display into success message")
    public void userClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoSuccessMessage();
    }
}
