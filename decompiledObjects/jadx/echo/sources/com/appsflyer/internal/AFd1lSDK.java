package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1bSDK.AnonymousClass4;

/* loaded from: classes.dex */
public final class AFd1lSDK extends AFd1zSDK<Boolean> {
    private static volatile boolean afInfoLog = false;
    private Boolean AFLogger;
    private final AFc1xSDK afDebugLog;
    private final AFc1bSDK afErrorLog;
    private final AFa1bSDK afRDLog;

    public AFd1lSDK(@NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.LOAD_CACHE, new AFd1vSDK[0], "LoadCachedRequests");
        this.afRDLog = aFc1xSDK.onAppOpenAttributionNative();
        this.afErrorLog = aFc1xSDK.AFVersionDeclaration();
        this.afDebugLog = aFc1xSDK;
    }

    public static boolean afInfoLog() {
        return afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final long AFInAppEventType() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFd1ySDK valueOf() {
        for (AFa1rSDK aFa1rSDK : this.afRDLog.values()) {
            StringBuilder sb = new StringBuilder("CACHE: resending request: ");
            sb.append(aFa1rSDK.valueOf);
            AFLogger.afInfoLog(sb.toString());
            try {
                AFe1fSDK aFe1fSDK = new AFe1fSDK(valueOf(aFa1rSDK), aFa1rSDK.AFInAppEventType(), aFa1rSDK.AFInAppEventParameterName, aFa1rSDK.AFInAppEventType);
                AFc1bSDK aFc1bSDK = this.afErrorLog;
                aFc1bSDK.AFKeystoreWrapper.execute(aFc1bSDK.new AnonymousClass4(new AFd1jSDK(aFe1fSDK, this.afDebugLog)));
            } catch (Exception e7) {
                AFLogger.afErrorLog("QUEUE: Failed to resend cached request", e7);
            }
        }
        this.AFLogger = Boolean.TRUE;
        afInfoLog = true;
        return AFd1ySDK.SUCCESS;
    }

    private static String valueOf(AFa1rSDK aFa1rSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFa1rSDK.AFInAppEventParameterName, 10);
        String str = aFa1rSDK.valueOf;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e7);
            return str;
        }
    }
}
