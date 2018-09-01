package org.automation.core;

import org.automation.config.PropertyLoader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 12/10/16.
 */
public abstract class TestBase {
    protected static WebDriver browser = null;
    @BeforeClass
    public static void initBeforeTest(){
        PropertyLoader.initProperties();
        browser = Browser.getInstance();
    }
    @AfterClass
    public static void cleanupTest(){
        browser.quit();
    }

    public TestBase(){
        PropertyLoader.initProperties();
    }
    private void initProperty(){

    }

}
