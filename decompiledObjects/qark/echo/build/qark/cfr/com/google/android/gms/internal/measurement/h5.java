/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.util.Iterator
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.p5;
import java.util.Iterator;

public final class h5
extends p5 {
    public final /* synthetic */ d5 p;

    public h5(d5 d52) {
        this.p = d52;
        super(d52, null);
    }

    public /* synthetic */ h5(d5 d52, g5 g52) {
        this(d52);
    }

    @Override
    public final Iterator iterator() {
        return new f5(this.p, null);
    }
}

