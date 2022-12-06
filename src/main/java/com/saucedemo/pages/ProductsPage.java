package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class ProductsPage extends Utility {

    By productText = By.xpath("//span[contains(text(),'Products')]");
    By totalProductsOnPage = By.xpath("//div[@class='inventory_item_name']");
    public String getProductsText(){
        return getTextFromElement(productText);

    }
    public int getProductsDisplayedOnPage(){
        return sizeOfElement(totalProductsOnPage);

    }
}
