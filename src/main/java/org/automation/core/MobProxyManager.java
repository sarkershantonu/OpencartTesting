package org.automation.core;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;

/**
 * Created by shantonu on 4/27/17.
 */
public class MobProxyManager {

    private MobProxyManager(){}

    public static void startProxy(int port){
        BrowserMobProxy proxy_local = new BrowserMobProxyServer();
        proxy_local.start(port);
    }

    public static void main(String[] args) {
        startProxy(9600);

    }

}
