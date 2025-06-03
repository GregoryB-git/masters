/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.yandex.authsdk.internal.strategy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthException;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.BrowserLoginActivity;
import com.yandex.authsdk.internal.strategy.LoginStrategy;
import com.yandex.authsdk.internal.strategy.LoginType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BrowserLoginStrategy
extends LoginStrategy {
    private static final String TEST_WEB_URI = "https://ya.ru";
    @NonNull
    private final String browserPackageName;
    @NonNull
    private final Context context;

    private BrowserLoginStrategy(@NonNull Context context, @NonNull String string2) {
        this.context = context;
        this.browserPackageName = string2;
    }

    @Nullable
    public static String findBest(@NonNull List<ResolveInfo> object) {
        Iterator iterator = object.iterator();
        Object var4_2 = null;
        Object object2 = null;
        block0: while (iterator.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo)iterator.next();
            SupportedBrowser[] supportedBrowserArray = SupportedBrowser.values();
            int n = supportedBrowserArray.length;
            int n2 = 0;
            object = object2;
            while (true) {
                block6: {
                    SupportedBrowser supportedBrowser;
                    block7: {
                        object2 = object;
                        if (n2 >= n) continue block0;
                        supportedBrowser = supportedBrowserArray[n2];
                        object2 = object;
                        if (!resolveInfo.activityInfo.packageName.equals((Object)supportedBrowser.packageName)) break block6;
                        if (object == null) break block7;
                        object2 = object;
                        if ((object).priority >= supportedBrowser.priority) break block6;
                    }
                    object2 = supportedBrowser;
                }
                ++n2;
                object = object2;
            }
        }
        object = var4_2;
        if (object2 != null) {
            object = (object2).packageName;
        }
        return object;
    }

    @Nullable
    public static LoginStrategy getIfPossible(@NonNull Context context, @NonNull PackageManager object) {
        if ((object = BrowserLoginStrategy.findBest((List<ResolveInfo>)object.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse((String)TEST_WEB_URI)), 65536))) != null) {
            return new BrowserLoginStrategy(context, (String)object);
        }
        return null;
    }

    @Override
    @NonNull
    public LoginType getType() {
        return LoginType.BROWSER;
    }

    @Override
    public void login(@NonNull Activity activity, @NonNull YandexAuthOptions yandexAuthOptions, @NonNull ArrayList<String> arrayList, @Nullable Long l, @Nullable String string2) {
        Intent intent = new Intent(this.context, BrowserLoginActivity.class);
        intent.putExtra("com.yandex.authsdk.internal.EXTRA_BROWSER_PACKAGE_NAME", this.browserPackageName);
        LoginStrategy.putExtras(intent, arrayList, yandexAuthOptions, l, string2);
        activity.startActivityForResult(intent, 312);
    }

    public static class ResultExtractor
    implements LoginStrategy.ResultExtractor {
        @Override
        @Nullable
        public YandexAuthException tryExtractError(@NonNull Intent intent) {
            return (YandexAuthException)intent.getSerializableExtra("com.yandex.authsdk.EXTRA_ERROR");
        }

        @Override
        @Nullable
        public YandexAuthToken tryExtractToken(@NonNull Intent intent) {
            return (YandexAuthToken)intent.getParcelableExtra("com.yandex.authsdk.EXTRA_TOKEN");
        }
    }
}

