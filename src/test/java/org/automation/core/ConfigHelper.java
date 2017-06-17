package org.automation.core;

import java.text.SimpleDateFormat;


public class ConfigHelper {
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat timeFormat = new SimpleDateFormat("kmmss");

    // property screenshot.folder
    // todo read form property
    public static final String screenshotImagerFolder = "/screenshot";
    public static final String loggingFolder = "/Logs";
    public static final String screenshotType = ".png";

}
