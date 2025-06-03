package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1bSDK.AnonymousClass4;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFb1wSDK implements AFc1cSDK {
    private final AFd1cSDK AFInAppEventParameterName;
    public final AFb1ySDK AFInAppEventType;
    private final AFb1gSDK AFKeystoreWrapper;
    private final AFc1oSDK AFLogger;
    private final AFe1zSDK afDebugLog;
    private AFd1dSDK afErrorLog;
    private final AFc1bSDK afInfoLog;
    private AFf1zSDK afRDLog;
    private final AFe1wSDK valueOf;
    private final Object values;

    public AFb1wSDK() {
    }

    public AFb1wSDK(AFd1cSDK aFd1cSDK, AFb1gSDK aFb1gSDK, AFe1wSDK aFe1wSDK, AFb1ySDK aFb1ySDK, AFc1oSDK aFc1oSDK, AFe1zSDK aFe1zSDK, AFc1bSDK aFc1bSDK) {
        this.values = new Object();
        this.AFInAppEventParameterName = aFd1cSDK;
        this.AFKeystoreWrapper = aFb1gSDK;
        this.valueOf = aFe1wSDK;
        this.AFInAppEventType = aFb1ySDK;
        this.AFLogger = aFc1oSDK;
        this.afDebugLog = aFe1zSDK;
        this.afInfoLog = aFc1bSDK;
        aFc1bSDK.values.add(this);
    }

    public final void AFInAppEventParameterName(AFd1bSDK aFd1bSDK) {
        AFd1gSDK aFd1gSDK = new AFd1gSDK(this.AFInAppEventParameterName, this.AFKeystoreWrapper, this.valueOf, this.AFInAppEventType, this.AFLogger, this.afDebugLog, "v1", aFd1bSDK);
        AFc1bSDK aFc1bSDK = this.afInfoLog;
        aFc1bSDK.AFKeystoreWrapper.execute(aFc1bSDK.new AnonymousClass4(aFd1gSDK));
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void AFInAppEventType(AFd1zSDK<?> aFd1zSDK, AFd1ySDK aFd1ySDK) {
        if (aFd1zSDK instanceof AFd1gSDK) {
            AFd1gSDK aFd1gSDK = (AFd1gSDK) aFd1zSDK;
            AFd1dSDK aFd1dSDK = aFd1gSDK.AFLogger;
            if (aFd1dSDK == null) {
                AFLogger.afWarnLog("CFG: update RC returned null result, something went wrong!");
                aFd1dSDK = AFd1dSDK.FAILURE;
            }
            if (aFd1dSDK != AFd1dSDK.USE_CACHED) {
                AFf1zSDK aFf1zSDK = aFd1gSDK.afRDLog;
                synchronized (this.values) {
                    this.afRDLog = aFf1zSDK;
                }
            }
            AFKeystoreWrapper(aFd1dSDK, aFd1gSDK.afInfoLog);
        }
    }

    public final AFf1zSDK AFKeystoreWrapper() {
        AFf1zSDK aFf1zSDK;
        synchronized (this.values) {
            aFf1zSDK = this.afRDLog;
            this.afRDLog = null;
        }
        return aFf1zSDK;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void values(AFd1zSDK<?> aFd1zSDK) {
    }

    public static Map<String, String> AFKeystoreWrapper(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e7) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e7);
            }
        }
        return hashMap;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void AFInAppEventParameterName(AFd1zSDK<?> aFd1zSDK) {
        if (aFd1zSDK instanceof AFd1gSDK) {
            AFd1gSDK aFd1gSDK = (AFd1gSDK) aFd1zSDK;
            synchronized (this.values) {
                this.afRDLog = null;
            }
            AFKeystoreWrapper(AFd1dSDK.FAILURE, aFd1gSDK.afInfoLog);
        }
    }

    private void AFKeystoreWrapper(AFd1dSDK aFd1dSDK, AFd1bSDK aFd1bSDK) {
        synchronized (this.values) {
            this.afErrorLog = aFd1dSDK;
        }
        if (aFd1bSDK != null) {
            aFd1bSDK.onRemoteConfigUpdateFinished(aFd1dSDK);
        }
    }
}
