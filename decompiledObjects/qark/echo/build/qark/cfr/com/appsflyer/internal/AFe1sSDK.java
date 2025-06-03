/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.internal.AFa1eSDK;
import java.util.Map;

public final class AFe1sSDK {
    public final double AFInAppEventType;

    public AFe1sSDK() {
    }

    public AFe1sSDK(double d8) {
        this.AFInAppEventType = d8;
    }

    public static void AFInAppEventType(String string2) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf((Object)string2)));
            appsFlyerConversionListener.onConversionDataFail(string2);
        }
    }

    public static void values(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            StringBuilder stringBuilder = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            stringBuilder.append(map.toString());
            AFLogger.afDebugLog(stringBuilder.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }
}

