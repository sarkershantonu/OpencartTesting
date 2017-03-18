package org.automation.core;

import org.automation.App;
import org.automation.config.AppProperties;
import org.automation.config.JavaProperties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.SystemClock;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Browser {
    static {
        App.initProperties();
    }

    private static WebDriver driver = null;


    private static void initiDriver() {
        setImplicitWait(AppProperties.DEFAULT_WAIT_4_PAGE);
        setJSTimeOut(5);
        new WebDriverWait(driver, AppProperties.DEFAULT_WAIT_4_ELEMENT);
    }

    public static void setJSTimeOut(long sec) {
        driver.manage().timeouts().setScriptTimeout(sec, TimeUnit.SECONDS);
    }

    public static void nullifyImplicitWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public static void setImplicitWait(long newWaittime_InSeconds) {
        nullifyImplicitWait();
        driver.manage().timeouts().implicitlyWait(newWaittime_InSeconds, TimeUnit.SECONDS);
    }

    public static void resetImplicitWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = getABrowser("chrome");
        }
        return driver;
    }

    public static WebDriver getInstance(String browserName) {
        if (driver == null) {
            driver = getABrowser(browserName);
            initiDriver();
        }
        return driver;
    }

    private Browser() {
    }

    private static WebDriver getABrowser(String nameOfBrowser) {
        System.out.println("OS>>>" + JavaProperties.OS_NAME);
        if ("firefox".equals(nameOfBrowser)) {
            return new FirefoxDriver();
        } else if ("ie".equals(nameOfBrowser)) {
            return new InternetExplorerDriver();
        } else {
            ChromeDriverService service;

            service = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File(System.getProperty("webdriver.chrome.driver")))
                    .usingAnyFreePort()
                    .build();
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
        ChromeOptions options = new ChromeOptions();
        options.setBinary(System.getProperty("webdriver.chrome.bin"));
        return options;
    }

    public static void close() {
        driver.close();
        driver.quit();//this is to make process of browser kill
        driver = null;// to avoid closing time of browser by JVM
    }

    private static DesiredCapabilities getLocalChrome() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "chrome");
        cap.setCapability("binary", System.getProperty("webdriver.chrome.bin"));
        return cap;
    }

    public static WebDriverWait setWebDriverWait(long sec) {
        WebDriverWait wait;
        if (AppProperties.DEFAULT_WAIT_4_ELEMENT < sec) {
            wait = new WebDriverWait(driver, sec);
        } else {
            wait = new WebDriverWait(driver, AppProperties.DEFAULT_WAIT_4_ELEMENT);
        }
        return wait;
    }
    public static JavascriptExecutor getJSexcutor() {
        return (JavascriptExecutor) driver;
    }
}
