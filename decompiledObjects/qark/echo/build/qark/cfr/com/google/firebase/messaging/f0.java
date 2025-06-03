/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ScheduledExecutorService
 */
package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.messaging.F;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.K;
import com.google.firebase.messaging.g0;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

public final class f0
implements Callable {
    public final /* synthetic */ Context o;
    public final /* synthetic */ ScheduledExecutorService p;
    public final /* synthetic */ FirebaseMessaging q;
    public final /* synthetic */ K r;
    public final /* synthetic */ F s;

    public /* synthetic */ f0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, K k8, F f8) {
        this.o = context;
        this.p = scheduledExecutorService;
        this.q = firebaseMessaging;
        this.r = k8;
        this.s = f8;
    }

    public final Object call() {
        return g0.a(this.o, this.p, this.q, this.r, this.s);
    }
}

