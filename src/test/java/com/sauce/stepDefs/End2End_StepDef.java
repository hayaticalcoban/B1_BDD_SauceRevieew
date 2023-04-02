package com.sauce.stepDefs;

import com.sauce.page.CheckOutPage;
import com.sauce.page.LoginPage;
import com.sauce.page.ProductsPage;
import com.sauce.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class End2End_StepDef {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    @When("The user enters {string} and {string}")
    public void theUserEntersAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The user should be able to login and see {string} header")
    public void theUserShouldBeAbleToLoginAndSeeHeader(String expectedText) {
        BrowserUtils.waitFor(2);
        productsPage.isDisplayedMethod();
    }


    @And("The user should be able to sort product {string}")
    public void theUserShouldBeAbleToSortProduct(String sortType) {
        productsPage.sortProduct(sortType);
    }

    @When("The user clicks the cheapest as {string} and the second costline as {string} product")
    public void theUserClicksTheCheapestAsAndTheSecondCostlineAsProduct(String cheapest, String secondCost) {
        productsPage.addProducts(cheapest);
        productsPage.addProducts(secondCost);
    }

    @And("The user opens basket")
    public void theUserOpensBasket() {
        productsPage.cartBtn.click();
    }

    @And("The user clicks on checkout button")
    public void theUserClicksOnCheckoutButton() {
        checkOutPage.checkoutBtn.click();
    }

    @And("The user enters details as {string} {string}, {string} and finish purchase")
    public void theUserEntersDetailsAsAndFinishPurchase(String firstname, String lastname, String postalCode) {
    }
}
