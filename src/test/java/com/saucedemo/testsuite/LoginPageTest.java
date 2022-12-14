package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedText = "PRODUCTS";
        Assert.assertEquals(productsPage.getProductsText(),expectedText,"Products text is not displayed");
    }

}
