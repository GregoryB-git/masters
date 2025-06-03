/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 */
package com.google.firebase.messaging;

import V2.b;
import V2.j;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.n;

public final class k
implements b {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k(Context context, Intent intent, boolean bl) {
        this.a = context;
        this.b = intent;
        this.c = bl;
    }

    @Override
    public final Object a(j j8) {
        return n.a(this.a, this.b, this.c, j8);
    }
}

