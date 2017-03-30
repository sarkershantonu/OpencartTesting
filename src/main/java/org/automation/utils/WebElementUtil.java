package org.automation.utils;

import org.openqa.selenium.WebElement;

/**
 * Created by shantonu on 3/30/17.
 */
public class WebElementUtil {
    public static String getValue(WebElement element, String attribute){
        return element.getAttribute(attribute);
    }
}
