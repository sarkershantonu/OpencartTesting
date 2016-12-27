package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by shantonu on 12/14/16.
 */
public class ProductPage extends PageBase {
    public ProductPage(WebDriver aDriver) {
        super(aDriver);
    }

    @FindBy(how=How.LINK_TEXT, linkText = "Description")
    public WebElement description_link;
}
