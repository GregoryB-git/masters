/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1hSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1pSDK;
import com.appsflyer.internal.AFf1qSDK;
import com.appsflyer.internal.AFf1wSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class AFd1fSDK
extends AFd1hSDK {
    @NonNull
    private final AFb1dSDK AFLogger$LogLevel;
    public Map<String, Object> AFVersionDeclaration;
    @NonNull
    private final AFe1mSDK afWarnLog;
    @NonNull
    private final AFf1oSDK getLevel;
    @NonNull
    private final AppsFlyerProperties onAppOpenAttributionNative;
    @NonNull
    private final AFb1wSDK onInstallConversionDataLoadedNative;

    public AFd1fSDK(@NonNull AFa1qSDK object, @NonNull AFc1xSDK aFc1xSDK) {
        super((AFa1qSDK)object, aFc1xSDK);
        this.getLevel = aFc1xSDK.AFLogger$LogLevel();
        this.AFLogger$LogLevel = aFc1xSDK.values();
        this.afWarnLog = aFc1xSDK.afDebugLog();
        this.onInstallConversionDataLoadedNative = aFc1xSDK.afRDLog();
        this.onAppOpenAttributionNative = AppsFlyerProperties.getInstance();
        object = AFd1vSDK.AFLogger;
        this.AFKeystoreWrapper.add(object);
        object = AFd1vSDK.afRDLog;
        this.AFKeystoreWrapper.add(object);
    }

    @Override
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        Object object;
        Object object2;
        HashMap hashMap;
        int n8;
        super.valueOf(aFa1qSDK);
        int n9 = aFa1qSDK.AFLogger;
        this.afWarnLog.AFKeystoreWrapper(n9);
        HashMap hashMap2 = hashMap = (HashMap)aFa1qSDK.valueOf().get((Object)"meta");
        if (hashMap == null) {
            hashMap2 = new HashMap();
            aFa1qSDK.valueOf().put((Object)"meta", (Object)hashMap2);
        }
        if ((object = this.onInstallConversionDataLoadedNative.AFKeystoreWrapper()) != null) {
            long l8;
            hashMap = new HashMap();
            hashMap.put((Object)"cdn_token", (Object)object.AFInAppEventParameterName);
            object2 = object.AFInAppEventType;
            if (object2 != null) {
                hashMap.put((Object)"c_ver", object2);
            }
            if ((l8 = object.AFKeystoreWrapper) > 0L) {
                hashMap.put((Object)"latency", (Object)l8);
            }
            if ((l8 = object.valueOf) > 0L) {
                hashMap.put((Object)"delay", (Object)l8);
            }
            if ((n8 = object.values) > 0) {
                hashMap.put((Object)"res_code", (Object)n8);
            }
            if (object.afDebugLog != null) {
                object2 = new StringBuilder();
                object2.append(object.afDebugLog.getClass().getSimpleName());
                object2.append(": ");
                object2.append(object.afDebugLog.getMessage());
                hashMap.put((Object)"error", (Object)object2.toString());
            }
            if ((object2 = object.afInfoLog) != null) {
                hashMap.put((Object)"sig", (Object)object2.toString());
            }
            if ((object = object.AFLogger) != null) {
                hashMap.put((Object)"cdn_cache_status", object);
            }
            hashMap2.put((Object)"rc", hashMap);
        }
        n8 = 0;
        if (n9 != 1) {
            if (n9 == 2) {
                hashMap = new HashMap(this.afWarnLog.AFInAppEventParameterName);
                if (!hashMap.isEmpty()) {
                    hashMap2.put((Object)"first_launch", (Object)hashMap);
                }
                this.afWarnLog.valueOf.AFInAppEventType("first_launch");
            }
        } else {
            if (this.onAppOpenAttributionNative.getBoolean("waitForCustomerId", false)) {
                aFa1qSDK.valueOf().put((Object)"wait_cid", (Object)Boolean.toString((boolean)true));
            }
            hashMap = new HashMap(this.afWarnLog.AFInAppEventType);
            this.afWarnLog.valueOf.AFInAppEventType("ddl");
            if (!hashMap.isEmpty()) {
                hashMap2.put((Object)"ddl", (Object)hashMap);
            }
            if (!(hashMap = new HashMap(this.afWarnLog.AFInAppEventParameterName)).isEmpty()) {
                hashMap2.put((Object)"first_launch", hashMap);
            }
        }
        if (hashMap2.isEmpty()) {
            aFa1qSDK.valueOf().remove((Object)"meta");
        }
        if (n9 <= 2) {
            hashMap2 = new ArrayList();
            hashMap = this.getLevel.valueOf();
            int n10 = hashMap.length;
            while (n8 < n10) {
                object = hashMap[n8];
                boolean bl = object instanceof AFf1qSDK;
                int n11 = .AFKeystoreWrapper[object.afDebugLog.ordinal()];
                if (n11 != 1) {
                    if (n11 == 2 && n9 == 2 && !bl) {
                        object2 = new HashMap();
                        object2.put((Object)"source", (Object)object.AFKeystoreWrapper);
                        object2.put((Object)"response", (Object)"TIMEOUT");
                        object2.put((Object)"type", (Object)object.afRDLog);
                        hashMap2.add(object2);
                    }
                } else {
                    if (bl) {
                        aFa1qSDK.AFKeystoreWrapper("rfr", ((AFf1qSDK)object).valueOf);
                        this.AFLogger$LogLevel.values("newGPReferrerSent", true);
                    }
                    hashMap2.add(object.AFInAppEventParameterName);
                }
                ++n8;
            }
            if (!hashMap2.isEmpty()) {
                aFa1qSDK.AFKeystoreWrapper("referrers", (Object)hashMap2);
            }
            if ((hashMap2 = this.AFVersionDeclaration) != null) {
                aFa1qSDK.AFKeystoreWrapper("fb_ddl", (Object)hashMap2);
            }
        }
    }

    @Override
    public final void values() {
        AFd1oSDK.super.values();
        AFe1mSDK aFe1mSDK = this.afWarnLog;
        int n8 = this.afInfoLog.AFLogger;
        long l8 = System.currentTimeMillis();
        if (n8 == 1) {
            long l9 = aFe1mSDK.AFLogger;
            if (l9 != 0L) {
                aFe1mSDK.AFInAppEventParameterName.put((Object)"net", (Object)(l8 - l9));
                JSONObject jSONObject = new JSONObject(aFe1mSDK.AFInAppEventParameterName);
                aFe1mSDK.valueOf.AFInAppEventParameterName("first_launch", jSONObject.toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }

}

