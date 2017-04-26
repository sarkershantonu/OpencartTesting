package org.automation.core;

import org.openqa.selenium.Cookie;

/**
 * Created by shantonu on 4/26/17.
 */
public class CookieManager {
    private CookieManager(){}

    public static void deleteAllCookies(){
        Browser.getInstance().manage().deleteAllCookies();
    }
    public static void deleteCookie(String name){
        Browser.getInstance().manage().deleteCookieNamed(name);
    }
    public static void deleteCookie(Cookie aCookie){
        Browser.getInstance().manage().deleteCookie(aCookie);
    }
}
