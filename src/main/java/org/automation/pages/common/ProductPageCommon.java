package org.automation.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 4/27/17.
 */
public class ProductPageCommon extends PageBase{

    public WebElement description_tab;
    public WebElement review_tab;
    public WebElement addToWishList;

    @FindBy(id = "button-cart")
    @CacheLookup
    private WebElement addToCart;
    public ProductPageCommon(WebDriver aDriver) {
        super(aDriver);
    }
}
