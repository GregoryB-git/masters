package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1iSDK extends AFd1oSDK<String> {
    private final Map<String, Object> afInfoLog;

    public AFd1iSDK(@NonNull Map<String, Object> map, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.MONITORSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1xSDK, String.valueOf(map.hashCode()));
        this.afInfoLog = new HashMap(map);
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AFc1qSDK<String> values(@NonNull String str) {
        return ((AFd1oSDK) this).AFLogger.valueOf(this.afInfoLog);
    }
}
