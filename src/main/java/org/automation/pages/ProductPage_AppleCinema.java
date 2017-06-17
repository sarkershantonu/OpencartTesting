package org.automation.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

/**
 * Contributors will add all items
 * todo :
 * See http://demo.opencart.com/index.php?route=product/product&path=20&product_id=42
 * Fillup all findby in all web elements
 * parse the source and get those links
 * complete the write a review function.
 */

/**
 * Fillup all findby in all web elements:done by Jyoti on 6/01/2017
 * partially complete the write a review function
 */

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductPage_AppleCinema extends PageBase {
    public ProductPage_AppleCinema(WebDriver aDriver) {
        super(aDriver);
    }

    @FindBy(how=How.LINK_TEXT, linkText = "Description")
    public WebElement description_link;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='tab-description']")
    public WebElement description_body;
    @FindBy(how=How.LINK_TEXT, linkText = "Specification")
    public WebElement specification_link;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='tab-specification']/table")
    public WebElement specification_body;//choose item to validate
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[1]/ul[2]/li[3]/a")
    public WebElement review_link;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/div[1]/button[1]")
    public WebElement wishList_link;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/div[1]/button[2]")
    public WebElement compare_link;
    @FindBy(how=How.LINK_TEXT, linkText = "Apple")
    public WebElement brand_link;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[1]/li[4]")
    public WebElement availability_text;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[1]/li[2]")
    public WebElement productCode_text;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/h1")
    public WebElement productTitle_text;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[2]/li[2]/h2")
    public WebElement productPrice;
    @FindBy(how=How.XPATH, xpath = ".//*[@id='content']/div[1]/div[2]/ul[2]/li[3]")
    public WebElement productTax;
    @FindBy(how=How.ID, id = "button-cart")
    public WebElement addToCart_button;
    @FindBy(how=How.ID, id = "input-quantity")
    public WebElement quantity_textbox;
    @FindBy(how=How.ID, id = "button-review")
    public WebElement continue_review_button;

    public WebElement options_radio;

    public WebElement options_checkboxes;
    //todo other items from right side


    @FindBy(how =How.ID, id = "input-name")
    public WebElement your_name;
    @FindBy(how=How.ID, id = "input-review")
    public WebElement your_review;
    @FindAll({
            @FindBy(how = How.XPATH, xpath = ".//*[@id='tab-review']/form/div[4]/div/input[1]"),
            @FindBy(how = How.XPATH, xpath = ".//*[@id='tab-review']/form/div[4]/div/input[2]"),
            @FindBy(how = How.XPATH, xpath = ".//*[@id='tab-review']/form/div[4]/div/input[3]"),
            @FindBy(how = How.XPATH, xpath = ".//*[@id='tab-review']/form/div[4]/div/input[4]"),
            @FindBy(how = How.XPATH, xpath = ".//*[@id='tab-review']/form/div[4]/div/input[5]")
    })
    public List <WebElement> ratings;

    @FindBy(how=How.ID, id = "input-captcha")
    public WebElement captcha_input_box;
    @FindBy(how=How.ID, id = "captcha")
    public WebElement captcha_image;

    public boolean writeAReview(String name, String review, int rating){
        typeIntoTextBox(your_name,name );
        typeIntoTextBox(your_review,review);
        selectRating(ratings,rating);
        //todo captcha

        clickContinueButton();
        return false;
    }
    private void typeIntoTextBox(WebElement element ,String text){
        element.sendKeys(text);
    }
    private void selectRating(List <WebElement> ratings ,int rating){
        for (WebElement rating_count:ratings) {
            if (rating_count.equals(rating)){
                rating_count.click();
            }
        }

    }

    private void clickContinueButton(){
        continue_review_button.click();
        wait(5);
    }

    private void wait(int time_unit){
        driver.manage().timeouts().implicitlyWait(time_unit, TimeUnit.SECONDS);
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
