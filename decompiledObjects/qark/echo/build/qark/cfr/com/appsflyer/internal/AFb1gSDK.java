/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageItemInfo
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;

public final class AFb1gSDK {
    private static String values = "262";
    private Bundle AFInAppEventParameterName = null;
    public final AFb1dSDK AFInAppEventType;
    public final AFb1bSDK valueOf;

    public AFb1gSDK(AFb1bSDK aFb1bSDK, AFb1dSDK aFb1dSDK) {
        this.valueOf = aFb1bSDK;
        this.AFInAppEventType = aFb1dSDK;
    }

    public static String AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().getString("AppUserId");
    }

    public static String valueOf() {
        StringBuilder stringBuilder = new StringBuilder("version: 6.12.2 (build ");
        stringBuilder.append(values);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final String AFInAppEventType(String object) {
        Throwable throwable2;
        block4 : {
            Bundle bundle;
            block3 : {
                try {
                    if (this.AFInAppEventParameterName != null) break block3;
                    this.AFInAppEventParameterName = this.valueOf.AFInAppEventType.getPackageManager().getApplicationInfo((String)this.valueOf.AFInAppEventType.getPackageName(), (int)128).metaData;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            if ((bundle = this.AFInAppEventParameterName) != null && (object = bundle.get((String)object)) != null) {
                return object.toString();
            }
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("Could not load manifest metadata!");
        stringBuilder.append(throwable2.getMessage());
        AFLogger.afErrorLog(stringBuilder.toString(), throwable2);
        return null;
    }

    public final boolean AFKeystoreWrapper(String string2) {
        if ((string2 = this.AFInAppEventType(string2)) != null) {
            return Boolean.parseBoolean((String)string2);
        }
        return false;
    }

    public final String values() {
        String string2;
        String string3 = string2 = AppsFlyerProperties.getInstance().getString("channel");
        if (string2 == null) {
            string3 = this.AFInAppEventType("CHANNEL");
        }
        string2 = string3;
        if (string3 != null) {
            string2 = string3;
            if (string3.equals((Object)"")) {
                string2 = null;
            }
        }
        return string2;
    }
}

