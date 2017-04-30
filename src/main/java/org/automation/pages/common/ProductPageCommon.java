package org.automation.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by shantonu on 4/27/17.
 */
public class ProductPageCommon extends PageBase{

    public WebElement description_tab;

    public ProductPageCommon(WebDriver aDriver) {
        super(aDriver);
    }
}
