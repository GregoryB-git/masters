/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Map
 *  org.json.JSONException
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1rSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1sSDK;
import java.util.Map;
import org.json.JSONException;

public final class AFe1pSDK
extends AFd1zSDK<Void> {
    private final AFc1gSDK<String> afDebugLog;
    private final AFb1dSDK afErrorLog;
    private final Throwable afInfoLog;

    public AFe1pSDK(AFd1fSDK aFd1fSDK, AFb1dSDK aFb1dSDK) {
        super(AFd1vSDK.afDebugLog, new AFd1vSDK[]{AFd1vSDK.values}, "GCD-CHECK");
        this.afInfoLog = aFd1fSDK.afDebugLog();
        this.afDebugLog = aFd1fSDK.afErrorLog;
        this.afErrorLog = aFb1dSDK;
    }

    private Map<String, Object> afRDLog() {
        Map<String, Object> map = this.afErrorLog.values("attributionId", null);
        if (map == null) {
            return null;
        }
        try {
            new AFc1rSDK();
            map = AFc1rSDK.AFKeystoreWrapper((String)map);
            return map;
        }
        catch (JSONException jSONException) {
            StringBuilder stringBuilder = new StringBuilder("[GCD] Failed to parse GCD response: ");
            stringBuilder.append(jSONException.getMessage());
            AFLogger.afErrorLog(stringBuilder.toString(), (Throwable)jSONException);
            return null;
        }
    }

    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override
    public final long AFInAppEventType() {
        return 1000L;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @NonNull
    @Override
    public final AFd1ySDK valueOf() {
        AFc1gSDK<String> aFc1gSDK;
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf((int)this.afErrorLog.values("appsFlyerCount", 0))));
        long l8 = this.afErrorLog.valueOf("appsflyerConversionDataCacheExpiration", 0L);
        if (l8 != 0L && System.currentTimeMillis() - l8 > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.afErrorLog.values("sixtyDayConversionData", true);
            this.afErrorLog.AFInAppEventParameterName("attributionId", null);
            this.afErrorLog.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", 0L);
        }
        if ((aFc1gSDK = this.afRDLog()) != null) {
            if (!aFc1gSDK.containsKey((Object)"is_first_launch")) {
                aFc1gSDK.put((Object)"is_first_launch", (Object)Boolean.FALSE);
            }
            AFe1sSDK.values(aFc1gSDK);
            return AFd1ySDK.AFInAppEventParameterName;
        }
        try {
            if (this.afInfoLog != null) {
                aFc1gSDK = new StringBuilder("Launch exception: ");
                aFc1gSDK.append(this.afInfoLog.getMessage());
                AFe1sSDK.AFInAppEventType(aFc1gSDK.toString());
                return AFd1ySDK.AFInAppEventParameterName;
            }
            aFc1gSDK = this.afDebugLog;
            if (aFc1gSDK == null) return AFd1ySDK.valueOf;
            if (aFc1gSDK.isSuccessful()) return AFd1ySDK.valueOf;
            aFc1gSDK = new StringBuilder("Launch status code: ");
            aFc1gSDK.append(this.afDebugLog.getStatusCode());
            AFe1sSDK.AFInAppEventType(aFc1gSDK.toString());
            return AFd1ySDK.AFInAppEventParameterName;
        }
        catch (Exception exception) {}
        catch (Exception exception) {}
        aFc1gSDK = new StringBuilder("[GCD] Error executing conversion data callback: ");
        aFc1gSDK.append(exception.getLocalizedMessage());
        AFLogger.afErrorLog(aFc1gSDK.toString(), (Throwable)exception);
        return AFd1ySDK.AFInAppEventParameterName;
        aFc1gSDK = new StringBuilder("[GCD] Error executing conversion data callback: ");
        aFc1gSDK.append(exception.getLocalizedMessage());
        AFLogger.afErrorLog(aFc1gSDK.toString(), (Throwable)exception);
        return AFd1ySDK.valueOf;
    }
}

