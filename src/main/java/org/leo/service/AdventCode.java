package org.leo.service;

import java.io.*;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class AdventCode {
//    public String retrieveLeaderboard(){
//        URL url = new URL("");
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//        conn.setRequestMethod("POST");
//        String requestBody = "client_id=04bd34db-9438-42ae-9a3d-0689470cc9d2\n" +
//                "&scope=offline_access%20User.Read\n" +
//                "&refresh_token="+refreshToken+"\n"+
//                "&redirect_uri=http%3A%2F%2Flocalhost%3A7071%2Fapi%2FgetServiceUserToken\n" +
//                "&grant_type=refresh_token\n" +
//                "&client_secret=B.Z5yx11_T1OP.Rz5Dn5JcJaG~2cCqy28~";
//
//        String backendSecret = "nF7wvxp.3Vr-jST7E78~hWfpN6zQT2o0W~";
//
//        conn.setDoOutput(true);
//        try(OutputStream os = conn.getOutputStream()) {
//            byte[] input = requestBody.getBytes("utf-8");
//            os.write(input, 0, input.length);
//        }
//
//        int statusCode = conn.getResponseCode();
//
//        InputStream is = null;
//
//        if (statusCode >= 200 && statusCode < 400) {
//            // Create an InputStream in order to extract the response object
//            is = conn.getInputStream();
//        }
//        else {
//            is = conn.getErrorStream();
//        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
//        StringBuilder response = new StringBuilder();
//        String responseLine = null;
//        while ((responseLine = br.readLine()) != null) {
//            response.append(responseLine.trim());
//        }
//        System.out.println(response.toString());
//    }
}
