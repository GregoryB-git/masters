// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkResult;

public final class AFd1mSDK extends AFd1zSDK<DeepLinkResult>
{
    private DeepLinkResult afDebugLog;
    private final AFb1mSDK afInfoLog;
    
    public AFd1mSDK(@NonNull final AFb1mSDK afInfoLog) {
        super(AFd1vSDK.afRDLog, new AFd1vSDK[] { AFd1vSDK.values }, "DdlSdk");
        this.afInfoLog = afInfoLog;
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
        final DeepLinkResult afLogger = this.afInfoLog.AFLogger();
        this.afDebugLog = afLogger;
        if (AFd1mSDK$2.values[afLogger.getStatus().ordinal()] == 1) {
            return AFd1ySDK.AFInAppEventParameterName;
        }
        if (this.afDebugLog.getError() == DeepLinkResult.Error.TIMEOUT) {
            return AFd1ySDK.AFInAppEventType;
        }
        return AFd1ySDK.valueOf;
    }
}
