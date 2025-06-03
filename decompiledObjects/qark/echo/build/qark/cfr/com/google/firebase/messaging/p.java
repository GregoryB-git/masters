/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.q;

public final class p
implements Runnable {
    public final /* synthetic */ q o;
    public final /* synthetic */ Intent p;

    public /* synthetic */ p(q q8, Intent intent) {
        this.o = q8;
        this.p = intent;
    }

    public final void run() {
        q.a(this.o, this.p);
    }
}

