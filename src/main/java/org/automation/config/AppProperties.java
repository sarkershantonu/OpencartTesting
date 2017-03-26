package org.automation.config;

import java.text.SimpleDateFormat;

/**
 * Created by shantonu on 3/14/17.
 */
public class AppProperties {

    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat timeFormat = new SimpleDateFormat("kmmss");

    // property screenshot.folder
    // todo read form property
    public static final String screenshotImagerFolder = "/screenshot";
    public static final String loggingFolder = "/Logs";
    public static final String screenshotType = ".png";

    //todo for setting all proerties

    public static final long DEFAULT_WAIT_4_PAGE = 30;
    public static final long DEFAULT_WAIT_4_ELEMENT = 10;
}
