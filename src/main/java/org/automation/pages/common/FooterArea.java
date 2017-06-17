package org.automation.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * todo, all element locators
 */

/**
 * Added all element locators by Jyoti 25/01/2017
 */
public class FooterArea extends PageBase {

    public FooterArea(WebDriver aDriver) {
        super(aDriver);
    }
    @FindBy(how= How.LINK_TEXT, linkText = "About Us")
    public WebElement aboutUsLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Delivery Information")
    public WebElement deliveryInfoLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Privacy Policy")
    public WebElement privacyPolicyLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Terms & Conditions")
    public WebElement termsAndConditionLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Contact Us")
    public WebElement contactUsLink;
    @FindBy(how= How.LINK_TEXT, linkText = "Returns")
    public WebElement returnssLink;
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
    @FindBy(how= How.XPATH, xpath = ".//p[contains(text(), 'Powered By')]")
    public WebElement copyright;

}
