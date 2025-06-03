/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  androidx.annotation.NonNull
 *  com.yandex.authsdk.internal.strategy.BrowserLoginStrategy
 *  com.yandex.authsdk.internal.strategy.BrowserLoginStrategy$ResultExtractor
 *  com.yandex.authsdk.internal.strategy.NativeLoginStrategy
 *  com.yandex.authsdk.internal.strategy.NativeLoginStrategy$ResultExtractor
 *  com.yandex.authsdk.internal.strategy.WebViewLoginStrategy
 *  com.yandex.authsdk.internal.strategy.WebViewLoginStrategy$ResultExtractor
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.StringBuilder
 */
package com.yandex.authsdk.internal.strategy;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.yandex.authsdk.internal.PackageManagerHelper;
import com.yandex.authsdk.internal.strategy.BrowserLoginStrategy;
import com.yandex.authsdk.internal.strategy.LoginStrategy;
import com.yandex.authsdk.internal.strategy.LoginType;
import com.yandex.authsdk.internal.strategy.NativeLoginStrategy;
import com.yandex.authsdk.internal.strategy.WebViewLoginStrategy;

public class LoginStrategyResolver {
    @NonNull
    private final Context context;
    @NonNull
    private final PackageManagerHelper packageManagerHelper;

    public LoginStrategyResolver(@NonNull Context context, @NonNull PackageManagerHelper packageManagerHelper) {
        this.context = context;
        this.packageManagerHelper = packageManagerHelper;
    }

    @NonNull
    public LoginStrategy getLoginStrategy() {
        LoginStrategy loginStrategy = NativeLoginStrategy.getIfPossible((PackageManagerHelper)this.packageManagerHelper);
        if (loginStrategy != null) {
            return loginStrategy;
        }
        loginStrategy = this.context;
        if ((loginStrategy = BrowserLoginStrategy.getIfPossible((Context)loginStrategy, (PackageManager)loginStrategy.getPackageManager())) != null) {
            return loginStrategy;
        }
        return WebViewLoginStrategy.get();
    }

    @NonNull
    public LoginStrategy.ResultExtractor getResultExtractor(@NonNull LoginType loginType) {
        int n = 1.$SwitchMap$com$yandex$authsdk$internal$strategy$LoginType[loginType.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    return new WebViewLoginStrategy.ResultExtractor();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown login type: ");
                stringBuilder.append((Object)loginType);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return new BrowserLoginStrategy.ResultExtractor();
        }
        return new NativeLoginStrategy.ResultExtractor();
    }
}

