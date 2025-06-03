/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.M3;

public abstract class k3
implements L4 {
    public abstract /* synthetic */ Object clone();

    public abstract k3 g(byte[] var1, int var2, int var3);

    public abstract k3 j(byte[] var1, int var2, int var3, M3 var4);

    @Override
    public final /* synthetic */ L4 m(byte[] arrby) {
        return this.g(arrby, 0, arrby.length);
    }

    @Override
    public final /* synthetic */ L4 r(byte[] arrby, M3 m32) {
        return this.j(arrby, 0, arrby.length, m32);
    }
}

