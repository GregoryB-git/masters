package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class AFb1hSDK<T> {
    public final Context AFInAppEventParameterName;
    public final AFc1xSDK AFInAppEventType;
    public final String AFKeystoreWrapper;
    private final String[] valueOf;
    public final FutureTask<T> values = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1hSDK.2
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1hSDK.this.AFKeystoreWrapper()) {
                return (T) AFb1hSDK.this.values();
            }
            return null;
        }
    });

    public AFb1hSDK(Context context, AFc1xSDK aFc1xSDK, String str, String... strArr) {
        this.AFInAppEventParameterName = context;
        this.AFKeystoreWrapper = str;
        this.valueOf = strArr;
        this.AFInAppEventType = aFc1xSDK;
    }

    public final boolean AFKeystoreWrapper() {
        try {
            ProviderInfo resolveContentProvider = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.valueOf).contains(AFa1fSDK.values(this.AFInAppEventParameterName.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7);
            return false;
        }
    }

    public T valueOf() {
        try {
            return this.values.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7);
            return null;
        }
    }

    public abstract T values();
}
