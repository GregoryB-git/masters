/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aHeaders;
import java.util.Map;

public class OAuthSigning {
    public static final String VERIFY_CREDENTIALS_URL = "https://api.twitter.com/1.1/account/verify_credentials.json";
    public final TwitterAuthConfig authConfig;
    public final TwitterAuthToken authToken;
    public final OAuth1aHeaders oAuth1aHeaders;

    public OAuthSigning(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken) {
        this(twitterAuthConfig, twitterAuthToken, new OAuth1aHeaders());
    }

    public OAuthSigning(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, OAuth1aHeaders oAuth1aHeaders) {
        if (twitterAuthConfig != null) {
            if (twitterAuthToken != null) {
                this.authConfig = twitterAuthConfig;
                this.authToken = twitterAuthToken;
                this.oAuth1aHeaders = oAuth1aHeaders;
                return;
            }
            throw new IllegalArgumentException("authToken must not be null");
        }
        throw new IllegalArgumentException("authConfig must not be null");
    }

    public String getAuthorizationHeader(String string2, String string3, Map<String, String> map) {
        return this.oAuth1aHeaders.getAuthorizationHeader(this.authConfig, this.authToken, null, string2, string3, map);
    }

    public Map<String, String> getOAuthEchoHeaders(String string2, String string3, Map<String, String> map) {
        return this.oAuth1aHeaders.getOAuthEchoHeaders(this.authConfig, this.authToken, null, string2, string3, map);
    }

    public Map<String, String> getOAuthEchoHeadersForVerifyCredentials() {
        return this.oAuth1aHeaders.getOAuthEchoHeaders(this.authConfig, this.authToken, null, "GET", VERIFY_CREDENTIALS_URL, null);
    }
}

