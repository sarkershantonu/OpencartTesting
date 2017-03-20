package org.automation.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public WebElement OrderHistoryLink;
    public WebElement wishListLink;
    public WebElement newsLetterLink;

    public WebElement copyright;

}
