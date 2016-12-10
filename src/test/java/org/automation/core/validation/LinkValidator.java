package org.automation.core.validation;

import java.net.URL;

/**
 * Created by shantonu on 12/10/16.
 */
public class LinkValidator {
    public boolean isValidLink(String url){
        return false;
    }
    public boolean isValidLink(URL url){
        return false;
    }

    /**
     * This will validate URL by opening the link by apache http client and get back http 200 (or any of successful) message
     * @param url
     * @return
     */
    public boolean isActiveLink(String url){
        return false;
    }
}
