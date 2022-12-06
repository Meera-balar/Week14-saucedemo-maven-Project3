package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        int expectedProducts = 6;
        System.out.println("Total Products displayed on Page : " + productsPage.getProductsDisplayedOnPage());
        Assert.assertEquals(productsPage.getProductsDisplayedOnPage(),expectedProducts,"Products not displayed accordingly");
    }
}
