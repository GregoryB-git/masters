/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.AFf1qSDK;

public final class w
implements Runnable {
    public final /* synthetic */ AFf1qSDK o;
    public final /* synthetic */ InstallReferrerClient p;
    public final /* synthetic */ Context q;
    public final /* synthetic */ int r;

    public /* synthetic */ w(AFf1qSDK var1_1, InstallReferrerClient installReferrerClient, Context context, int n8) {
        this.o = var1_1;
        this.p = installReferrerClient;
        this.q = context;
        this.r = n8;
    }

    public final void run() {
        AFf1qSDK.a(this.o, this.p, this.q, this.r);
    }
}

