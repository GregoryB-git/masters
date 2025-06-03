package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AFd1hSDK extends AFd1oSDK<String> {
    private static final AFd1vSDK[] AppsFlyer2dXConversionCallback = {AFd1vSDK.DLSDK, AFd1vSDK.ONELINK, AFd1vSDK.MONITORSDK, AFd1vSDK.REGISTER};
    private final AFc1dSDK AFLogger$LogLevel;
    private final AFb1wSDK AFVersionDeclaration;
    protected final AFb1dSDK afErrorLogForExcManagerOnly;
    public final AFa1qSDK afInfoLog;
    private final AFb1bSDK afWarnLog;

    @NonNull
    private final AFb1gSDK getLevel;

    public AFd1hSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1xSDK aFc1xSDK) {
        this(aFa1qSDK, aFc1xSDK, null);
    }

    @NonNull
    private static Map<String, Object> AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        Map<String, Object> map = (Map) aFa1qSDK.valueOf().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1qSDK.valueOf().put("meta", hashMap);
        return hashMap;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public boolean afInfoLog() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AppsFlyerRequestListener afRDLog() {
        return this.afInfoLog.AFInAppEventParameterName;
    }

    public void valueOf(AFa1qSDK aFa1qSDK) {
        boolean F6;
        if (aFa1qSDK.afErrorLog()) {
            aFa1qSDK.values(new AFb1fSDK(aFa1qSDK.valueOf(), ((AFd1oSDK) this).afDebugLog.AFKeystoreWrapper.AFInAppEventType));
            aFa1qSDK.values(((AFd1oSDK) this).afDebugLog.AFInAppEventParameterName(aFa1qSDK.valueOf()));
        }
        if (aFa1qSDK.afDebugLog()) {
            aFa1qSDK.values(((AFd1oSDK) this).afDebugLog.valueOf());
        }
        Set<AFd1vSDK> set = this.AFInAppEventParameterName;
        boolean z7 = set.contains(AFd1vSDK.LAUNCH) || set.contains(AFd1vSDK.CONVERSION);
        if (AFLogger() && z7) {
            aFa1qSDK.AFInAppEventParameterName(this.afErrorLogForExcManagerOnly.values("appsFlyerCount", 0));
        }
        if (aFa1qSDK.afRDLog()) {
            Map<String, Object> AFKeystoreWrapper = AFKeystoreWrapper(aFa1qSDK);
            AFc1dSDK aFc1dSDK = this.AFLogger$LogLevel;
            AFc1eSDK aFc1eSDK = new AFc1eSDK(aFc1dSDK.AFInAppEventParameterName(), aFc1dSDK.valueOf(), AFc1dSDK.AFInAppEventType() ? AFc1aSDK.DEFAULT : AFc1aSDK.API);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", aFc1eSDK.AFInAppEventType);
            AFc1aSDK aFc1aSDK = aFc1eSDK.valueOf;
            if (aFc1aSDK != AFc1aSDK.DEFAULT) {
                jSONObject.put("method", aFc1aSDK.valueOf);
            }
            String str = aFc1eSDK.values;
            if (str != null) {
                F6 = kotlin.text.s.F(str);
                if (!F6) {
                    jSONObject.put("prefix", aFc1eSDK.values);
                }
            }
            AFKeystoreWrapper.put("host", jSONObject);
        }
        if (this.getLevel.AFKeystoreWrapper("AF_PREINSTALL_DISABLED")) {
            AFKeystoreWrapper(aFa1qSDK).put("preinstall_disabled", Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    @Override // com.appsflyer.internal.AFd1oSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFc1qSDK<java.lang.String> values(@androidx.annotation.NonNull java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1hSDK.values(java.lang.String):com.appsflyer.internal.AFc1qSDK");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1hSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1xSDK aFc1xSDK, String str) {
        super(aFa1qSDK.AFInAppEventType(), new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1xSDK, str);
        this.afInfoLog = aFa1qSDK;
        this.AFLogger$LogLevel = aFc1xSDK.onInstallConversionFailureNative();
        this.afErrorLogForExcManagerOnly = aFc1xSDK.values();
        this.AFVersionDeclaration = aFc1xSDK.afRDLog();
        this.afWarnLog = aFc1xSDK.init();
        this.getLevel = aFc1xSDK.AFInAppEventParameterName();
        for (AFd1vSDK aFd1vSDK : AppsFlyer2dXConversionCallback) {
            if (this.values == aFd1vSDK) {
                return;
            }
        }
        int i7 = this.afInfoLog.AFLogger;
        AFd1vSDK aFd1vSDK2 = this.values;
        if (i7 > 0) {
            this.AFKeystoreWrapper.add(AFd1vSDK.CONVERSION);
            return;
        }
        AFd1vSDK aFd1vSDK3 = AFd1vSDK.CONVERSION;
        if (aFd1vSDK2 != aFd1vSDK3) {
            this.AFInAppEventParameterName.add(aFd1vSDK3);
        }
    }
}
