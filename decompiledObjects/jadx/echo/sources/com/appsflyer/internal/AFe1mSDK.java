package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFe1mSDK {
    public final Map<String, Object> AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public long AFLogger;
    public long AFVersionDeclaration;
    public final long[] afDebugLog;
    public long afErrorLog;
    public final long[] afInfoLog;
    public final long[] afRDLog;
    public long afWarnLog;
    public final AFb1dSDK valueOf;
    public long values;

    public AFe1mSDK(AFb1dSDK aFb1dSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFInAppEventParameterName = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.AFInAppEventType = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap3;
        this.values = 0L;
        this.afErrorLog = 0L;
        this.afDebugLog = new long[2];
        this.afInfoLog = new long[2];
        this.afRDLog = new long[2];
        this.AFLogger = 0L;
        this.AFVersionDeclaration = 0L;
        this.valueOf = aFb1dSDK;
        concurrentHashMap.putAll(values("first_launch"));
        concurrentHashMap2.putAll(values("ddl"));
        concurrentHashMap3.putAll(values("gcd"));
        this.afWarnLog = aFb1dSDK.valueOf("prev_session_dur", 0L);
    }

    private Map<String, Object> values(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String values = this.valueOf.values(str, (String) null);
        if (values == null) {
            return emptyMap;
        }
        try {
            return AFa1rSDK.valueOf(new JSONObject(values));
        } catch (Exception e7) {
            AFLogger.afErrorLog("Error while parsing cached json data", e7, true);
            return emptyMap;
        }
    }

    public final void AFKeystoreWrapper(int i7) {
        long currentTimeMillis = System.currentTimeMillis();
        this.AFLogger = currentTimeMillis;
        if (i7 == 1) {
            long j7 = this.afErrorLog;
            if (j7 == 0) {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
                return;
            }
            this.AFInAppEventParameterName.put("from_fg", Long.valueOf(currentTimeMillis - j7));
            this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject(this.AFInAppEventParameterName).toString());
        }
    }

    public final boolean valueOf() {
        return this.valueOf.values("appsFlyerCount", 0) == 0;
    }

    public final void AFKeystoreWrapper(AFe1tSDK aFe1tSDK) {
        if (valueOf()) {
            this.AFInAppEventParameterName.put("start_with", aFe1tSDK.toString());
            this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject(this.AFInAppEventParameterName).toString());
        }
    }

    public final void values() {
        this.afErrorLog = System.currentTimeMillis();
        if (valueOf()) {
            long j7 = this.values;
            if (j7 == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.AFInAppEventParameterName.put("init_to_fg", Long.valueOf(this.afErrorLog - j7));
            this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject(this.AFInAppEventParameterName).toString());
        }
    }

    public final void values(int i7) {
        long currentTimeMillis = System.currentTimeMillis();
        long j7 = this.AFVersionDeclaration;
        if (j7 != 0) {
            this.AFKeystoreWrapper.put("net", Long.valueOf(currentTimeMillis - j7));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFKeystoreWrapper.put("retries", Integer.valueOf(i7));
        this.valueOf.AFInAppEventParameterName("gcd", new JSONObject(this.AFKeystoreWrapper).toString());
    }

    public final void values(DeepLinkResult deepLinkResult, long j7) {
        this.AFInAppEventType.put("status", deepLinkResult.getStatus().toString());
        this.AFInAppEventType.put("timeout_value", Long.valueOf(j7));
        this.valueOf.AFInAppEventParameterName("ddl", new JSONObject(this.AFInAppEventType).toString());
    }
}
