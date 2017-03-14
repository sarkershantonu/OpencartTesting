package org.automation;

import org.automation.config.JavaProperties;
import org.automation.config.PropertyLoader;

import java.io.IOException;

/**
 * Created by shantonu on 3/13/17.
 */
public class App {
    public static void initProperties(){
        try {
            PropertyLoader.loadProperties(JavaProperties.USER_WORKING_DIR+"/src/test/resources/driver.properties");
            //PropertyLoader.loadProperties("./src/test/test.properties");
            propertiesBasedOnOS();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void propertiesBasedOnOS(){
        final String os = JavaProperties.OS_NAME;
        if (os.contains("win")) {
            System.setProperty("webdriver.firefox.bin",System.getProperty("firefox.bin.win"));
            System.setProperty("webdriver.gecko.driver", System.getProperty("firefox.driver.win"));
            System.setProperty("webdriver.chrome.bin", System.getProperty("chrome.bin.win"));
            System.setProperty("webdriver.chrome.driver", System.getProperty("chrome.driver.win"));

        }else if(os.contains("mac")){
            // i dont have mac, give me a gift and I will add here :)
        }else {
            System.setProperty("webdriver.firefox.bin",System.getProperty("firefox.bin.linux"));
            System.setProperty("webdriver.gecko.driver", System.getProperty("firefox.driver.linux"));
            System.setProperty("webdriver.chrome.bin", System.getProperty("chrome.bin.linux"));
            System.setProperty("webdriver.chrome.driver", System.getProperty("chrome.driver.linux"));

        }
    }
}
