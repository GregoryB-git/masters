/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.String
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFd1vSDK;

public final class AFe1oSDK
extends AFa1qSDK {
    public AFe1oSDK() {
        super("adrevenue_generic", null, Boolean.TRUE);
    }

    @Override
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.onInstallConversionDataLoadedNative;
    }
}

