package org.automation.core;

import org.automation.App;
import org.automation.config.AppProperties;
import org.automation.config.JavaProperties;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.SystemClock;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//this is browser manager

public class Browser {

    private static WebDriver driver = null;

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
            iniDefaultBrowser();
        }
        return driver;
    }


    private Browser() {
    }

    private static WebDriver initChromeHeadless() {
        System.out.println("Running Headless");
        List<String> arguments = new ArrayList<String>();
        arguments.add("--headless");
        arguments.add("--remote-debugging-port=9222");
        arguments.add("--disable-gpu");
        //arguments.add("--https://www.facebook.com");
        //'--user-data-dir=$home/.headless_ch/userdata'
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
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.setBinary(System.getProperty("chrome.bin.linux"));
        //options.setBinary(System.getProperty("chrome.headless.linux"));
        options.addArguments(arguments);

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        // return new ChromeDriver(getLocalChromeOptions()); // => this is chrome driver with custom options
        driver = new RemoteWebDriver(service.getUrl(), capabilities);
        return driver;
    }

    private static WebDriver initChrome() {
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
        driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        return driver;
    }

    private static WebDriver initChrome2() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        driver = new ChromeDriver(capabilities);
        return driver;
    }

    private static WebDriver initFirefox() {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);

        driver = new FirefoxDriver(capabilities);
        return driver;
    }

    private static WebDriver initIE() {

        driver = new InternetExplorerDriver();
        return driver;
    }

    private static WebDriver initEdge() {
        driver = new EdgeDriver();
        return driver;
    }

    private static void cleanCookieCache() {
        driver.manage().getCookies().clear();
        driver.manage().deleteAllCookies();
    }

    public static WebDriver getABrowser(final String browserName) {
        if ("firefox".equals(browserName)) {
            initFirefox();
        } else if ("edge".equals(browserName)) {
            initEdge();
        } else if ("ie".equals(browserName)) {
            initIE();
        } else if ("chrome".equals(browserName)) {
            initChrome();
        } else if ("headless".equals(browserName)) {
            initChromeHeadless();
        } else {
            iniDefaultBrowser();
        }
        // initDriver();
        return driver;
    }

    private static void iniDefaultBrowser() {
        final String browserName = System.getProperty("browser.default");

        if ("firefox".equals(browserName)) {
            initFirefox();
        }
        if ("ie".equals(browserName)) {
            initIE();
        }
        if ("chrome".equals(browserName)) {
            initChrome();
        }
    }

    public static void initDriver() {
        Integer x = Integer.valueOf(System.getProperty("browser.width"));
        Integer y = Integer.valueOf(System.getProperty("browser.height"));
        setImplicitWait(AppProperties.DEFAULT_WAIT_4_PAGE);
        driver.manage().window().setSize(new Dimension(x, y));
        setImplicitWait(30);
        setJSTimeOut(5);
        new WebDriverWait(driver, AppProperties.DEFAULT_WAIT_4_ELEMENT);
        cleanCookieCache();
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


    public static WebDriverWait setWebDriverWait(long sec) {
        WebDriverWait wait;
        if (AppProperties.DEFAULT_WAIT_4_ELEMENT < sec) {
            wait = new WebDriverWait(driver, sec);
        } else {
            wait = new WebDriverWait(driver, AppProperties.DEFAULT_WAIT_4_ELEMENT);
        }
        return wait;
    }

    public static JavascriptExecutor getJSExcutor() {
        return (JavascriptExecutor) driver;
    }
}
