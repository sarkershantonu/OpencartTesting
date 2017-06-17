package org.automation.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by shantonu on 3/28/17.
 */
public class LocalCapabilities {
    public static DesiredCapabilities getLocalChrome() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "chrome");
        cap.setCapability("binary", System.getProperty("webdriver.chrome.bin"));
        return cap;
    }
}
