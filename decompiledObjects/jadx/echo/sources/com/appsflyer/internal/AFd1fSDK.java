package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1pSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1fSDK extends AFd1hSDK {

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

    /* renamed from: com.appsflyer.internal.AFd1fSDK$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFf1pSDK.AFa1zSDK.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AFf1pSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[AFf1pSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFd1fSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1xSDK aFc1xSDK) {
        super(aFa1qSDK, aFc1xSDK);
        this.getLevel = aFc1xSDK.AFLogger$LogLevel();
        this.AFLogger$LogLevel = aFc1xSDK.values();
        this.afWarnLog = aFc1xSDK.afDebugLog();
        this.onInstallConversionDataLoadedNative = aFc1xSDK.afRDLog();
        this.onAppOpenAttributionNative = AppsFlyerProperties.getInstance();
        this.AFKeystoreWrapper.add(AFd1vSDK.RESOLVE_ESP);
        this.AFKeystoreWrapper.add(AFd1vSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        super.valueOf(aFa1qSDK);
        int i7 = aFa1qSDK.AFLogger;
        this.afWarnLog.AFKeystoreWrapper(i7);
        Map map = (Map) aFa1qSDK.valueOf().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1qSDK.valueOf().put("meta", map);
        }
        AFf1zSDK AFKeystoreWrapper = this.onInstallConversionDataLoadedNative.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFKeystoreWrapper.AFInAppEventParameterName);
            String str = AFKeystoreWrapper.AFInAppEventType;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j7 = AFKeystoreWrapper.AFKeystoreWrapper;
            if (j7 > 0) {
                hashMap.put("latency", Long.valueOf(j7));
            }
            long j8 = AFKeystoreWrapper.valueOf;
            if (j8 > 0) {
                hashMap.put("delay", Long.valueOf(j8));
            }
            int i8 = AFKeystoreWrapper.values;
            if (i8 > 0) {
                hashMap.put("res_code", Integer.valueOf(i8));
            }
            if (AFKeystoreWrapper.afDebugLog != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(AFKeystoreWrapper.afDebugLog.getClass().getSimpleName());
                sb.append(": ");
                sb.append(AFKeystoreWrapper.afDebugLog.getMessage());
                hashMap.put("error", sb.toString());
            }
            AFf1wSDK aFf1wSDK = AFKeystoreWrapper.afInfoLog;
            if (aFf1wSDK != null) {
                hashMap.put("sig", aFf1wSDK.toString());
            }
            String str2 = AFKeystoreWrapper.AFLogger;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        if (i7 == 1) {
            if (this.onAppOpenAttributionNative.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1qSDK.valueOf().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.afWarnLog.AFInAppEventType);
            this.afWarnLog.valueOf.AFInAppEventType("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.afWarnLog.AFInAppEventParameterName);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i7 == 2) {
            HashMap hashMap4 = new HashMap(this.afWarnLog.AFInAppEventParameterName);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.afWarnLog.valueOf.AFInAppEventType("first_launch");
        }
        if (map.isEmpty()) {
            aFa1qSDK.valueOf().remove("meta");
        }
        if (i7 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFf1pSDK aFf1pSDK : this.getLevel.valueOf()) {
                boolean z7 = aFf1pSDK instanceof AFf1qSDK;
                int i9 = AnonymousClass5.AFKeystoreWrapper[aFf1pSDK.afDebugLog.ordinal()];
                if (i9 == 1) {
                    if (z7) {
                        aFa1qSDK.AFKeystoreWrapper("rfr", ((AFf1qSDK) aFf1pSDK).valueOf);
                        this.AFLogger$LogLevel.values(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFf1pSDK.AFInAppEventParameterName);
                } else if (i9 == 2 && i7 == 2 && !z7) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFf1pSDK.AFKeystoreWrapper);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFf1pSDK.afRDLog);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1qSDK.AFKeystoreWrapper("referrers", arrayList);
            }
            Object obj = this.AFVersionDeclaration;
            if (obj != null) {
                aFa1qSDK.AFKeystoreWrapper("fb_ddl", obj);
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final void values() {
        super.values();
        AFe1mSDK aFe1mSDK = this.afWarnLog;
        int i7 = ((AFd1hSDK) this).afInfoLog.AFLogger;
        long currentTimeMillis = System.currentTimeMillis();
        if (i7 == 1) {
            long j7 = aFe1mSDK.AFLogger;
            if (j7 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFe1mSDK.AFInAppEventParameterName.put("net", Long.valueOf(currentTimeMillis - j7));
            aFe1mSDK.valueOf.AFInAppEventParameterName("first_launch", new JSONObject(aFe1mSDK.AFInAppEventParameterName).toString());
        }
    }
}
