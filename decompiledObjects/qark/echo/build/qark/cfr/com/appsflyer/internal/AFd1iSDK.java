/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import java.util.HashMap;
import java.util.Map;

public final class AFd1iSDK
extends AFd1oSDK<String> {
    private final Map<String, Object> afInfoLog;

    public AFd1iSDK(@NonNull Map<String, Object> map, @NonNull AFc1xSDK aFc1xSDK) {
        AFd1vSDK aFd1vSDK = AFd1vSDK.onInstallConversionFailureNative;
        AFd1vSDK aFd1vSDK2 = AFd1vSDK.values;
        int n8 = map.hashCode();
        super(aFd1vSDK, new AFd1vSDK[]{aFd1vSDK2}, aFc1xSDK, String.valueOf((int)n8));
        this.afInfoLog = new HashMap(map);
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
        return this.AFLogger.valueOf(this.afInfoLog);
    }
}

