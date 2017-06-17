package org.automation.core;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;


public abstract class TestCaseBase {
    protected static WebDriver browser = null;
    @BeforeClass
    public static void initBeforeTest(){

        browser = Browser.getInstance();

    }
    @AfterClass
    public static void cleanupTest(){

    }

    private void initProperty(){

    }

}
