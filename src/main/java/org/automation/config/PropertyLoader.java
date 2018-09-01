package org.automation.config;

import org.openqa.selenium.Platform;

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
                if(JavaProperties.OS_NAME.contains("Windows")){
                    loadProperties("./properties/webdriver.win.properties");
                }else if(JavaProperties.OS_NAME.contains("mac")){
                    loadProperties("./properties/webdriver.mac.properties");
                }else if(JavaProperties.OS_NAME.contains("linux")){
                    loadProperties("./properties/webdriver.linux.properties");
                }else {
                    throw new RuntimeException("NO SUITABLE OS");
                }

            } else if ("remote".equals(System.getProperty("test.execution"))) {
                loadProperties("./properties/webdriver.remote.properties");
            } else {
                System.out.println("Execution Property(test.execution) not added @ test.properties = ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
