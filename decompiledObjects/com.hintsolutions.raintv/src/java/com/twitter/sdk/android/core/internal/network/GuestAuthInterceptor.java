/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.internal.oauth.GuestAuthToken
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 */
package com.twitter.sdk.android.core.internal.network;

import com.twitter.sdk.android.core.GuestSession;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class GuestAuthInterceptor
implements Interceptor {
    public final GuestSessionProvider guestSessionProvider;

    public GuestAuthInterceptor(GuestSessionProvider guestSessionProvider) {
        this.guestSessionProvider = guestSessionProvider;
    }

    public static void addAuthHeaders(Request.Builder builder, GuestAuthToken guestAuthToken) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(guestAuthToken.getTokenType());
        stringBuilder.append(" ");
        stringBuilder.append(guestAuthToken.getAccessToken());
        builder.header("Authorization", stringBuilder.toString());
        builder.header("x-guest-token", guestAuthToken.getGuestToken());
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        GuestSession guestSession = this.guestSessionProvider.getCurrentSession();
        guestSession = guestSession == null ? null : (GuestAuthToken)guestSession.getAuthToken();
        if (guestSession != null) {
            request = request.newBuilder();
            GuestAuthInterceptor.addAuthHeaders((Request.Builder)request, (GuestAuthToken)guestSession);
            return chain.proceed(request.build());
        }
        return chain.proceed(request);
    }
}

