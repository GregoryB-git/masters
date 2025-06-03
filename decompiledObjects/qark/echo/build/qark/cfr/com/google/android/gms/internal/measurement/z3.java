/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A3;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.y3;

public final class z3 {
    public final J3 a;
    public final byte[] b;

    public z3(int n8) {
        byte[] arrby = new byte[n8];
        this.b = arrby;
        this.a = J3.D(arrby);
    }

    public /* synthetic */ z3(int n8, y3 y32) {
        this(n8);
    }

    public final q3 a() {
        this.a.E();
        return new A3(this.b);
    }

    public final J3 b() {
        return this.a;
    }
}

