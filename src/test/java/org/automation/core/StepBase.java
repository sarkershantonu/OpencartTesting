package org.automation.core;

import cucumber.api.java.en.Given;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 3/16/17.
 * Base file for cucumber steps
 */
public abstract class StepBase {

    protected WebDriver driver;

    public StepBase(){

    }
    @Given("^I open (.+) browser$")
    public void i_open_browser(String nameOfBrowser) throws Throwable {
        driver = Browser.getInstance(nameOfBrowser);
    }


}
