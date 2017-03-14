package org.automation;

import org.automation.config.PropertyLoader;

import java.io.IOException;

/**
 * Created by shantonu on 3/13/17.
 */
public class App {
    public static void initProperties(){
        try {
            PropertyLoader.loadProperties("./src/test/driver.properties");
            PropertyLoader.loadProperties("./src/test/test.properties");
            propertiesBasedOnOS();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void propertiesBasedOnOS(){
        final String os = System.getProperty("os.name");
        if (os.contains("win")) {
            System.setProperty("webdriver.firefox.bin",System.getProperty("firefox.bin.win"));
            System.setProperty("webdriver.gecko.driver", System.getProperty("firefox.driver.win"));
            System.setProperty("webdriver.chrome.bin", System.getProperty("chrome.bin.win"));
            System.setProperty("webdriver.chrome.driver", System.getProperty("chrome.driver.win"));

        }else {
            System.setProperty("webdriver.firefox.bin",System.getProperty("firefox.bin.linux"));
            System.setProperty("webdriver.gecko.driver", System.getProperty("firefox.driver.linux"));
            System.setProperty("webdriver.chrome.bin", System.getProperty("chrome.bin.linux"));
            System.setProperty("webdriver.chrome.driver", System.getProperty("chrome.driver.linux"));

        }
    }
}
