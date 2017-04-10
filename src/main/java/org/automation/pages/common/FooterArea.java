package org.automation.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 12/14/16.
 * todo, all element locators
 */
public class FooterArea extends PageBase {

    public FooterArea(WebDriver aDriver) {
        super(aDriver);
    }

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=4']")
    @CacheLookup
    public WebElement aboutUsLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=6']")
    @CacheLookup
    public WebElement deliveryInfoLink;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=3']")
    @CacheLookup
    public WebElement privacyPolicyLink;

    public WebElement termsAndConditionLink;
    @FindBy(css = ".account-login footer div.container div.row div:nth-of-type(2) ul.list-unstyled li:nth-of-type(1) a")
    @CacheLookup
    public WebElement contactUsLink;
    public WebElement returnsLink;
    public WebElement siteMapLink;
    public WebElement brandsLink;
    public WebElement giftVoucersLink;

    public WebElement affiliatesLink;
    public WebElement specialsLink;

    public WebElement myAccountLink;
    public WebElement orderHistoryLink;
    public WebElement wishListLink;
    public WebElement newsLetterLink;

    public WebElement copyright;

    //this

}
