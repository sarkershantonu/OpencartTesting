package org.automation.core.validation;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.net.URL;

/**
 * Created by shantonu on 12/10/16.
 */
public class LinkValidator {
    public static boolean isValidLink(String url) throws IOException {

        return (getResponseCode(url).intValue()==200)?true:false;
    }

    public boolean isValidLink(URL url) {
        return false;
    }

    public static Integer getResponseCode(String url) throws IOException {
        //make a http request

        String chrome_user_agent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36";


        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.addHeader("User-Agent", chrome_user_agent);
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
            System.out.println(getResponseCode("https://www.google.com"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
