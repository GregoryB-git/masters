/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aParameters;
import java.util.HashMap;
import java.util.Map;

public class OAuth1aHeaders {
    public static final String HEADER_AUTH_CREDENTIALS = "X-Verify-Credentials-Authorization";
    public static final String HEADER_AUTH_SERVICE_PROVIDER = "X-Auth-Service-Provider";

    public String getAuthorizationHeader(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String string2, String string3, String string4, Map<String, String> map) {
        return this.getOAuth1aParameters(twitterAuthConfig, twitterAuthToken, string2, string3, string4, map).getAuthorizationHeader();
    }

    public OAuth1aParameters getOAuth1aParameters(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String string2, String string3, String string4, Map<String, String> map) {
        return new OAuth1aParameters(twitterAuthConfig, twitterAuthToken, string2, string3, string4, map);
    }

    public Map<String, String> getOAuthEchoHeaders(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String string2, String string3, String string4, Map<String, String> map) {
        HashMap hashMap = new HashMap(2);
        hashMap.put((Object)HEADER_AUTH_CREDENTIALS, (Object)this.getAuthorizationHeader(twitterAuthConfig, twitterAuthToken, string2, string3, string4, map));
        hashMap.put((Object)HEADER_AUTH_SERVICE_PROVIDER, (Object)string4);
        return hashMap;
    }
}

