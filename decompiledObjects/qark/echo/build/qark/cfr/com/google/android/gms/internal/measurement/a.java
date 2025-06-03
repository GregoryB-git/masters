/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.n;
import java.util.concurrent.Callable;

public final class a
implements Callable {
    public /* synthetic */ C o;

    public /* synthetic */ a(C c8) {
        this.o = c8;
    }

    public final Object call() {
        return this.o.e();
    }
}

