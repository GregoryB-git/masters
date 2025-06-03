// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.pm.ProviderInfo;
import java.util.Iterator;
import java.util.Collection;
import com.appsflyer.AFLogger;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public final class AFf1oSDK
{
    private final List<AFf1pSDK> AFInAppEventType;
    
    public AFf1oSDK() {
        this.AFInAppEventType = new ArrayList<AFf1pSDK>();
    }
    
    public final void AFKeystoreWrapper(final AFf1pSDK aFf1pSDK) {
        synchronized (this) {
            this.AFInAppEventType.add(aFf1pSDK);
        }
    }
    
    @NonNull
    public final AFf1pSDK[] valueOf() {
        synchronized (this) {
            return this.AFInAppEventType.toArray(new AFf1pSDK[0]);
        }
    }
    
    public final void values(final Context context, final Runnable runnable, final AFc1xSDK aFc1xSDK) {
        final List queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (queryIntentContentProviders != null) {
            if (queryIntentContentProviders.isEmpty()) {
                return;
            }
            final ArrayList<AFf1lSDK> list = new ArrayList<AFf1lSDK>();
            final Iterator<ResolveInfo> iterator = queryIntentContentProviders.iterator();
            while (iterator.hasNext()) {
                final ProviderInfo providerInfo = iterator.next().providerInfo;
                if (providerInfo != null) {
                    list.add(new AFf1lSDK(providerInfo, runnable, aFc1xSDK));
                }
                else {
                    AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                }
            }
            if (!list.isEmpty()) {
                this.AFInAppEventType.addAll(list);
                final StringBuilder sb = new StringBuilder("[Preinstall]: Detected ");
                sb.append(list.size());
                sb.append(" valid preinstall provider(s)");
                AFLogger.afDebugLog(sb.toString());
            }
        }
    }
}
