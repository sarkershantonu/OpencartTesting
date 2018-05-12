package org.automation.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 3/12/17.
 */
public class PropertyLoader {
    public static void loadProperties(String path) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(new File(path)));
        for(String k:p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }
    public static void initProperties(){
        try {
            PropertyLoader.loadProperties("./properties/driver.properties");
            PropertyLoader.loadProperties("./properties/log4j.properties");
            PropertyLoader.loadProperties("./properties/test.properties");
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
            // i dont have mac, give me a MAC as gift and I will add here :)
        }else {
            System.setProperty("webdriver.firefox.bin",System.getProperty("firefox.bin.linux"));
            System.setProperty("webdriver.gecko.driver", System.getProperty("firefox.driver.linux"));
            System.setProperty("webdriver.chrome.bin", System.getProperty("chrome.bin.linux"));
            System.setProperty("webdriver.chrome.driver", System.getProperty("chrome.driver.linux"));

        }
    }
}
