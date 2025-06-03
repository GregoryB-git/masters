/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.n;
import java.util.concurrent.Callable;

public final class j
implements Callable {
    public final /* synthetic */ Context o;
    public final /* synthetic */ Intent p;

    public /* synthetic */ j(Context context, Intent intent) {
        this.o = context;
        this.p = intent;
    }

    public final Object call() {
        return n.b(this.o, this.p);
    }
}

