/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  java.io.UnsupportedEncodingException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.net.URI
 *  java.security.InvalidKeyException
 *  java.security.Key
 *  java.security.NoSuchAlgorithmException
 *  java.security.SecureRandom
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.TreeMap
 *  javax.crypto.Mac
 *  javax.crypto.spec.SecretKeySpec
 *  okio.ByteString
 */
package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okio.ByteString;

class OAuth1aParameters {
    private static final SecureRandom RAND = new SecureRandom();
    private static final String SIGNATURE_METHOD = "HMAC-SHA1";
    private static final String VERSION = "1.0";
    private final TwitterAuthConfig authConfig;
    private final TwitterAuthToken authToken;
    private final String callback;
    private final String method;
    private final Map<String, String> postParams;
    private final String url;

    public OAuth1aParameters(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String string2, String string3, String string4, Map<String, String> map) {
        this.authConfig = twitterAuthConfig;
        this.authToken = twitterAuthToken;
        this.callback = string2;
        this.method = string3;
        this.url = string4;
        this.postParams = map;
    }

    private void appendParameter(StringBuilder stringBuilder, String string2, String string3) {
        if (string3 != null) {
            stringBuilder.append(' ');
            stringBuilder.append(UrlUtils.percentEncode(string2));
            stringBuilder.append("=\"");
            stringBuilder.append(UrlUtils.percentEncode(string3));
            stringBuilder.append("\",");
        }
    }

    private String getEncodedQueryParams(TreeMap<String, String> iterator) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = iterator.size();
        iterator = iterator.entrySet().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            int n3;
            Map.Entry entry = (Map.Entry)iterator.next();
            stringBuilder.append(UrlUtils.percentEncode(UrlUtils.percentEncode((String)entry.getKey())));
            stringBuilder.append("%3D");
            stringBuilder.append(UrlUtils.percentEncode(UrlUtils.percentEncode((String)entry.getValue())));
            n2 = n3 = n2 + 1;
            if (n3 >= n) continue;
            stringBuilder.append("%26");
            n2 = n3;
        }
        return stringBuilder.toString();
    }

    private String getNonce() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf((long)System.nanoTime()));
        stringBuilder.append(String.valueOf((long)Math.abs((long)RAND.nextLong())));
        return stringBuilder.toString();
    }

    private String getSigningKey() {
        Object object = this.authToken;
        object = object != null ? object.secret : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(UrlUtils.urlEncode(this.authConfig.getConsumerSecret()));
        stringBuilder.append('&');
        stringBuilder.append(UrlUtils.urlEncode((String)object));
        return stringBuilder.toString();
    }

    private String getTimestamp() {
        return Long.toString((long)(System.currentTimeMillis() / 1000L));
    }

    public String calculateSignature(String object) {
        try {
            String string2 = this.getSigningKey();
            object = object.getBytes("UTF8");
            Object object2 = string2.getBytes("UTF8");
            string2 = new SecretKeySpec(object2, "HmacSHA1");
            object2 = Mac.getInstance((String)"HmacSHA1");
            object2.init((Key)string2);
            object = object2.doFinal((byte[])object);
            object = ByteString.of((byte[])object, (int)0, (int)((Object)object).length).base64();
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            Twitter.getLogger().e("Twitter", "Failed to calculate signature", unsupportedEncodingException);
            return "";
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            Twitter.getLogger().e("Twitter", "Failed to calculate signature", noSuchAlgorithmException);
            return "";
        }
        catch (InvalidKeyException invalidKeyException) {
            Twitter.getLogger().e("Twitter", "Failed to calculate signature", invalidKeyException);
            return "";
        }
    }

    public String constructAuthorizationHeader(String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder("OAuth");
        this.appendParameter(stringBuilder, "oauth_callback", this.callback);
        this.appendParameter(stringBuilder, "oauth_consumer_key", this.authConfig.getConsumerKey());
        this.appendParameter(stringBuilder, "oauth_nonce", string2);
        this.appendParameter(stringBuilder, "oauth_signature", string4);
        this.appendParameter(stringBuilder, "oauth_signature_method", SIGNATURE_METHOD);
        this.appendParameter(stringBuilder, "oauth_timestamp", string3);
        string2 = this.authToken;
        string2 = string2 != null ? ((TwitterAuthToken)string2).token : null;
        this.appendParameter(stringBuilder, "oauth_token", string2);
        this.appendParameter(stringBuilder, "oauth_version", VERSION);
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    public String constructSignatureBase(String string2, String string3) {
        URI uRI = URI.create((String)this.url);
        TreeMap<String, String> treeMap = UrlUtils.getQueryParams(uRI, true);
        Object object = this.postParams;
        if (object != null) {
            treeMap.putAll(object);
        }
        if ((object = this.callback) != null) {
            treeMap.put((Object)"oauth_callback", object);
        }
        treeMap.put((Object)"oauth_consumer_key", (Object)this.authConfig.getConsumerKey());
        treeMap.put((Object)"oauth_nonce", (Object)string2);
        treeMap.put((Object)"oauth_signature_method", (Object)SIGNATURE_METHOD);
        treeMap.put((Object)"oauth_timestamp", (Object)string3);
        string2 = this.authToken;
        if (string2 != null && (string2 = ((TwitterAuthToken)string2).token) != null) {
            treeMap.put((Object)"oauth_token", (Object)string2);
        }
        treeMap.put((Object)"oauth_version", (Object)VERSION);
        string2 = new StringBuilder();
        string2.append(uRI.getScheme());
        string2.append("://");
        string2.append(uRI.getHost());
        string2.append(uRI.getPath());
        string2 = string2.toString();
        string3 = new StringBuilder();
        string3.append(this.method.toUpperCase(Locale.ENGLISH));
        string3.append('&');
        string3.append(UrlUtils.percentEncode(string2));
        string3.append('&');
        string3.append(this.getEncodedQueryParams(treeMap));
        return string3.toString();
    }

    public String getAuthorizationHeader() {
        String string2 = this.getNonce();
        String string3 = this.getTimestamp();
        return this.constructAuthorizationHeader(string2, string3, this.calculateSignature(this.constructSignatureBase(string2, string3)));
    }
}

