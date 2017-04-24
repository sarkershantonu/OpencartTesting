package org.automation.core.validation;

import org.automation.core.PageBase;

/**
 * Created by shantonu on 4/23/17.
 */
public class PageValidator {

    public static boolean validatePageIsLoaded(<? extends PageBase>){
        try{


        }catch (AssertionError e){
            return false;
        }
    }
}
