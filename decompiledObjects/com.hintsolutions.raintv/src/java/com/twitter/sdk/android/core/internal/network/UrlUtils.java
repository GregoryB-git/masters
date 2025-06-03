/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URI
 *  java.net.URLDecoder
 *  java.net.URLEncoder
 *  java.util.TreeMap
 */
package com.twitter.sdk.android.core.internal.network;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

public final class UrlUtils {
    public static final String UTF8 = "UTF8";

    private UrlUtils() {
    }

    public static TreeMap<String, String> getQueryParams(String stringArray, boolean bl) {
        TreeMap treeMap = new TreeMap();
        if (stringArray == null) {
            return treeMap;
        }
        stringArray = stringArray.split("&");
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String[] stringArray2 = stringArray[i].split("=");
            if (stringArray2.length == 2) {
                if (bl) {
                    treeMap.put((Object)UrlUtils.urlDecode(stringArray2[0]), (Object)UrlUtils.urlDecode(stringArray2[1]));
                    continue;
                }
                treeMap.put((Object)stringArray2[0], (Object)stringArray2[1]);
                continue;
            }
            if (TextUtils.isEmpty((CharSequence)stringArray2[0])) continue;
            if (bl) {
                treeMap.put((Object)UrlUtils.urlDecode(stringArray2[0]), (Object)"");
                continue;
            }
            treeMap.put((Object)stringArray2[0], (Object)"");
        }
        return treeMap;
    }

    public static TreeMap<String, String> getQueryParams(URI uRI, boolean bl) {
        return UrlUtils.getQueryParams(uRI.getRawQuery(), bl);
    }

    public static String percentEncode(String string2) {
        if (string2 == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        string2 = UrlUtils.urlEncode(string2);
        int n = string2.length();
        for (int i = 0; i < n; ++i) {
            int n2;
            char c = string2.charAt(i);
            if (c == '*') {
                stringBuilder.append("%2A");
                continue;
            }
            if (c == '+') {
                stringBuilder.append("%20");
                continue;
            }
            if (c == '%' && (n2 = i + 2) < n && string2.charAt(i + 1) == '7' && string2.charAt(n2) == 'E') {
                stringBuilder.append('~');
                i = n2;
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static String urlDecode(String string2) {
        if (string2 == null) {
            return "";
        }
        try {
            string2 = URLDecoder.decode((String)string2, (String)UTF8);
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException.getMessage(), (Throwable)unsupportedEncodingException);
        }
    }

    public static String urlEncode(String string2) {
        if (string2 == null) {
            return "";
        }
        try {
            string2 = URLEncoder.encode((String)string2, (String)UTF8);
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException.getMessage(), (Throwable)unsupportedEncodingException);
        }
    }
}

