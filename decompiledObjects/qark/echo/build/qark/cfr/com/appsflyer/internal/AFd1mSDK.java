/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFb1mSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;

public final class AFd1mSDK
extends AFd1zSDK<DeepLinkResult> {
    private DeepLinkResult afDebugLog;
    private final AFb1mSDK afInfoLog;

    public AFd1mSDK(@NonNull AFb1mSDK aFb1mSDK) {
        super(AFd1vSDK.afRDLog, new AFd1vSDK[]{AFd1vSDK.values}, "DdlSdk");
        this.afInfoLog = aFb1mSDK;
    }

    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override
    public final long AFInAppEventType() {
        return 90000L;
    }

    @NonNull
    @Override
    public final AFd1ySDK valueOf() {
        DeepLinkResult deepLinkResult;
        this.afDebugLog = deepLinkResult = this.afInfoLog.AFLogger();
        if (.values[deepLinkResult.getStatus().ordinal()] != 1) {
            if (this.afDebugLog.getError() == DeepLinkResult.Error.TIMEOUT) {
                return AFd1ySDK.AFInAppEventType;
            }
            return AFd1ySDK.valueOf;
        }
        return AFd1ySDK.AFInAppEventParameterName;
    }

}

