package org.automation.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 12/28/16.
 */
public class Menu extends PageBase {

    public Menu(WebDriver aDriver) {
        super(aDriver);
    }
    @FindBy(linkText = "See All Desktops")
    @CacheLookup
    private WebElement desktop;
    @FindBy(css = "")
    @CacheLookup
    private WebElement laptop_notebook;
    @FindBy(css = "")
    @CacheLookup
    private WebElement components;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=57']")
    @CacheLookup
    private WebElement tablets;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=17']")
    @CacheLookup
    private WebElement software;


    @FindBy(css = "")
    @CacheLookup
    private WebElement phone_pda;

    @FindBy(css = "")
    @CacheLookup
    private WebElement cameras;

    @FindBy(css = "")
    @CacheLookup
    private WebElement mp3_players;

}
