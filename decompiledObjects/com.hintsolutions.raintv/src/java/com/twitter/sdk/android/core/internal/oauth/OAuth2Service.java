/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.internal.oauth.GuestAuthToken
 *  com.twitter.sdk.android.core.internal.oauth.OAuth2Service$1
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  okio.ByteString
 */
package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.GuestTokenResponse;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import com.twitter.sdk.android.core.internal.oauth.OAuthService;
import okio.ByteString;

public class OAuth2Service
extends OAuthService {
    public OAuth2Api api = this.getRetrofit().create(OAuth2Api.class);

    public OAuth2Service(TwitterCore twitterCore, TwitterApi twitterApi) {
        super(twitterCore, twitterApi);
    }

    private String getAuthHeader() {
        TwitterAuthConfig twitterAuthConfig = this.getTwitterCore().getAuthConfig();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(UrlUtils.percentEncode(twitterAuthConfig.getConsumerKey()));
        stringBuilder.append(":");
        stringBuilder.append(UrlUtils.percentEncode(twitterAuthConfig.getConsumerSecret()));
        twitterAuthConfig = ByteString.encodeUtf8((String)stringBuilder.toString());
        stringBuilder = z2.t("Basic ");
        stringBuilder.append(twitterAuthConfig.base64());
        return stringBuilder.toString();
    }

    private String getAuthorizationHeader(OAuth2Token oAuth2Token) {
        StringBuilder stringBuilder = z2.t("Bearer ");
        stringBuilder.append(oAuth2Token.getAccessToken());
        return stringBuilder.toString();
    }

    public void requestAppAuthToken(Callback<OAuth2Token> callback) {
        this.api.getAppAuthToken(this.getAuthHeader(), "client_credentials").enqueue(callback);
    }

    public void requestGuestAuthToken(Callback<GuestAuthToken> callback) {
        this.requestAppAuthToken((Callback<OAuth2Token>)new 1(this, callback));
    }

    public void requestGuestToken(Callback<GuestTokenResponse> callback, OAuth2Token oAuth2Token) {
        this.api.getGuestToken(this.getAuthorizationHeader(oAuth2Token)).enqueue(callback);
    }
}

