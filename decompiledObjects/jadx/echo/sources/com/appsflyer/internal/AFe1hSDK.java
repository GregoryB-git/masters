package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFe1hSDK extends AFa1qSDK {
    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventType() {
        return this.AFLogger == 1 ? AFd1vSDK.CONVERSION : AFd1vSDK.LAUNCH;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afRDLog() {
        return true;
    }
}
