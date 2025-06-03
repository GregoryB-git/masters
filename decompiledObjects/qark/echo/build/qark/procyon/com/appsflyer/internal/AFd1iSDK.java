// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import androidx.annotation.NonNull;
import java.util.Map;

public final class AFd1iSDK extends AFd1oSDK<String>
{
    private final Map<String, Object> afInfoLog;
    
    public AFd1iSDK(@NonNull final Map<String, Object> m, @NonNull final AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.onInstallConversionFailureNative, new AFd1vSDK[] { AFd1vSDK.values }, aFc1xSDK, String.valueOf(m.hashCode()));
        this.afInfoLog = new HashMap<String, Object>(m);
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
    public final AFc1qSDK<String> values(@NonNull final String s) {
        return super.AFLogger.valueOf(this.afInfoLog);
    }
}
