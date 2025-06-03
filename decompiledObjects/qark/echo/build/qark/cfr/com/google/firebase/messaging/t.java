/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.google.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessaging;

public final class t
implements Runnable {
    public final /* synthetic */ FirebaseMessaging o;

    public /* synthetic */ t(FirebaseMessaging firebaseMessaging) {
        this.o = firebaseMessaging;
    }

    public final void run() {
        FirebaseMessaging.e(this.o);
    }
}

