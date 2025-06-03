// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.AFLogger;
import org.json.JSONObject;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public final class AFe1mSDK
{
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
    
    public AFe1mSDK(final AFb1dSDK valueOf) {
        final ConcurrentHashMap<Object, Object> afInAppEventParameterName = new ConcurrentHashMap<Object, Object>();
        this.AFInAppEventParameterName = (Map<String, Object>)afInAppEventParameterName;
        final ConcurrentHashMap<Object, Object> afInAppEventType = new ConcurrentHashMap<Object, Object>();
        this.AFInAppEventType = (Map<String, Object>)afInAppEventType;
        final ConcurrentHashMap<Object, Object> afKeystoreWrapper = new ConcurrentHashMap<Object, Object>();
        this.AFKeystoreWrapper = (Map<String, Object>)afKeystoreWrapper;
        this.values = 0L;
        this.afErrorLog = 0L;
        this.afDebugLog = new long[2];
        this.afInfoLog = new long[2];
        this.afRDLog = new long[2];
        this.AFLogger = 0L;
        this.AFVersionDeclaration = 0L;
        this.valueOf = valueOf;
        afInAppEventParameterName.putAll(this.values("first_launch"));
        afInAppEventType.putAll(this.values("ddl"));
        afKeystoreWrapper.putAll(this.values("gcd"));
        this.afWarnLog = valueOf.valueOf("prev_session_dur", 0L);
    }
    
    private Map<String, Object> values(String values) {
        final Map<String, Object> emptyMap = Collections.emptyMap();
        values = this.valueOf.values(values, null);
        if (values != null) {
            try {
                return AFa1rSDK.valueOf(new JSONObject(values));
            }
            catch (Exception ex) {
                com.appsflyer.AFLogger.afErrorLog("Error while parsing cached json data", ex, true);
            }
        }
        return emptyMap;
    }
    
    public final void AFKeystoreWrapper(final int n) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.AFLogger = currentTimeMillis;
        if (n == 1) {
            final long afErrorLog = this.afErrorLog;
            if (afErrorLog != 0L) {
                this.AFInAppEventParameterName.put("from_fg", currentTimeMillis - afErrorLog);
                this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject((Map)this.AFInAppEventParameterName).toString());
                return;
            }
            com.appsflyer.AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }
    
    public final void AFKeystoreWrapper(final AFe1tSDK aFe1tSDK) {
        if (this.valueOf()) {
            this.AFInAppEventParameterName.put("start_with", aFe1tSDK.toString());
            this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject((Map)this.AFInAppEventParameterName).toString());
        }
    }
    
    public final boolean valueOf() {
        return this.valueOf.values("appsFlyerCount", 0) == 0;
    }
    
    public final void values() {
        this.afErrorLog = System.currentTimeMillis();
        if (this.valueOf()) {
            final long values = this.values;
            if (values != 0L) {
                this.AFInAppEventParameterName.put("init_to_fg", this.afErrorLog - values);
                this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject((Map)this.AFInAppEventParameterName).toString());
                return;
            }
            com.appsflyer.AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }
    
    public final void values(final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        final long afVersionDeclaration = this.AFVersionDeclaration;
        if (afVersionDeclaration != 0L) {
            this.AFKeystoreWrapper.put("net", currentTimeMillis - afVersionDeclaration);
        }
        else {
            com.appsflyer.AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFKeystoreWrapper.put("retries", i);
        this.valueOf.AFInAppEventParameterName("gcd", new JSONObject((Map)this.AFKeystoreWrapper).toString());
    }
    
    public final void values(final DeepLinkResult deepLinkResult, final long l) {
        this.AFInAppEventType.put("status", deepLinkResult.getStatus().toString());
        this.AFInAppEventType.put("timeout_value", l);
        this.valueOf.AFInAppEventParameterName("ddl", new JSONObject((Map)this.AFInAppEventType).toString());
    }
}
