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
    @FindBy(css = "a[href='#tab-description']")
    @CacheLookup
    public WebElement description_tab;
    @FindBy(css = "a[href='#tab-review']")
    @CacheLookup
    public WebElement review_tab;

    public WebElement addToWishList;

    @FindBy(id = "button-cart")
    @CacheLookup
    private WebElement addToCart;
    public ProductPageCommon(WebDriver aDriver) {
        super(aDriver);
    }

    public void compareThis(){
        //its a java script event, so we need to call with product identifier
    }
}
