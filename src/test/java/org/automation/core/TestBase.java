package org.automation.core;

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

        browser = Browser.getInstance();

    }

    @AfterClass
    public static void cleanupTest(){

    }


}
