/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.y4;
import java.util.concurrent.Callable;

public final class D0
implements Callable {
    public /* synthetic */ C o;

    public /* synthetic */ D0(C c8) {
        this.o = c8;
    }

    public final Object call() {
        return new y4(this.o.c);
    }
}

