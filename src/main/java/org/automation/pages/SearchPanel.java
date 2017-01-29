package org.automation.pages;


import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 5/17/16.
 * todo item added for all locators
 */

/**
 * Added locators by Jyoti on 29/01/2017
 */

public class SearchPanel extends PageBase {

    @FindBy(xpath = "//div[@id='search']/input")
    public WebElement textBox ;

    @FindBy(xpath = "//div[@id='search']/span/button")//property loading or after parsing or static
    public WebElement button;

    public SearchPanel(WebDriver aDriver) {
        super(aDriver);
    }


    @FindBy(xpath = ".//*[@id='content']/h1")
    public WebElement searchResult_text;

    @FindBy(xpath = ".//*[@id='content']/label")
    public WebElement searchCriteria_text;

    @FindBy(xpath = ".//*[@id='input-search']")
    public WebElement searchKeywordTextBox;

    @FindBy(xpath = ".//*[@id='content']/div[2]/div[2]/select")
    public WebElement categoryCombo;

    @FindBy(xpath = ".//*[@id='content']/div[2]/div[3]/label/input")
    public WebElement searchInSub_checkBox;

    @FindBy(xpath = ".//*[@id='description']")
    public WebElement searchInDescription_checkBox;

    @FindBy(xpath = ".//*[@id='button-search']")
    public WebElement searchButton;

    @FindBy(xpath = ".//*[@id='content']/h2")
    public WebElement searchResult_title_text;

    @FindBy(xpath = ".//*[@id='content']/div[3]/div[2]/label")
    public WebElement sortBy_text;

    @FindBy(xpath = ".//*[@id='input-sort']")
    public WebElement sortByCombo;

    @FindBy(xpath = ".//*[@id='content']/div[3]/div[4]/label")
    public WebElement show_text;

    @FindBy(xpath = ".//*[@id='input-limit']")
    public WebElement showCombo;

    @FindBy(xpath = ".//*[@id='compare-total']")
    public WebElement productCompare_text;

    @FindBy(xpath = ".//*[@id='grid-view']")
    public WebElement productThumbnailButton_grid;

    @FindBy(xpath = ".//*[@id='list-view']")
    public WebElement getProductThumbnailButton_list;

    @FindBy(xpath = ".//*[@id='content']/div[4]/div[2]/div/div[1]/a/img")
    public WebElement resultThumbnail_2;

    @FindBy(xpath = ".//*[@id='content']/div[4]/div[3]/div/div[1]/a/img")
    public WebElement resultThumbnail_3;

    @FindBy(xpath = ".//*[@id='content']/div[4]/div[4]/div/div[1]/a/img")
    public WebElement resultThumbnail_4;

    @FindBy(xpath = ".//*[@id='content']/div[4]/div[1]/div/div[1]/a/img")
    public WebElement resultThumbnail_1;

}
