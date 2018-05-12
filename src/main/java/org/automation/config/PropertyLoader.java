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
        for (String k : p.stringPropertyNames()) {
            System.setProperty(k, p.getProperty(k));
        }
    }

    public static void initProperties() {
        try {
            loadProperties("./properties/test.properties");
            // loadProperties("./properties/webdriver.properties");
            loadProperties("./properties/cucumber.properties");
            if ("local".equals(System.getProperty("test.execution"))) {
                loadProperties("./properties/webdriver.local.properties");
            } else if ("remote".equals(System.getProperty("test.execution"))) {
                loadProperties("./properties/webdriver.remote.properties");
            } else {
                System.out.println("Execution Property(test.execution) not added @ test.properties = ");
            }
             propertiesBasedOnOS();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void propertiesBasedOnOS() {
        final String os = JavaProperties.OS_NAME;
        if (os.contains("Windows")) {
            System.setProperty("webdriver.firefox.bin", System.getProperty("firefox.bin.win"));
            System.setProperty("webdriver.gecko.driver", System.getProperty("firefox.driver.win"));
            System.setProperty("webdriver.chrome.bin", System.getProperty("chrome.bin.win"));
            System.setProperty("webdriver.chrome.driver", System.getProperty("chrome.driver.win"));
            System.setProperty("webdriver.ie.driver", System.getProperty("ie.driver.win"));

        } else if (os.contains("mac")) {
            System.setProperty("webdriver.firefox.bin", System.getProperty("firefox.bin.mac"));
            System.setProperty("webdriver.gecko.driver", System.getProperty("firefox.driver.mac"));
            System.setProperty("webdriver.chrome.bin", System.getProperty("chrome.bin.mac"));
            System.setProperty("webdriver.chrome.driver", System.getProperty("chrome.driver.mac"));
        } else if (os.contains("linux")) {
            System.setProperty("webdriver.firefox.bin", System.getProperty("firefox.bin.linux"));
            System.setProperty("webdriver.gecko.driver", System.getProperty("firefox.driver.linux"));
            System.setProperty("webdriver.chrome.bin", System.getProperty("chrome.bin.linux"));
            System.setProperty("webdriver.chrome.driver", System.getProperty("chrome.driver.linux"));

        } else {
          throw new RuntimeException("OS is not Listed");
        }
    }
}
