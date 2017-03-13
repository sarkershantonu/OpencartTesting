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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
