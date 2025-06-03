// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Map;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AFLogger;

public final class AFe1sSDK
{
    public final double AFInAppEventType;
    
    public AFe1sSDK() {
    }
    
    public AFe1sSDK(final double afInAppEventType) {
        this.AFInAppEventType = afInAppEventType;
    }
    
    public static void AFInAppEventType(final String obj) {
        final AppsFlyerConversionListener afInAppEventParameterName = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (afInAppEventParameterName != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(obj)));
            afInAppEventParameterName.onConversionDataFail(obj);
        }
    }
    
    public static void values(final Map<String, Object> map) {
        final AppsFlyerConversionListener afInAppEventParameterName = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (afInAppEventParameterName != null) {
            final StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb.append(map.toString());
            AFLogger.afDebugLog(sb.toString());
            afInAppEventParameterName.onConversionDataSuccess(map);
        }
    }
}
