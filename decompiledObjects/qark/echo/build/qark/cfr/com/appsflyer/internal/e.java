/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFf1qSDK;

public final class e
implements Runnable {
    public final /* synthetic */ AFa1eSDK o;
    public final /* synthetic */ AFf1qSDK p;

    public /* synthetic */ e(AFa1eSDK aFa1eSDK, AFf1qSDK aFf1qSDK) {
        this.o = aFa1eSDK;
        this.p = aFf1qSDK;
    }

    public final void run() {
        AFa1eSDK.b(this.o, this.p);
    }
}

