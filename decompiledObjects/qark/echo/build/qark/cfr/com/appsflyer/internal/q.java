/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFc1sSDK;

public final class q
implements Runnable {
    public final /* synthetic */ AFc1sSDK o;
    public final /* synthetic */ Throwable p;
    public final /* synthetic */ String q;

    public /* synthetic */ q(AFc1sSDK aFc1sSDK, Throwable throwable, String string2) {
        this.o = aFc1sSDK;
        this.p = throwable;
        this.q = string2;
    }

    public final void run() {
        AFc1sSDK.c(this.o, this.p, this.q);
    }
}

