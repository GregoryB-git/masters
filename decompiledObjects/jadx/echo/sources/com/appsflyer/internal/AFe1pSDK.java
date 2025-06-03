package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class AFe1pSDK extends AFd1zSDK<Void> {
    private final AFc1gSDK<String> afDebugLog;
    private final AFb1dSDK afErrorLog;
    private final Throwable afInfoLog;

    public AFe1pSDK(AFd1fSDK aFd1fSDK, AFb1dSDK aFb1dSDK) {
        super(AFd1vSDK.GCDSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, "GCD-CHECK");
        this.afInfoLog = aFd1fSDK.afDebugLog();
        this.afDebugLog = ((AFd1oSDK) aFd1fSDK).afErrorLog;
        this.afErrorLog = aFb1dSDK;
    }

    private Map<String, Object> afRDLog() {
        String values = this.afErrorLog.values("attributionId", (String) null);
        if (values == null) {
            return null;
        }
        try {
            new AFc1rSDK();
            return AFc1rSDK.AFKeystoreWrapper(values);
        } catch (JSONException e7) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e7.getMessage());
            AFLogger.afErrorLog(sb.toString(), e7);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final long AFInAppEventType() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFd1ySDK valueOf() {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.afErrorLog.values("appsFlyerCount", 0))));
        long valueOf = this.afErrorLog.valueOf("appsflyerConversionDataCacheExpiration", 0L);
        if (valueOf != 0 && System.currentTimeMillis() - valueOf > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.afErrorLog.values("sixtyDayConversionData", true);
            this.afErrorLog.AFInAppEventParameterName("attributionId", (String) null);
            this.afErrorLog.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> afRDLog = afRDLog();
        if (afRDLog != null) {
            try {
                if (!afRDLog.containsKey("is_first_launch")) {
                    afRDLog.put("is_first_launch", Boolean.FALSE);
                }
                AFe1sSDK.values(afRDLog);
            } catch (Exception e7) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e7.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e7);
            }
            return AFd1ySDK.SUCCESS;
        }
        try {
        } catch (Exception e8) {
            StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb2.append(e8.getLocalizedMessage());
            AFLogger.afErrorLog(sb2.toString(), e8);
        }
        if (this.afInfoLog != null) {
            StringBuilder sb3 = new StringBuilder("Launch exception: ");
            sb3.append(this.afInfoLog.getMessage());
            AFe1sSDK.AFInAppEventType(sb3.toString());
            return AFd1ySDK.SUCCESS;
        }
        AFc1gSDK<String> aFc1gSDK = this.afDebugLog;
        if (aFc1gSDK != null && !aFc1gSDK.isSuccessful()) {
            StringBuilder sb4 = new StringBuilder("Launch status code: ");
            sb4.append(this.afDebugLog.getStatusCode());
            AFe1sSDK.AFInAppEventType(sb4.toString());
            return AFd1ySDK.SUCCESS;
        }
        return AFd1ySDK.FAILURE;
    }
}
