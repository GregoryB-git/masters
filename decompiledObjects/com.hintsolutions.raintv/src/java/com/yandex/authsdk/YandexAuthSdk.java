/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  com.yandex.authsdk.exceptions.YandexAuthInteractionException
 *  com.yandex.authsdk.exceptions.YandexAuthSecurityException
 *  java.io.IOException
 *  java.io.Serializable
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Set
 */
package com.yandex.authsdk;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.authsdk.YandexAuthAccount;
import com.yandex.authsdk.YandexAuthException;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.exceptions.YandexAuthInteractionException;
import com.yandex.authsdk.exceptions.YandexAuthSecurityException;
import com.yandex.authsdk.internal.AuthSdkActivity;
import com.yandex.authsdk.internal.JwtRequest;
import com.yandex.authsdk.internal.Logger;
import com.yandex.authsdk.internal.PackageManagerHelper;
import com.yandex.authsdk.internal.provider.ProviderClient;
import com.yandex.authsdk.internal.provider.ProviderClientResolver;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class YandexAuthSdk {
    private static final String TAG = "YandexAuthSdk";
    @NonNull
    private final YandexAuthOptions options;
    @Nullable
    private final ProviderClient providerClient;

    public YandexAuthSdk(@NonNull Context context, @NonNull YandexAuthOptions yandexAuthOptions) {
        this.options = yandexAuthOptions;
        this.providerClient = new ProviderClientResolver(new PackageManagerHelper(context.getPackageManager(), yandexAuthOptions)).createProviderClient(context);
    }

    @Deprecated
    public YandexAuthSdk(@NonNull YandexAuthOptions yandexAuthOptions) {
        this(yandexAuthOptions.getContext(), yandexAuthOptions);
    }

    @NonNull
    public Intent createLoginIntent(@NonNull Context context, @Nullable Set<String> set) {
        context = new Intent(context, AuthSdkActivity.class);
        if (set != null) {
            context.putExtra("com.yandex.auth.SCOPES", (Serializable)new ArrayList(set));
        }
        context.putExtra("com.yandex.authsdk.EXTRA_OPTIONS", (Parcelable)this.options);
        return context;
    }

    @NonNull
    public Intent createLoginIntent(@NonNull Context context, @Nullable Set<String> set, long l2, @Nullable String string2) {
        context = this.createLoginIntent(context, set);
        context.putExtra("com.yandex.auth.UID_VALUE", l2);
        context.putExtra("com.yandex.auth.LOGIN_HINT", string2);
        return context;
    }

    @Nullable
    public YandexAuthToken extractToken(int n, @Nullable Intent intent) throws YandexAuthException {
        if (intent != null && n == -1) {
            YandexAuthException yandexAuthException = (YandexAuthException)intent.getSerializableExtra("com.yandex.authsdk.EXTRA_ERROR");
            if (yandexAuthException == null) {
                return (YandexAuthToken)intent.getParcelableExtra("com.yandex.authsdk.EXTRA_TOKEN");
            }
            Logger.d(this.options, TAG, "Exception received");
            throw yandexAuthException;
        }
        return null;
    }

    @NonNull
    @WorkerThread
    public List<YandexAuthAccount> getAccounts() throws YandexAuthSecurityException, YandexAuthInteractionException {
        ProviderClient providerClient = this.providerClient;
        if (providerClient != null) {
            return providerClient.getAccounts();
        }
        throw new YandexAuthInteractionException("Yandex AuthSDK provider not found");
    }

    @NonNull
    @WorkerThread
    public String getJwt(@NonNull YandexAuthToken object) throws YandexAuthException {
        try {
            JwtRequest jwtRequest = new JwtRequest(((YandexAuthToken)object).getValue());
            object = jwtRequest.get();
            return object;
        }
        catch (IOException iOException) {
            throw new YandexAuthException(iOException);
        }
    }
}

