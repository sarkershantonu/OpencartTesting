package org.automation.core.validation;


import org.automation.core.PageBase;
import org.junit.Assert;

/**
 * Created by shantonu on 4/23/17.
 */
public class PageValidator {

    public static <T extends PageBase>boolean validatePageIsLoaded(T aPage, String expectedTitle){
        try{
            Assert.assertEquals("Title are not same", expectedTitle, aPage.getTitle());
            return true;
        }catch (AssertionError e){
            return false;
        }
    }
}
