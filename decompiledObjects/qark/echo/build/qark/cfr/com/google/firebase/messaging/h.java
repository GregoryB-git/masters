/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.firebase.messaging;

import V2.k;
import android.content.Intent;
import com.google.firebase.messaging.i;

public final class h
implements Runnable {
    public final /* synthetic */ i o;
    public final /* synthetic */ Intent p;
    public final /* synthetic */ k q;

    public /* synthetic */ h(i i8, Intent intent, k k8) {
        this.o = i8;
        this.p = intent;
        this.q = k8;
    }

    public final void run() {
        i.a(this.o, this.p, this.q);
    }
}

