/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  com.twitter.sdk.android.core.internal.network.GuestAuthInterceptor
 *  com.twitter.sdk.android.core.internal.network.GuestAuthNetworkInterceptor
 *  com.twitter.sdk.android.core.internal.network.GuestAuthenticator
 *  com.twitter.sdk.android.core.internal.network.OAuth1aInterceptor
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  okhttp3.Authenticator
 *  okhttp3.CertificatePinner
 *  okhttp3.CertificatePinner$Builder
 *  okhttp3.Interceptor
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 */
package com.twitter.sdk.android.core.internal.network;

import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.network.GuestAuthInterceptor;
import com.twitter.sdk.android.core.internal.network.GuestAuthNetworkInterceptor;
import com.twitter.sdk.android.core.internal.network.GuestAuthenticator;
import com.twitter.sdk.android.core.internal.network.OAuth1aInterceptor;
import okhttp3.Authenticator;
import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public class OkHttpClientHelper {
    public static OkHttpClient.Builder addGuestAuth(OkHttpClient.Builder builder, GuestSessionProvider guestSessionProvider) {
        return builder.certificatePinner(OkHttpClientHelper.getCertificatePinner()).authenticator((Authenticator)new GuestAuthenticator(guestSessionProvider)).addInterceptor((Interceptor)new GuestAuthInterceptor(guestSessionProvider)).addNetworkInterceptor((Interceptor)new GuestAuthNetworkInterceptor());
    }

    public static OkHttpClient.Builder addSessionAuth(OkHttpClient.Builder builder, Session<? extends TwitterAuthToken> session, TwitterAuthConfig twitterAuthConfig) {
        return builder.certificatePinner(OkHttpClientHelper.getCertificatePinner()).addInterceptor((Interceptor)new OAuth1aInterceptor(session, twitterAuthConfig));
    }

    public static CertificatePinner getCertificatePinner() {
        return new CertificatePinner.Builder().add("*.twitter.com", new String[]{"sha1/I0PRSKJViZuUfUYaeX7ATP7RcLc="}).add("*.twitter.com", new String[]{"sha1/VRmyeKyygdftp6vBg5nDu2kEJLU="}).add("*.twitter.com", new String[]{"sha1/Eje6RRfurSkm/cHN/r7t8t7ZFFw="}).add("*.twitter.com", new String[]{"sha1/Wr7Fddyu87COJxlD/H8lDD32YeM="}).add("*.twitter.com", new String[]{"sha1/GiG0lStik84Ys2XsnA6TTLOB5tQ="}).add("*.twitter.com", new String[]{"sha1/IvGeLsbqzPxdI0b0wuj2xVTdXgc="}).add("*.twitter.com", new String[]{"sha1/7WYxNdMb1OymFMQp4xkGn5TBJlA="}).add("*.twitter.com", new String[]{"sha1/sYEIGhmkwJQf+uiVKMEkyZs0rMc="}).add("*.twitter.com", new String[]{"sha1/PANDaGiVHPNpKri0Jtq6j+ki5b0="}).add("*.twitter.com", new String[]{"sha1/u8I+KQuzKHcdrT6iTb30I70GsD0="}).add("*.twitter.com", new String[]{"sha1/wHqYaI2J+6sFZAwRfap9ZbjKzE4="}).add("*.twitter.com", new String[]{"sha1/cTg28gIxU0crbrplRqkQFVggBQk="}).add("*.twitter.com", new String[]{"sha1/sBmJ5+/7Sq/LFI9YRjl2IkFQ4bo="}).add("*.twitter.com", new String[]{"sha1/vb6nG6txV/nkddlU0rcngBqCJoI="}).add("*.twitter.com", new String[]{"sha1/nKmNAK90Dd2BgNITRaWLjy6UONY="}).add("*.twitter.com", new String[]{"sha1/h+hbY1PGI6MSjLD/u/VR/lmADiI="}).add("*.twitter.com", new String[]{"sha1/Xk9ThoXdT57KX9wNRW99UbHcm3s="}).add("*.twitter.com", new String[]{"sha1/1S4TwavjSdrotJWU73w4Q2BkZr0="}).add("*.twitter.com", new String[]{"sha1/gzF+YoVCU9bXeDGQ7JGQVumRueM="}).add("*.twitter.com", new String[]{"sha1/aDMOYTWFIVkpg6PI0tLhQG56s8E="}).add("*.twitter.com", new String[]{"sha1/Vv7zwhR9TtOIN/29MFI4cgHld40="}).build();
    }

    public static OkHttpClient getCustomOkHttpClient(OkHttpClient okHttpClient, GuestSessionProvider guestSessionProvider) {
        if (okHttpClient != null) {
            return OkHttpClientHelper.addGuestAuth(okHttpClient.newBuilder(), guestSessionProvider).build();
        }
        throw new IllegalArgumentException("HttpClient must not be null.");
    }

    public static OkHttpClient getCustomOkHttpClient(OkHttpClient okHttpClient, Session<? extends TwitterAuthToken> session, TwitterAuthConfig twitterAuthConfig) {
        if (session != null) {
            if (okHttpClient != null) {
                return OkHttpClientHelper.addSessionAuth(okHttpClient.newBuilder(), session, twitterAuthConfig).build();
            }
            throw new IllegalArgumentException("HttpClient must not be null.");
        }
        throw new IllegalArgumentException("Session must not be null.");
    }

    public static OkHttpClient getOkHttpClient(GuestSessionProvider guestSessionProvider) {
        return OkHttpClientHelper.addGuestAuth(new OkHttpClient.Builder(), guestSessionProvider).build();
    }

    public static OkHttpClient getOkHttpClient(Session<? extends TwitterAuthToken> session, TwitterAuthConfig twitterAuthConfig) {
        if (session != null) {
            return OkHttpClientHelper.addSessionAuth(new OkHttpClient.Builder(), session, twitterAuthConfig).build();
        }
        throw new IllegalArgumentException("Session must not be null.");
    }
}

