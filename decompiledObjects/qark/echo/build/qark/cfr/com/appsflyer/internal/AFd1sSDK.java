/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFf1cSDK;
import java.lang.ref.WeakReference;

public final class AFd1sSDK
extends AFd1oSDK<String> {
    @NonNull
    private final String afInfoLog;
    private final AFf1cSDK getLevel;

    public AFd1sSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull String string2, AFf1cSDK aFf1cSDK) {
        super(AFd1vSDK.onAppOpenAttributionNative, new AFd1vSDK[]{AFd1vSDK.values}, aFc1xSDK, string2);
        this.afInfoLog = string2;
        this.getLevel = aFf1cSDK;
    }

    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override
    public final boolean afInfoLog() {
        return false;
    }

    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    @Override
    public final AFc1qSDK<String> values(@NonNull String string2) {
        return this.AFLogger.AFInAppEventParameterName(this.afInfoLog);
    }

    @Override
    public final void values() {
        super.values();
        Object object = this.afErrorLog;
        if (object != null) {
            int n8 = object.getStatusCode();
            if (n8 != 200) {
                if (n8 != 301 && n8 != 302) {
                    object = new StringBuilder("call to ");
                    object.append(this.afInfoLog);
                    object.append(" failed: ");
                    object.append(n8);
                    AFLogger.afInfoLog(object.toString());
                    return;
                }
                Object object2 = new StringBuilder("Cross promotion redirection success: ");
                object2.append(this.afInfoLog);
                AFLogger.afInfoLog(object2.toString(), false);
                object2 = object.AFInAppEventType("Location");
                object = this.getLevel;
                if (object != null && object2 != null) {
                    object.AFInAppEventType = object2;
                    object2 = (Context)object.AFKeystoreWrapper.get();
                    if (object2 != null) {
                        try {
                            if (object.AFInAppEventType != null) {
                                object2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)object.AFInAppEventType)).setFlags(268435456));
                                return;
                            }
                        }
                        catch (Exception exception) {
                            AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf((Object)exception)), (Throwable)exception);
                        }
                    }
                    return;
                }
            } else {
                object = new StringBuilder("Cross promotion impressions success: ");
                object.append(this.afInfoLog);
                AFLogger.afInfoLog(object.toString(), false);
            }
        }
    }
}

