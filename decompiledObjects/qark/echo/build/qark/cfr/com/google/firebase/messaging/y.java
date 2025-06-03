/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.firebase.messaging;

import V2.k;
import com.google.firebase.messaging.FirebaseMessaging;

public final class y
implements Runnable {
    public final /* synthetic */ FirebaseMessaging o;
    public final /* synthetic */ k p;

    public /* synthetic */ y(FirebaseMessaging firebaseMessaging, k k8) {
        this.o = firebaseMessaging;
        this.p = k8;
    }

    public final void run() {
        FirebaseMessaging.a(this.o, this.p);
    }
}

