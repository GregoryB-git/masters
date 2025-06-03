/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.Normalizer
 *  java.text.Normalizer$Form
 */
package com.twitter.sdk.android.core.internal;

import android.net.Uri;
import android.os.Build;
import java.text.Normalizer;

public class TwitterApi {
    public static final String BASE_HOST = "api.twitter.com";
    public static final String BASE_HOST_URL = "https://api.twitter.com";
    private final String baseHostUrl;

    public TwitterApi() {
        this(BASE_HOST_URL);
    }

    public TwitterApi(String string2) {
        this.baseHostUrl = string2;
    }

    public static String buildUserAgent(String string2, String string3) {
        string2 = new StringBuilder(string2);
        string2.append('/');
        string2.append(string3);
        string2.append(' ');
        string3 = Build.MODEL;
        string2.append(string3);
        string2.append('/');
        string2.append(Build.VERSION.RELEASE);
        string2.append(" (");
        string2.append(Build.MANUFACTURER);
        string2.append(';');
        string2.append(string3);
        string2.append(';');
        string2.append(Build.BRAND);
        string2.append(';');
        string2.append(Build.PRODUCT);
        string2.append(')');
        return TwitterApi.normalizeString(string2.toString());
    }

    public static String normalizeString(String string2) {
        return TwitterApi.stripNonAscii(Normalizer.normalize((CharSequence)string2, (Normalizer.Form)Normalizer.Form.NFD));
    }

    public static String stripNonAscii(String string2) {
        StringBuilder stringBuilder = new StringBuilder(string2.length());
        for (int i = 0; i < string2.length(); ++i) {
            char c = string2.charAt(i);
            if (c <= '\u001f' || c >= '\u007f') continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public Uri.Builder buildUponBaseHostUrl(String ... stringArray) {
        Uri.Builder builder = Uri.parse((String)this.getBaseHostUrl()).buildUpon();
        if (stringArray != null) {
            int n = stringArray.length;
            for (int i = 0; i < n; ++i) {
                builder.appendPath(stringArray[i]);
            }
        }
        return builder;
    }

    public String getBaseHostUrl() {
        return this.baseHostUrl;
    }
}

