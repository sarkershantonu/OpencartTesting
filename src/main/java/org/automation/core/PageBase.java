package org.automation.core;

import org.automation.pages.common.FooterArea;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private  String url;
    public WebDriver driver;
    public FooterArea footer;

    private PageBase(){

    }
    public PageBase(WebDriver aDriver){
        this.driver =aDriver;
        initElement(this);
        //init footer
    }
    public <T extends PageBase> void initElement(T t){
        PageFactory.initElements(driver,t);
    }


    public String getTitle() {
        try {
           Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.getTitle();
    }

    protected WebElement click(WebElement element){
        element.click();
        return element;
    }
    protected WebElement type(WebElement element, String text){
        element.click();
        element.clear();
        element.sendKeys(text);

        return element;
    }
    protected void clickByJS(){

    }
    private void initFooter(){
        PageFactory.initElements(driver, FooterArea.class);
    }
}
