package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by shantonu on 12/14/16.
 * Contributors will add all items
 * todo :
 * See http://demo.opencart.com/index.php?route=product/product&path=20&product_id=42
 * Fillup all findby in all web elements
 * parse the source and get those links
 * complete the write a review function.
 */
public class ProductPage_AppleCinema extends PageBase {
    public ProductPage_AppleCinema(WebDriver aDriver) {
        super(aDriver);
    }

    @FindBy(how = How.LINK_TEXT, linkText = "Description")
    public WebElement description_link;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='tab-description']/p[1]/font/font[1]")
    public WebElement description_body;

    @FindBy(how = How.LINK_TEXT, linkText = "Specification")
    public WebElement specification_link;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='tab-specification']/table/tbody/tr/td[2]")
    public WebElement specification_body;//choose item to validate

    @FindBy(how = How.XPATH, xpath = ".//*[@id='content']/div[1]/div[1]/ul[2]/li[3]/a")
    public WebElement review_link;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='content']/div[2]/div[1]/div/div[3]/button[2]")
    public WebElement wishList_link;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='content']/div[2]/div[1]/div/div[3]/button[3]")
    public WebElement compare_link;

    @FindBy(how = How.LINK_TEXT, linkText = "Apple")
    public WebElement brand_link;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[1]/li[4]")
    public WebElement avaiability_text;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[1]/li[2]")
    public WebElement productCode_text;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/h1")
    public WebElement productTitle_text;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[2]/li[2]/h2")
    public WebElement productPrice;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[2]/li[3]")
    public WebElement productTax;

    @FindBy(how = How.LINK_TEXT, linkText = "Add to Cart")
    public WebElement addToCart_button;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-quantity']")
    public WebElement quantity_textbox;

    @FindBy(how = How.XPATH, xpath = "")
    public WebElement continue_review_button; // can't understand which one

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option218']/div[1]/label/input")
    public WebElement options_radio_small;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option218']/div[2]/label/input")
    public WebElement options_radio_medium;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option218']/div[3]/label/input")
    public WebElement options_radio_large;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option223']/div[1]/label/input")
    public WebElement options_checkboxes_1;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option223']/div[2]/label/input")
    public WebElement options_checkboxes_2;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option223']/div[3]/label/input")
    public WebElement options_checkboxes_3;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option223']/div[4]/label/input")
    public WebElement options_checkboxes_4;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option208']")
    public WebElement option_text;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option217']")
    public WebElement select_dropdown;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='input-option209']")
    public WebElement text_area;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='button-upload222']")
    public WebElement file_upload;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='product']/div[7]/div/span/button")
    public WebElement date_picker;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='product']/div[8]/div/span/button")
    public WebElement time_picker;

    @FindBy(how = How.XPATH, xpath = ".//*[@id='product']/div[9]/div/span/button")
    public WebElement date_time_picker;
    //todo other items from right side


    public boolean writeAReview(String name, String review, int rating){

        return false;
    }

    /**
     * This will get all image links from a loaded product which has thumbnail.
     * @return
     * todo
     */
    public String[] getAllImageLinks(){
        final String source = driver.getPageSource();
        String pattern = "class=\"thumbnail\"\\shref=\"(.+?jpg)";
        return null;
    }

}
