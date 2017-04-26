package org.automation.core.validation;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

/**
 * Created by shantonu on 4/26/17.
 */
public class CookieValidator {
    private WebDriver driver;

    private CookieValidator() {
    }

    public CookieValidator(WebDriver aDriver) {
        driver = aDriver;
    }

    public boolean isCookiePresent(String name, String value) {
        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie aCookie : cookies) {
            Cookie coo = new Cookie(name,value);
            if(cookeMatcher(aCookie,coo)){
                return true;
            }
        }
        return false;


    }

    public boolean isCookiePresent(Cookie cookie) {
        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie aCookie : cookies) {
            if(cookeMatcher(aCookie,cookie)){
                return true;
            }
        }
        return false;
    }
    public boolean cookeMatcher(Cookie a, Cookie b){
        if(a.getDomain().equals(b.getDomain())){
            if(a.getName().equals(b.getName())){
                if(a.getValue().equals(b.getValue())){
                    return true;
                }
            }
        }
        return false;
    }

}
