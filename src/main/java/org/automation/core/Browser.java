package org.automation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;


public class Browser {
    private static WebDriver driver = null;
    private static String os = System.getProperty("os.name");

    private static String chromeDriverPathWIN = "./target/test-classes/drivers/chrome/win32/chromedriver.exe";// can be changed for your PC
    private static String chromeDriverPathLINUX = "./target/test-classes/drivers/chrome/linux64/chromedriver";
    private static String chromePathLINUX="";
    private static String chromePathWIN="C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";

    private static String firefoxPathLINUX= "/home/shantonu/ff46/firefox";
    private static String firefoxPathWIN="C:\\Users\\ssarker\\Downloads\\FirefoxPortable64-47.0.1\\FirefoxPortable64\\FirefoxPortable.exe";
    private static String firefoxGekoDriverPathLINUX="./target/test-classes/drivers/firefox/linux64/geckodriver";
    private static String firefoxGekoDriverPathWIN="./target/test-classes/drivers/firefox/win64/geckodriver.exe";
    private static String IEServerPath = "./target/test-classes/drivers/ie86/IEDriverServer.exe";

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = getABrowser("chrome");
        }
        return driver;
    }

    public static WebDriver getInstance(String browserName) {
        if (driver == null) {
            driver = getABrowser(browserName);
        }
        return driver;
    }

    private Browser() {
    }

    private static WebDriver getABrowser(String nameOfBrowser) {

       // System.out.println("OS>>>" + os);
        if ("firefox".equals(nameOfBrowser)) {
            //running old version(46) firefox, download link => https://ftp.mozilla.org/pub/firefox/releases/46.0/linux-x86_64-EME-free/en-US/
            if (os.contains("Windows")) {
                System.setProperty("webdriver.firefox.bin", firefoxPathWIN);
                //System.setProperty("webdriver.firefox.marionette",firefoxGekoDriverPathWIN);
                // if not working
                System.setProperty("webdriver.gecko.driver", firefoxGekoDriverPathWIN);
            } else {
                System.setProperty("webdriver.gecko.driver", firefoxGekoDriverPathLINUX);
                System.setProperty("webdriver.firefox.bin",firefoxPathLINUX);
            }
           // System.out.println("PROPERTY >>> " + System.getProperty("webdriver.firefox.bin"));
            return new FirefoxDriver();
        } else if ("opera".equals(nameOfBrowser)) {
            return new OperaDriver();
        } else if ("ie".equals(nameOfBrowser)) {
            File iedriver = new File(IEServerPath);//todo for your PC
            System.setProperty("webdriver.ie.driver", iedriver.getAbsolutePath());
            //-Dwebdriver.ie.driver=physicall
            return new InternetExplorerDriver();
        } else {
            ChromeDriverService service;
            if (os.contains("Windows")) {
                System.setProperty("webdriver.chrome.driver", chromeDriverPathWIN);
                service = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File(chromeDriverPathWIN))
                        .usingAnyFreePort()
                        .build();
            } else {
                System.setProperty("webdriver.chrome.driver", chromeDriverPathLINUX);
                service = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File(chromeDriverPathLINUX))
                        .usingAnyFreePort()
                        .build();
            }
            try {
                service.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // return new ChromeDriver(getLocalChromeOptions()); // => this is chrome driver with custom options
            return new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        }
    }

    private static ChromeOptions getLocalChromeOptions() {
        String exeChromium = "<path to your chtome or chromium >chrome.exe";
        ChromeOptions options = new ChromeOptions();
        String driverLocation = null;

        if (os.contains("Windows")) {
            driverLocation = "<path to chromium driver>chromedriver.exe";//windows path
        } else {
            driverLocation = "/usr/bin/google-chrome";//linux path, default, you can change it
        }
        System.setProperty("webdriver.chrome.driver", driverLocation);
        options.setBinary(exeChromium);

        return options;
    }

    public static void close() {
        driver.close();
        driver.quit();
        driver = null;// to avoid closing time of browser by JVM
    }

    private static DesiredCapabilities getLocalChrome() {
        String exeChromium = "<path to chromium>chrome.exe";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "chrome");
        cap.setCapability("binary", exeChromium);
        return cap;
    }
}
