package org.automation.steps;

import org.automation.core.Browser;
import org.automation.core.PageBase;
import org.automation.pages.*;
import org.automation.steps.common.FooterAreaSteps;

/**
 * Created by shantonu on 5/5/16.
 * this is whole TODo list for home page
 */
public class HomePageSteps {

    private HomePage homePage;
    public FooterAreaSteps footerAreaSteps = new FooterAreaSteps(homePage);

    public PageBase click_About_Us(){

        homePage.footer.aboutUsLink.click();
        return new AboutUs(homePage.driver);

    }
    public PageBase click_Delivery_Information(){
        homePage.footer.deliveryInfoLink.click();
        return new DeliveryInformation(homePage.driver);
    }
    public PageBase click_Privacy_Policy(){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }

    public PageBase click_Terms_Conditions(){
        homePage.footer.termsAndConditionLink.click();
        return new TermsAndCondition(homePage.driver);
    }

    public PageBase click_Contact_Us (){
        homePage.footer.contactUsLink.click();
        return new ContactUs(homePage.driver);
    }
    public PageBase click_Returns (){
        homePage.footer.returnsLink.click();
        return new Returns(homePage.driver);
    }

    public PageBase click_SiteMap(){
        homePage.footer.siteMapLink.click();
        return new SiteMap(homePage.driver);
    }
    public PageBase click_Brands(){
        homePage.footer.brandsLink.click();
        return new Brands(homePage.driver);
    }
    public PageBase click_Gift_Vouchers(){
        homePage.footer.giftVoucersLink.click();
        return new GiftVoucers(homePage.driver);
    }
    public PageBase click_Affiliates (){
        homePage.footer.affiliatesLink.click();
        return new Affiliates(homePage.driver);
    }
    public PageBase click_Specials (){
        homePage.footer.specialsLink.click();
        return new Specials(homePage.driver);
    }
    public PageBase click_My_Account(){
        homePage.footer.myAccountLink.click();
        return new MyAccount(homePage.driver);
    }
    public PageBase click_Order_History (){
        homePage.footer.orderHistoryLink.click();
        return new OrderHistory(homePage.driver);
    }
    public PageBase click_Wish_List(){
        homePage.footer.wishListLink.click();
        return new WishList(homePage.driver);
    }
    public PageBase click_Newsletter (){
        homePage.footer.newsLetterLink.click();
        return new NewsLetter(homePage.driver);
    }


}
