/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.internal.oauth.OAuthService$1
 *  java.lang.Object
 *  java.lang.String
 *  okhttp3.Interceptor
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  retrofit2.Converter$Factory
 *  retrofit2.Retrofit
 *  retrofit2.Retrofit$Builder
 *  retrofit2.converter.gson.GsonConverterFactory
 */
package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.network.OkHttpClientHelper;
import com.twitter.sdk.android.core.internal.oauth.OAuthService;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

abstract class OAuthService {
    private static final String CLIENT_NAME = "TwitterAndroidSDK";
    private final TwitterApi api;
    private final Retrofit retrofit;
    private final TwitterCore twitterCore;
    private final String userAgent;

    public OAuthService(TwitterCore twitterCore, TwitterApi twitterApi) {
        this.twitterCore = twitterCore;
        this.api = twitterApi;
        this.userAgent = TwitterApi.buildUserAgent(CLIENT_NAME, twitterCore.getVersion());
        twitterCore = new OkHttpClient.Builder().addInterceptor((Interceptor)new 1(this)).certificatePinner(OkHttpClientHelper.getCertificatePinner()).build();
        this.retrofit = new Retrofit.Builder().baseUrl(this.getApi().getBaseHostUrl()).client((OkHttpClient)twitterCore).addConverterFactory((Converter.Factory)GsonConverterFactory.create()).build();
    }

    public TwitterApi getApi() {
        return this.api;
    }

    public Retrofit getRetrofit() {
        return this.retrofit;
    }

    public TwitterCore getTwitterCore() {
        return this.twitterCore;
    }

    public String getUserAgent() {
        return this.userAgent;
    }
}

