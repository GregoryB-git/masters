/*
 * Decompiled with CFR 0_124.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFd1vSDK;

public final class AFe1hSDK
extends AFa1qSDK {
    @Override
    public final AFd1vSDK AFInAppEventType() {
        if (this.AFLogger == 1) {
            return AFd1vSDK.AFInAppEventParameterName;
        }
        return AFd1vSDK.afWarnLog;
    }

    @Override
    public final boolean afRDLog() {
        return true;
    }
}

