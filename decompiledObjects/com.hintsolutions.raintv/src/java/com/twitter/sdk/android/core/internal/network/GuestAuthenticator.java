/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.internal.oauth.GuestAuthToken
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  okhttp3.Authenticator
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 *  okhttp3.Route
 */
package com.twitter.sdk.android.core.internal.network;

import com.twitter.sdk.android.core.GuestSession;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.internal.network.GuestAuthInterceptor;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public class GuestAuthenticator
implements Authenticator {
    public static final int MAX_RETRIES = 2;
    public final GuestSessionProvider guestSessionProvider;

    public GuestAuthenticator(GuestSessionProvider guestSessionProvider) {
        this.guestSessionProvider = guestSessionProvider;
    }

    public Request authenticate(Route route, Response response) throws IOException {
        return this.reauth(response);
    }

    public boolean canRetry(Response response) {
        boolean bl = true;
        int n = 1;
        while ((response = response.priorResponse()) != null) {
            ++n;
        }
        if (n >= 2) {
            bl = false;
        }
        return bl;
    }

    public GuestSession getExpiredSession(Response object) {
        Object object2 = object.request().headers();
        object = object2.get("Authorization");
        object2 = object2.get("x-guest-token");
        if (object != null && object2 != null) {
            return new GuestSession(new GuestAuthToken("bearer", object.replace((CharSequence)"bearer ", (CharSequence)""), (String)object2));
        }
        return null;
    }

    public Request reauth(Response response) {
        GuestSession guestSession;
        if (this.canRetry(response) && (guestSession = (guestSession = this.guestSessionProvider.refreshCurrentSession(this.getExpiredSession(response))) == null ? null : (GuestAuthToken)guestSession.getAuthToken()) != null) {
            return this.resign(response.request(), (GuestAuthToken)guestSession);
        }
        return null;
    }

    public Request resign(Request request, GuestAuthToken guestAuthToken) {
        request = request.newBuilder();
        GuestAuthInterceptor.addAuthHeaders((Request.Builder)request, guestAuthToken);
        return request.build();
    }
}

