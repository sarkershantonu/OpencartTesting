package org.automation.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by shantonu on 12/14/16.
 * todo => get all the link locators
 */

/**
 * Added all link locators by Jyoti on 25/01/2017
 */

public class HeaderArea extends PageBase {

    @FindBy(how= How.LINK_TEXT, linkText = "Checkout")
    public WebElement checkoutLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Shopping Cart")
    public WebElement shoppingCartLink;
    @FindBy(how= How.XPATH, xpath = ".//*[@id='wishlist-total']/span")
    public WebElement wishList;
    @FindBy(how= How.LINK_TEXT, linkText = "Site Map")
    public WebElement siteMapLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Brands")
    public WebElement brandsLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Gift Vouchers")
    public WebElement giftVoucersLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Affiliates")
    public WebElement affiliatesLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Specials")
    public WebElement specialsLink;
    @FindBy(how= How.LINK_TEXT, linkText = "My Account")
    public WebElement myAccountLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Order History")
    public WebElement OrderHistoryLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Wish List")
    public WebElement wishListLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Newsletter")
    public WebElement newsLetterLink;


    public HeaderArea(WebDriver aDriver) {
        super(aDriver);
    }
}
