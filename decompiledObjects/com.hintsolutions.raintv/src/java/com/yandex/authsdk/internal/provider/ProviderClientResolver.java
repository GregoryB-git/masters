/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 */
package com.yandex.authsdk.internal.provider;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.internal.PackageManagerHelper;
import com.yandex.authsdk.internal.provider.ProviderClient;

public class ProviderClientResolver {
    @NonNull
    private final PackageManagerHelper packageManagerHelper;

    public ProviderClientResolver(@NonNull PackageManagerHelper packageManagerHelper) {
        this.packageManagerHelper = packageManagerHelper;
    }

    @Nullable
    public ProviderClient createProviderClient(@NonNull Context context) {
        PackageManagerHelper.YandexApplicationInfo yandexApplicationInfo = this.packageManagerHelper.findLatestApplication();
        ProviderClient providerClient = null;
        if (yandexApplicationInfo == null) {
            return null;
        }
        int n = yandexApplicationInfo.loginSdkVersion;
        if (n >= 2) {
            providerClient = new ProviderClient(context, yandexApplicationInfo.packageName, n);
        }
        return providerClient;
    }
}

