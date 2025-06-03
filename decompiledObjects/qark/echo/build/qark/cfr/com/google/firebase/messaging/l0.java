/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.Process
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package com.google.firebase.messaging;

import V2.e;
import V2.j;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.k0;
import com.google.firebase.messaging.o0;
import java.util.concurrent.Executor;
import r1.m;

public class l0
extends Binder {
    public final a b;

    public l0(a a8) {
        this.b = a8;
    }

    public static /* synthetic */ void a(o0.a a8, j j8) {
        a8.d();
    }

    public void c(o0.a a8) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                Log.d((String)"FirebaseMessaging", (String)"service received new intent via bind strategy");
            }
            this.b.a(a8.a).c(new m(), new k0(a8));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }

    public static interface a {
        public j a(Intent var1);
    }

}

