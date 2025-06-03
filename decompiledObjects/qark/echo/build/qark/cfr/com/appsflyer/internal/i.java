/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.appsflyer.internal;

import android.app.Activity;
import com.appsflyer.internal.AFb1jSDK;

public final class i
implements Runnable {
    public final /* synthetic */ AFb1jSDK o;
    public final /* synthetic */ Activity p;

    public /* synthetic */ i(AFb1jSDK aFb1jSDK, Activity activity) {
        this.o = aFb1jSDK;
        this.p = activity;
    }

    public final void run() {
        AFb1jSDK.a(this.o, this.p);
    }
}

