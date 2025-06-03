/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 *  okhttp3.FormBody
 *  okhttp3.HttpUrl
 *  okhttp3.HttpUrl$Builder
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.Request
 *  okhttp3.Response
 */
package com.twitter.sdk.android.core.internal.network;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aHeaders;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class OAuth1aInterceptor
implements Interceptor {
    public final TwitterAuthConfig authConfig;
    public final Session<? extends TwitterAuthToken> session;

    public OAuth1aInterceptor(Session<? extends TwitterAuthToken> session, TwitterAuthConfig twitterAuthConfig) {
        this.session = session;
        this.authConfig = twitterAuthConfig;
    }

    public String getAuthorizationHeader(Request request) throws IOException {
        return new OAuth1aHeaders().getAuthorizationHeader(this.authConfig, this.session.getAuthToken(), null, request.method(), request.url().toString(), this.getPostParams(request));
    }

    public Map<String, String> getPostParams(Request request) throws IOException {
        HashMap hashMap = new HashMap();
        if ("POST".equals((Object)request.method().toUpperCase(Locale.US)) && (request = request.body()) instanceof FormBody) {
            request = (FormBody)request;
            for (int i = 0; i < request.size(); ++i) {
                hashMap.put((Object)request.encodedName(i), (Object)request.value(i));
            }
        }
        return hashMap;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        request = request.newBuilder().url(this.urlWorkaround(request.url())).build();
        return chain.proceed(request.newBuilder().header("Authorization", this.getAuthorizationHeader(request)).build());
    }

    public HttpUrl urlWorkaround(HttpUrl httpUrl) {
        HttpUrl.Builder builder = httpUrl.newBuilder().query(null);
        int n = httpUrl.querySize();
        for (int i = 0; i < n; ++i) {
            builder.addEncodedQueryParameter(UrlUtils.percentEncode(httpUrl.queryParameterName(i)), UrlUtils.percentEncode(httpUrl.queryParameterValue(i)));
        }
        return builder.build();
    }
}

