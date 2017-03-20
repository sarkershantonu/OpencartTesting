package org.automation.steps;

import org.automation.core.Browser;
import org.automation.core.PageBase;
import org.automation.pages.*;

/**
 * Created by shantonu on 5/5/16.
 * this is whole TODo list for home page
 */
public class HomePageSteps {

    private HomePage homePage;

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

    public PageBase click_Returns (){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }

    public PageBase click_SiteMap(){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }
    public PageBase click_Brands(){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }
    public PageBase click_Gift_Vouchers(){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }
    public PageBase click_Affiliates (){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }
    public PageBase click_Specials (){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }
    public PageBase click_My_Account(){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }
    public PageBase click_Order_History (){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }
    public PageBase click_Wish_List(){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }
    public PageBase click_Newsletter (){
        homePage.footer.privacyPolicyLink.click();
        return new PrivacyPolicy(homePage.driver);
    }


}
