// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import com.appsflyer.AppsFlyerProperties;
import java.util.Map;
import androidx.annotation.NonNull;

public final class AFd1fSDK extends AFd1hSDK
{
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
    
    public AFd1fSDK(@NonNull final AFa1qSDK aFa1qSDK, @NonNull final AFc1xSDK aFc1xSDK) {
        super(aFa1qSDK, aFc1xSDK);
        this.getLevel = aFc1xSDK.AFLogger$LogLevel();
        this.AFLogger$LogLevel = aFc1xSDK.values();
        this.afWarnLog = aFc1xSDK.afDebugLog();
        this.onInstallConversionDataLoadedNative = aFc1xSDK.afRDLog();
        this.onAppOpenAttributionNative = AppsFlyerProperties.getInstance();
        super.AFKeystoreWrapper.add(AFd1vSDK.AFLogger);
        super.AFKeystoreWrapper.add(AFd1vSDK.afRDLog);
    }
    
    @Override
    public final void valueOf(final AFa1qSDK aFa1qSDK) {
        super.valueOf(aFa1qSDK);
        final int afLogger = aFa1qSDK.AFLogger;
        this.afWarnLog.AFKeystoreWrapper(afLogger);
        Object o;
        if ((o = aFa1qSDK.valueOf().get("meta")) == null) {
            o = new HashMap<String, HashMap<String, String>>();
            aFa1qSDK.valueOf().put("meta", o);
        }
        final AFf1zSDK afKeystoreWrapper = this.onInstallConversionDataLoadedNative.AFKeystoreWrapper();
        if (afKeystoreWrapper != null) {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("cdn_token", afKeystoreWrapper.AFInAppEventParameterName);
            final String afInAppEventType = afKeystoreWrapper.AFInAppEventType;
            if (afInAppEventType != null) {
                hashMap.put("c_ver", afInAppEventType);
            }
            final long afKeystoreWrapper2 = afKeystoreWrapper.AFKeystoreWrapper;
            if (afKeystoreWrapper2 > 0L) {
                hashMap.put("latency", (String)afKeystoreWrapper2);
            }
            final long valueOf = afKeystoreWrapper.valueOf;
            if (valueOf > 0L) {
                hashMap.put("delay", (String)valueOf);
            }
            final int values = afKeystoreWrapper.values;
            if (values > 0) {
                hashMap.put("res_code", (String)values);
            }
            if (afKeystoreWrapper.afDebugLog != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(afKeystoreWrapper.afDebugLog.getClass().getSimpleName());
                sb.append(": ");
                sb.append(afKeystoreWrapper.afDebugLog.getMessage());
                hashMap.put("error", sb.toString());
            }
            final AFf1wSDK afInfoLog = afKeystoreWrapper.afInfoLog;
            if (afInfoLog != null) {
                hashMap.put("sig", afInfoLog.toString());
            }
            final String afLogger2 = afKeystoreWrapper.AFLogger;
            if (afLogger2 != null) {
                hashMap.put("cdn_cache_status", afLogger2);
            }
            ((Map<String, HashMap<String, String>>)o).put("rc", hashMap);
        }
        int i = 0;
        if (afLogger != 1) {
            if (afLogger == 2) {
                final HashMap<String, String> hashMap2 = new HashMap<String, String>((Map<? extends String, ? extends String>)this.afWarnLog.AFInAppEventParameterName);
                if (!hashMap2.isEmpty()) {
                    ((Map<String, HashMap<String, String>>)o).put("first_launch", hashMap2);
                }
                this.afWarnLog.valueOf.AFInAppEventType("first_launch");
            }
        }
        else {
            if (this.onAppOpenAttributionNative.getBoolean("waitForCustomerId", false)) {
                aFa1qSDK.valueOf().put("wait_cid", Boolean.toString(true));
            }
            final HashMap<String, String> hashMap3 = new HashMap<String, String>((Map<? extends String, ? extends String>)this.afWarnLog.AFInAppEventType);
            this.afWarnLog.valueOf.AFInAppEventType("ddl");
            if (!hashMap3.isEmpty()) {
                ((Map<String, HashMap<String, String>>)o).put("ddl", hashMap3);
            }
            final HashMap<String, String> hashMap4 = new HashMap<String, String>((Map<? extends String, ? extends String>)this.afWarnLog.AFInAppEventParameterName);
            if (!hashMap4.isEmpty()) {
                ((Map<String, HashMap<String, String>>)o).put("first_launch", hashMap4);
            }
        }
        if (((Map)o).isEmpty()) {
            aFa1qSDK.valueOf().remove("meta");
        }
        if (afLogger <= 2) {
            final ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
            for (AFf1pSDK[] value = this.getLevel.valueOf(); i < value.length; ++i) {
                final AFf1pSDK aFf1pSDK = value[i];
                final boolean b = aFf1pSDK instanceof AFf1qSDK;
                final int n = AFd1fSDK$5.AFKeystoreWrapper[aFf1pSDK.afDebugLog.ordinal()];
                if (n != 1) {
                    if (n == 2) {
                        if (afLogger == 2 && !b) {
                            final HashMap<String, String> hashMap5 = new HashMap<String, String>();
                            hashMap5.put("source", aFf1pSDK.AFKeystoreWrapper);
                            hashMap5.put("response", "TIMEOUT");
                            hashMap5.put("type", aFf1pSDK.afRDLog);
                            list.add(hashMap5);
                        }
                    }
                }
                else {
                    if (b) {
                        aFa1qSDK.AFKeystoreWrapper("rfr", ((AFf1qSDK)aFf1pSDK).valueOf);
                        this.AFLogger$LogLevel.values("newGPReferrerSent", true);
                    }
                    list.add((HashMap<String, String>)aFf1pSDK.AFInAppEventParameterName);
                }
            }
            if (!list.isEmpty()) {
                aFa1qSDK.AFKeystoreWrapper("referrers", list);
            }
            final Map<String, Object> afVersionDeclaration = this.AFVersionDeclaration;
            if (afVersionDeclaration != null) {
                aFa1qSDK.AFKeystoreWrapper("fb_ddl", afVersionDeclaration);
            }
        }
    }
    
    @Override
    public final void values() {
        super.values();
        final AFe1mSDK afWarnLog = this.afWarnLog;
        final int afLogger = super.afInfoLog.AFLogger;
        final long currentTimeMillis = System.currentTimeMillis();
        if (afLogger == 1) {
            final long afLogger2 = afWarnLog.AFLogger;
            if (afLogger2 != 0L) {
                afWarnLog.AFInAppEventParameterName.put("net", currentTimeMillis - afLogger2);
                afWarnLog.valueOf.AFInAppEventParameterName("first_launch", new JSONObject((Map)afWarnLog.AFInAppEventParameterName).toString());
                return;
            }
            com.appsflyer.AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }
}
