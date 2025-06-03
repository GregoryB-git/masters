/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFd1bSDK;
import com.appsflyer.internal.AFd1dSDK;

public final class c
implements AFd1bSDK {
    public final /* synthetic */ AFa1eSDK a;

    public /* synthetic */ c(AFa1eSDK aFa1eSDK) {
        this.a = aFa1eSDK;
    }

    @Override
    public final void onRemoteConfigUpdateFinished(AFd1dSDK aFd1dSDK) {
        AFa1eSDK.a(this.a, aFd1dSDK);
    }
}

