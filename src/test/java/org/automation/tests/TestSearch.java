package org.automation.tests;

import org.automation.config.PropertyLoader;
import org.automation.core.Browser;
import org.automation.core.TestBase;
import org.junit.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 12/10/16.
 */
public class TestSearch  {
    protected static WebDriver browser = null;
    @BeforeClass
    public static void initBeforeTest(){
        PropertyLoader.initProperties();
        browser = Browser.getInstance();
    }
    @Before
    public void init(){
        browser = Browser.getInstance();
    }
    @After
    public void cleanupTest(){
        browser.quit();
    }

    @Test
    public void testChromeExit(){
        browser.get("https://shantonusarker.blogspot.com");
        Assert.assertEquals("A Test Developer's blog",browser.getTitle());
    }
}
