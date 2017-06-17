package org.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


// this will be on the fly item creation.. so all item will be dynamic.. need to make a dom parser.

/**
 * Added locators by Jyoti on 29/01/2017
 */
public class ProductPreviewPage {
    public WebElement tile;
    public WebElement description;
    public WebElement price;
    public WebElement tax;

    @FindBy(xpath = ".//*[@id='content']/div[1]/div[1]/ul[1]/li[1]/a/img")
    public WebElement compareProductLink;

    @FindBy(xpath = ".//*[@id='content']/div[1]/div[1]/ul[1]/li[1]/a/img")
    public WebElement imageOfProduct;

    @FindBy(xpath = ".//*[@id='content']/div[1]/div[2]/h1")
    public WebElement title_text;

    @FindBy(xpath = ".//*[@id='button-cart']")
    public WebElement addToCart_button;

    @FindBy(xpath = ".//*[@id='content']/div[1]/div[2]/div[1]/button[1]")
    public WebElement wishList_button;


}
