/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.firebase.messaging;

import V2.k;
import android.content.Context;
import com.google.firebase.messaging.Q;

public final class P
implements Runnable {
    public final /* synthetic */ Context o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ k q;

    public /* synthetic */ P(Context context, boolean bl, k k8) {
        this.o = context;
        this.p = bl;
        this.q = k8;
    }

    public final void run() {
        Q.a(this.o, this.p, this.q);
    }
}

