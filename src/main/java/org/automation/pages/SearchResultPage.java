package org.automation.pages;

import org.automation.core.CompletePage;
import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 6/4/16.
 */
public class SearchResultPage extends PageBase implements CompletePage {
    public SearchResultPage(WebDriver aDriver) {
        super(aDriver);
    }
    @FindBy(xpath = ".//*[@id='content']/p[2]")
    public WebElement invalid_search_result_message;

    public PageBase load() {
        driver.get(getUrl());
        return this;
    }
}