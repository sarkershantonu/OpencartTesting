package org.automation.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 3/30/17.
 */
public class WebElementUtil {
    public static String getValue(WebElement element, String attribute){
        return element.getAttribute(attribute);
    }
    @FindBy(css = "a.btn.btn-primary")
    @CacheLookup
    private WebElement continue_btn;
}
