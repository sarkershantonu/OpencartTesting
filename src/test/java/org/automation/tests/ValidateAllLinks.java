package org.automation.tests;

import org.automation.core.StepBase;
import org.automation.core.TestBase;
import org.automation.pages.HomePage;
import org.automation.steps.common.FooterAreaSteps;
import org.junit.Assert;
import org.junit.Test;

import static org.automation.core.validation.PageValidator.validatePageIsLoaded;

/**
 * Created by shantonu on 4/23/17.
 */
public class ValidateAllLinks extends TestBase {

    @Test
    public void validateAllFooterLinks() {
        HomePage homePage = new HomePage(browser);
        FooterAreaSteps footerAreaSteps = new FooterAreaSteps(homePage);

        validatePageIsLoaded(footerAreaSteps.click_About_Us(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Delivery_Information(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Privacy_Policy(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Terms_Conditions(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Contact_Us(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Returns(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_SiteMap(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Brands(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Gift_Vouchers(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Affiliates(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Specials(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_My_Account(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Order_History(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Wish_List(), "");//title should be added
        validatePageIsLoaded(footerAreaSteps.click_Newsletter(), "");//title should be added
    }

}
