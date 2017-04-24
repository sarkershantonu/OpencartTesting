package org.automation.tests;

import org.automation.core.StepBase;
import org.automation.core.TestBase;
import org.automation.core.validation.PageValidator;
import org.automation.pages.HomePage;
import org.automation.steps.common.FooterAreaSteps;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shantonu on 4/23/17.
 */
public class ValidateAllLinks extends TestBase {

    @Test
    public void validateAllFooterLinks() {
        HomePage homePage = new HomePage(browser);
        FooterAreaSteps footerAreaSteps = new FooterAreaSteps(homePage);

       Assert.assertTrue(PageValidator.validatePageIsLoaded(footerAreaSteps.click_About_Us(),""));//title should be added


    }

}
