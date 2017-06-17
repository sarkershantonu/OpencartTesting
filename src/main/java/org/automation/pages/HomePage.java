package org.automation.pages;

import org.automation.core.CompletePage;
import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase implements CompletePage {
    public SearchPanel search;
    public HomePage(WebDriver aDriver) {
        super(aDriver);
        search = new SearchPanel(driver);
    }

    public HomePage open(String url){
        driver.get(url);
        return this;
    }

    public PageBase load() {
        driver.get(getUrl());
        return this;
    }
}
