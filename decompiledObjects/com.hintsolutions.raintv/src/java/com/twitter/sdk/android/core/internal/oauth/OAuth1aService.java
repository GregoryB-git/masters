/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  com.twitter.sdk.android.core.internal.oauth.OAuth1aService$1
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.TreeMap
 *  okhttp3.ResponseBody
 */
package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aHeaders;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.internal.oauth.OAuthService;
import java.util.TreeMap;
import okhttp3.ResponseBody;

public class OAuth1aService
extends OAuthService {
    private static final String CALLBACK_URL = "twittersdk://callback";
    private static final String PARAM_SCREEN_NAME = "screen_name";
    private static final String PARAM_USER_ID = "user_id";
    private static final String RESOURCE_OAUTH = "oauth";
    public OAuthApi api = this.getRetrofit().create(OAuthApi.class);

    public OAuth1aService(TwitterCore twitterCore, TwitterApi twitterApi) {
        super(twitterCore, twitterApi);
    }

    public static OAuthResponse parseAuthResponse(String string2) {
        TreeMap<String, String> treeMap = UrlUtils.getQueryParams(string2, false);
        string2 = (String)treeMap.get((Object)"oauth_token");
        String string3 = (String)treeMap.get((Object)"oauth_token_secret");
        String string4 = (String)treeMap.get((Object)PARAM_SCREEN_NAME);
        long l = treeMap.containsKey((Object)PARAM_USER_ID) ? Long.parseLong((String)((String)treeMap.get((Object)PARAM_USER_ID))) : 0L;
        if (string2 != null && string3 != null) {
            return new OAuthResponse(new TwitterAuthToken(string2, string3), string4, l);
        }
        return null;
    }

    public String buildCallbackUrl(TwitterAuthConfig twitterAuthConfig) {
        return Uri.parse((String)CALLBACK_URL).buildUpon().appendQueryParameter("version", this.getTwitterCore().getVersion()).appendQueryParameter("app", twitterAuthConfig.getConsumerKey()).build().toString();
    }

    public String getAccessTokenUrl() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getApi().getBaseHostUrl());
        stringBuilder.append("/oauth/access_token");
        return stringBuilder.toString();
    }

    public String getAuthorizeUrl(TwitterAuthToken twitterAuthToken) {
        return this.getApi().buildUponBaseHostUrl(RESOURCE_OAUTH, "authorize").appendQueryParameter("oauth_token", twitterAuthToken.token).build().toString();
    }

    public Callback<ResponseBody> getCallbackWrapper(Callback<OAuthResponse> callback) {
        return new 1(this, callback);
    }

    public String getTempTokenUrl() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getApi().getBaseHostUrl());
        stringBuilder.append("/oauth/request_token");
        return stringBuilder.toString();
    }

    public void requestAccessToken(Callback<OAuthResponse> callback, TwitterAuthToken object, String string2) {
        String string3 = this.getAccessTokenUrl();
        object = new OAuth1aHeaders().getAuthorizationHeader(this.getTwitterCore().getAuthConfig(), (TwitterAuthToken)object, null, "POST", string3, null);
        this.api.getAccessToken((String)object, string2).enqueue(this.getCallbackWrapper(callback));
    }

    public void requestTempToken(Callback<OAuthResponse> callback) {
        TwitterAuthConfig twitterAuthConfig = this.getTwitterCore().getAuthConfig();
        String string2 = this.getTempTokenUrl();
        this.api.getTempToken(new OAuth1aHeaders().getAuthorizationHeader(twitterAuthConfig, null, this.buildCallbackUrl(twitterAuthConfig), "POST", string2, null)).enqueue(this.getCallbackWrapper(callback));
    }
}

