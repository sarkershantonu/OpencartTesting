package org.automation.steps.common;

import org.automation.core.PageBase;
import org.automation.pages.*;

/**
 * Created by shantonu on 3/20/17.
 */
public class FooterAreaSteps<Page extends PageBase> {

    public Page aPage;

    public FooterAreaSteps(Page aPageOf){
        aPage=aPageOf;
    }

    public PageBase click_About_Us(){
        aPage.footer.aboutUsLink.click();
        return new AboutUs(aPage.driver);

    }
    public PageBase click_Delivery_Information(){
        aPage.footer.deliveryInfoLink.click();
        return new DeliveryInformation(aPage.driver);
    }
    public PageBase click_Privacy_Policy(){
        aPage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(aPage.driver);
    }

    public PageBase click_Terms_Conditions(){
        aPage.footer.termsAndConditionLink.click();
        return new TermsAndCondition(aPage.driver);
    }

    public PageBase click_Contact_Us (){
        aPage.footer.contactUsLink.click();
        return new ContactUs(aPage.driver);
    }
    public PageBase click_Returns (){
        aPage.footer.returnsLink.click();
        return new Returns(aPage.driver);
    }

    public PageBase click_SiteMap(){
        aPage.footer.siteMapLink.click();
        return new SiteMap(aPage.driver);
    }
    public PageBase click_Brands(){
        aPage.footer.brandsLink.click();
        return new Brands(aPage.driver);
    }
    public PageBase click_Gift_Vouchers(){
        aPage.footer.giftVoucersLink.click();
        return new GiftVoucers(aPage.driver);
    }
    public PageBase click_Affiliates (){
        aPage.footer.affiliatesLink.click();
        return new Affiliates(aPage.driver);
    }
    public PageBase click_Specials (){
        aPage.footer.specialsLink.click();
        return new Specials(aPage.driver);
    }
    public PageBase click_My_Account(){
        aPage.footer.myAccountLink.click();
        return new MyAccount(aPage.driver);
    }
    public PageBase click_Order_History (){
        aPage.footer.orderHistoryLink.click();
        return new OrderHistory(aPage.driver);
    }
    public PageBase click_Wish_List(){
        aPage.footer.wishListLink.click();
        return new WishList(aPage.driver);
    }
    public PageBase click_Newsletter (){
        aPage.footer.newsLetterLink.click();
        return new NewsLetter(aPage.driver);
    }
    public String getCopyRightInfo(){
        return aPage.footer.copyright.getText();
    }

}
