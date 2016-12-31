package org.automation.core;

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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Browser {
    private static WebDriver driver = null;
    public static final long DEFAULT_WAIT_4_PAGE = 30;
    public static final long DEFAULT_WAIT_4_ELEMENT = 10;
    private static String os = System.getProperty("os.name");


    private static String chromePathLINUX="";
    private static String chromePathWIN="C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
    private static String firefoxPathLINUX= "/home/shantonu/ff46/firefox";
    private static String firefoxPathWIN="C:\\Program Files\\Mozilla Firefox\\firefox.exe";


/*// avoiding target to keep it easy to clean.
    private static String firefoxGekoDriverPathLINUX="./target/test-classes/drivers/firefox/linux64/geckodriver";
    private static String firefoxGekoDriverPathWIN="./target/test-classes/drivers/firefox/win64/geckodriver.exe";
    private static String IEServerPath = "./target/test-classes/drivers/ie32/IEDriverServer.exe";
    private static String chromeDriverPathWIN = "./target/test-classes/drivers/chrome/win32/chromedriver.exe";// can be changed for your PC
    private static String chromeDriverPathLINUX = "./target/test-classes/drivers/chrome/linux64/chromedriver";
*/
    private static String firefoxGekoDriverPathLINUX="./src/test/resources/drivers/firefox/linux64/geckodriver";
    private static String firefoxGekoDriverPathWIN="./src/test/resources/drivers/firefox/win64/geckodriver.exe";
    private static String IEServerPath = "./src/test/resources/drivers/ie64/IEDriverServer.exe";
    private static String chromeDriverPathWIN = "./src/test/resources/drivers/chrome/win32/chromedriver.exe";// can be changed for your PC
    private static String chromeDriverPathLINUX = "./src/test/resources/drivers/chrome/linux64/chromedriver";


    private static void initiDriver(){
        setImplicitWait(DEFAULT_WAIT_4_PAGE);
        setJSTimeOut(5);
        new WebDriverWait(driver,DEFAULT_WAIT_4_ELEMENT);
    }
    public static void setJSTimeOut(long sec){
        driver.manage().timeouts().setScriptTimeout(sec,TimeUnit.SECONDS);
    }
    public static void nullifyImplicitWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }
    public static void setImplicitWait(long newWaittime_InSeconds) {
        nullifyImplicitWait();
        driver.manage().timeouts().implicitlyWait(newWaittime_InSeconds, TimeUnit.SECONDS);
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
        } else if ("edge".equals(nameOfBrowser)) {
            return new EdgeDriver();
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
        driver.quit();//this is to make process of browser kill
        driver = null;// to avoid closing time of browser by JVM
    }

    private static DesiredCapabilities getLocalChrome() {
        String exeChromium = "<path to chromium>chrome.exe";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "chrome");
        cap.setCapability("binary", exeChromium);
        return cap;
    }
    public static WebDriverWait setWebDriverWait(long sec){
        WebDriverWait wait ;
        if(DEFAULT_WAIT_4_ELEMENT<sec){
            wait =  new WebDriverWait(driver, sec);
        }else
        {
            wait = new WebDriverWait(driver,DEFAULT_WAIT_4_ELEMENT);
        }
        return wait;
    }

    public static JavascriptExecutor getJSexcutor(){
        return (JavascriptExecutor)driver;
    }
}
