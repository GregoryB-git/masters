package com.appsflyer.internal;

import com.appsflyer.internal.AFf1pSDK;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFf1rSDK extends AFf1pSDK {
    public AFf1rSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    public final void AFInAppEventType(AFb1dSDK aFb1dSDK, AFb1hSDK<Map<String, Object>> aFb1hSDK) {
        if (AFa1eSDK.valueOf().valueOf(aFb1dSDK, false) > 0 || !aFb1hSDK.AFKeystoreWrapper()) {
            return;
        }
        aFb1hSDK.AFInAppEventType.AFInAppEventType().execute(aFb1hSDK.values);
        this.afInfoLog = System.currentTimeMillis();
        this.afDebugLog = AFf1pSDK.AFa1zSDK.STARTED;
        addObserver(new AFf1pSDK.AnonymousClass1());
    }
}
