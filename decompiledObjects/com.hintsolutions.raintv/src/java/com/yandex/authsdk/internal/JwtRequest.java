/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.HttpURLConnection
 *  java.net.URL
 */
package com.yandex.authsdk.internal;

import androidx.annotation.NonNull;
import com.yandex.authsdk.YandexAuthException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JwtRequest {
    public static final String JWT_REQUEST_URL_FORMAT = "https://login.yandex.ru/info?format=jwt&oauth_token=%s";
    public static final int RESPONSE_CODE_UNAUTHORIZED = 401;
    @NonNull
    private final String token;

    public JwtRequest(@NonNull String string2) {
        this.token = string2;
    }

    @NonNull
    private static String readToString(@NonNull InputStream inputStream) throws IOException {
        inputStream = new BufferedReader((Reader)new InputStreamReader(inputStream));
        try {
            String string2;
            Object object = new StringBuilder();
            while ((string2 = inputStream.readLine()) != null) {
                object.append(string2);
                object.append('\n');
            }
            object = object.toString();
            return object;
        }
        finally {
            inputStream.close();
        }
    }

    @NonNull
    public String get() throws IOException, YandexAuthException {
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(String.format((String)JWT_REQUEST_URL_FORMAT, (Object[])new Object[]{this.token})).openConnection();
        if (httpURLConnection.getResponseCode() != 401) {
            try {
                String string2 = JwtRequest.readToString(httpURLConnection.getInputStream());
                return string2;
            }
            finally {
                httpURLConnection.disconnect();
            }
        }
        throw new YandexAuthException("jwt.authorization.error");
    }
}

