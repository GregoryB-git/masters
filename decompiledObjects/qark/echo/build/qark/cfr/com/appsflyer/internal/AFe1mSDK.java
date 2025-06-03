/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1rSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFe1tSDK;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

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
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        this.AFInAppEventParameterName = concurrentHashMap = new ConcurrentHashMap();
        this.AFInAppEventType = concurrentHashMap3 = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap2 = new ConcurrentHashMap();
        this.values = 0L;
        this.afErrorLog = 0L;
        this.afDebugLog = new long[2];
        this.afInfoLog = new long[2];
        this.afRDLog = new long[2];
        this.AFLogger = 0L;
        this.AFVersionDeclaration = 0L;
        this.valueOf = aFb1dSDK;
        concurrentHashMap.putAll(this.values("first_launch"));
        concurrentHashMap3.putAll(this.values("ddl"));
        concurrentHashMap2.putAll(this.values("gcd"));
        this.afWarnLog = aFb1dSDK.valueOf("prev_session_dur", 0L);
    }

    private Map<String, Object> values(String map) {
        Map map2 = Collections.emptyMap();
        if ((map = this.valueOf.values((String)map, null)) != null) {
            try {
                map = AFa1rSDK.valueOf(new JSONObject((String)map));
                return map;
            }
            catch (Exception exception) {
                AFLogger.afErrorLog("Error while parsing cached json data", (Throwable)exception, true);
            }
        }
        return map2;
    }

    public final void AFKeystoreWrapper(int n8) {
        long l8;
        this.AFLogger = l8 = System.currentTimeMillis();
        if (n8 == 1) {
            long l9 = this.afErrorLog;
            if (l9 != 0L) {
                this.AFInAppEventParameterName.put((Object)"from_fg", (Object)(l8 - l9));
                JSONObject jSONObject = new JSONObject(this.AFInAppEventParameterName);
                this.valueOf.AFInAppEventParameterName("first_launch", jSONObject.toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void AFKeystoreWrapper(AFe1tSDK aFe1tSDK) {
        if (this.valueOf()) {
            this.AFInAppEventParameterName.put((Object)"start_with", (Object)aFe1tSDK.toString());
            aFe1tSDK = new JSONObject(this.AFInAppEventParameterName);
            this.valueOf.AFInAppEventParameterName("first_launch", aFe1tSDK.toString());
        }
    }

    public final boolean valueOf() {
        if (this.valueOf.values("appsFlyerCount", 0) == 0) {
            return true;
        }
        return false;
    }

    public final void values() {
        this.afErrorLog = System.currentTimeMillis();
        if (this.valueOf()) {
            long l8 = this.values;
            if (l8 != 0L) {
                this.AFInAppEventParameterName.put((Object)"init_to_fg", (Object)(this.afErrorLog - l8));
                JSONObject jSONObject = new JSONObject(this.AFInAppEventParameterName);
                this.valueOf.AFInAppEventParameterName("first_launch", jSONObject.toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void values(int n8) {
        long l8 = System.currentTimeMillis();
        long l9 = this.AFVersionDeclaration;
        if (l9 != 0L) {
            this.AFKeystoreWrapper.put((Object)"net", (Object)(l8 - l9));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFKeystoreWrapper.put((Object)"retries", (Object)n8);
        JSONObject jSONObject = new JSONObject(this.AFKeystoreWrapper);
        this.valueOf.AFInAppEventParameterName("gcd", jSONObject.toString());
    }

    public final void values(DeepLinkResult deepLinkResult, long l8) {
        this.AFInAppEventType.put((Object)"status", (Object)deepLinkResult.getStatus().toString());
        this.AFInAppEventType.put((Object)"timeout_value", (Object)l8);
        deepLinkResult = new JSONObject(this.AFInAppEventType);
        this.valueOf.AFInAppEventParameterName("ddl", deepLinkResult.toString());
    }
}

