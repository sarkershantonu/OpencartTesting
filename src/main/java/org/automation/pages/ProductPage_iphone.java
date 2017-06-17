package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Contributors will add all items
 * todo :
 * See http://demo.opencart.com/index.php?route=product/product&product_id=40
 * Fillup all findby in all web elements
 * parse the source and get those links
 * complete the write a review function.
 */

/**
 * Fillup all findby in all web elements: Done by Jyoti
 */
public class ProductPage_iphone extends PageBase {
    public ProductPage_iphone(WebDriver aDriver) {
        super(aDriver);
    }

    @FindBy(how=How.LINK_TEXT, linkText = "Description")
    public WebElement description_link;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='tab-description']/p")
    public WebElement description_body;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[1]/ul[2]/li[2]/a")
    public WebElement review_link;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/div[1]/button[1]")
    public WebElement wishList_link;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/div[1]/button[2]")
    public WebElement compare_link;
    @FindBy(how=How.LINK_TEXT, linkText = "Apple")
    public WebElement brand_link;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[1]/li[3]")
    public WebElement availability_text;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[1]/li[2]")
    public WebElement productCode_text;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/h1")
    public WebElement productTitle_text;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[2]/li[1]/h2")
    public WebElement productPrice;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[2]/li[2]")
    public WebElement productTax;
    @FindBy(how=How.ID, id = "button-cart")
    public WebElement addToCart_button;
    @FindBy(how=How.ID, id = "input-quantity")
    public WebElement quantity_text_box;
    @FindBy(how=How.ID, id = "button-review")
    public WebElement continue_review_button;

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
