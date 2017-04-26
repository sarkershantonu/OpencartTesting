package org.automation.core.validation;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by shantonu on 12/10/16.
 */
public class LinkValidator {
    public boolean isValidLink(String url) {
        return false;
    }

    public boolean isValidLink(URL url) {
        return false;
    }

    public static Integer isActiveLink(String url) throws IOException {
        //make a http request

        String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36";


        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.addHeader("User-Agent", USER_AGENT);
        HttpResponse response = null;
        try {
            response = client.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());
*/
        /*BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
*/
        return response.getStatusLine().getStatusCode();
    }

    public static void main(String[] args) {
        try {
            System.out.println(isActiveLink("https://www.google.com"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
