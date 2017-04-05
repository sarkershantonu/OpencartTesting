package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
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
    @FindBy(id = "input-email")
    @CacheLookup
    private WebElement emailAddress;

    private void clickLoginButton() {
    }
    public LoginPage fill() {

        return this;
    }
}
