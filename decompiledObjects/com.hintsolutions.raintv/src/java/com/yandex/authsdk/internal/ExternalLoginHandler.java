/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.io.Serializable
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URLEncoder
 */
package com.yandex.authsdk.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthException;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.PreferencesHelper;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class ExternalLoginHandler {
    private static final String LOGIN_URL_FORMAT = "https://oauth.yandex.ru/authorize?response_type=token&client_id=%s&redirect_uri=%s&state=%s&force_confirm=true&origin=yandex_auth_sdk_android";
    private static final String REDIRECT_URI_APPLINKS = "https://yx%s.oauth.yandex.ru/auth/finish?platform=android";
    private static final String REDIRECT_URI_SCHEME = "yx%s:///auth/finish?platform=android";
    private static final String REDIRECT_URL;
    private static final boolean SUPPORT_APPLINKS;
    @NonNull
    private final PreferencesHelper preferencesHelper;
    @NonNull
    private final StateGenerator stateGenerator;

    static {
        SUPPORT_APPLINKS = true;
        REDIRECT_URL = REDIRECT_URI_APPLINKS;
    }

    public ExternalLoginHandler(@NonNull PreferencesHelper preferencesHelper, @NonNull StateGenerator stateGenerator) {
        this.preferencesHelper = preferencesHelper;
        this.stateGenerator = stateGenerator;
    }

    @Nullable
    private String restoreState() {
        return this.preferencesHelper.restoreStateValue();
    }

    private void saveState(@NonNull String string2) {
        this.preferencesHelper.saveStateValue(string2);
    }

    @Nullable
    public String getUrl(@NonNull Intent intent) {
        Long l2 = intent.hasExtra("com.yandex.auth.UID_VALUE") ? Long.valueOf((long)intent.getLongExtra("com.yandex.auth.LOGIN_HINT", 0L)) : null;
        String string2 = intent.getStringExtra("com.yandex.auth.LOGIN_HINT");
        return this.getUrl(((YandexAuthOptions)intent.getParcelableExtra("com.yandex.authsdk.EXTRA_OPTIONS")).getClientId(), l2, string2);
    }

    @NonNull
    public String getUrl(@NonNull String string2, @Nullable Long object, @Nullable String string3) {
        block3: {
            object = this.stateGenerator.generate();
            this.saveState((String)object);
            try {
                object = String.format((String)LOGIN_URL_FORMAT, (Object[])new Object[]{string2, URLEncoder.encode((String)String.format((String)REDIRECT_URL, (Object[])new Object[]{string2}), (String)"UTF-8"), object});
                string2 = object;
                if (string3 == null) break block3;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                throw new RuntimeException((Throwable)unsupportedEncodingException);
            }
            string2 = new StringBuilder();
            string2.append((String)object);
            string2.append("&login_hint=");
            string2.append(string3);
            string2 = string2.toString();
        }
        return string2;
    }

    public boolean isFinalUrl(@NonNull String string2, @NonNull String string3) {
        return string2.startsWith(String.format((String)REDIRECT_URL, (Object[])new Object[]{string3}));
    }

    @NonNull
    public Intent parseResult(@NonNull Uri uri) {
        String string2 = this.restoreState();
        String string3 = uri.getFragment();
        uri = new StringBuilder();
        uri.append("dummy://dummy?");
        uri.append(string3);
        string3 = Uri.parse((String)uri.toString());
        uri = new Intent();
        String string4 = string3.getQueryParameter("state");
        if (!TextUtils.isEmpty((CharSequence)string4) && string4.equals((Object)string2)) {
            string2 = string3.getQueryParameter("error");
            if (string2 != null) {
                uri.putExtra("com.yandex.authsdk.EXTRA_ERROR", (Serializable)new YandexAuthException(string2));
            } else {
                uri.putExtra("com.yandex.authsdk.EXTRA_TOKEN", (Parcelable)new YandexAuthToken(string3.getQueryParameter("access_token"), Long.parseLong((String)string3.getQueryParameter("expires_in"))));
            }
            return uri;
        }
        uri.putExtra("com.yandex.authsdk.EXTRA_ERROR", (Serializable)new YandexAuthException("security.error"));
        return uri;
    }

    public static interface StateGenerator {
        @NonNull
        public String generate();
    }
}

