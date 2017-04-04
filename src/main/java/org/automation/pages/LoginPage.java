package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shantonu on 4/3/17.
 */
public class LoginPage extends PageBase {
    public LoginPage(WebDriver aDriver) {
        super(aDriver);
    }
    public PageBase submit() {
        clickLoginButton();

        PageFactory.initElements(driver, this);
        return this;
    }

    private void clickLoginButton() {
    }
    public LoginPage fill() {

        return this;
    }
}
