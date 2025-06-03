/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ProviderInfo
 *  android.content.pm.ResolveInfo
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFf1lSDK;
import com.appsflyer.internal.AFf1pSDK;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AFf1oSDK {
    private final List<AFf1pSDK> AFInAppEventType = new ArrayList();

    public final void AFKeystoreWrapper(AFf1pSDK aFf1pSDK) {
        synchronized (this) {
            this.AFInAppEventType.add((Object)aFf1pSDK);
            return;
        }
    }

    @NonNull
    public final AFf1pSDK[] valueOf() {
        synchronized (this) {
            AFf1pSDK[] arraFf1pSDK = (AFf1pSDK[])this.AFInAppEventType.toArray((Object[])new AFf1pSDK[0]);
            return arraFf1pSDK;
        }
    }

    public final void values(Context context, Runnable runnable, AFc1xSDK aFc1xSDK) {
        Intent intent = new Intent("com.appsflyer.referrer.INSTALL_PROVIDER");
        intent = context.getPackageManager().queryIntentContentProviders(intent, 0);
        if (intent != null) {
            if (intent.isEmpty()) {
                return;
            }
            context = new ArrayList();
            intent = intent.iterator();
            while (intent.hasNext()) {
                ProviderInfo providerInfo = ((ResolveInfo)intent.next()).providerInfo;
                if (providerInfo != null) {
                    context.add((Object)new AFf1lSDK(providerInfo, runnable, aFc1xSDK));
                    continue;
                }
                AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
            }
            if (!context.isEmpty()) {
                this.AFInAppEventType.addAll((Collection)context);
                runnable = new StringBuilder("[Preinstall]: Detected ");
                runnable.append(context.size());
                runnable.append(" valid preinstall provider(s)");
                AFLogger.afDebugLog(runnable.toString());
            }
        }
    }
}

