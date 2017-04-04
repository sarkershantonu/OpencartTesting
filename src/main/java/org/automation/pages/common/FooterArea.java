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

    public WebElement aboutUsLink;

    public WebElement deliveryInfoLink;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=information/information&information_id=3']")
    @CacheLookup
    public WebElement privacyPolicyLink;

    public WebElement termsAndConditionLink;
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
