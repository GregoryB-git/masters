/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFa1eSDK;

public final class d
implements Runnable {
    public final /* synthetic */ AFa1eSDK o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ Intent q;

    public /* synthetic */ d(AFa1eSDK aFa1eSDK, Context context, Intent intent) {
        this.o = aFa1eSDK;
        this.p = context;
        this.q = intent;
    }

    public final void run() {
        AFa1eSDK.f(this.o, this.p, this.q);
    }
}

