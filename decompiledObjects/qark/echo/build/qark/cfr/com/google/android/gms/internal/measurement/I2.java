/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.G2;
import com.google.android.gms.internal.measurement.J2;

public final class I2
implements G2 {
    public /* synthetic */ J2 a;
    public /* synthetic */ String b;

    public /* synthetic */ I2(J2 j22, String string2) {
        this.a = j22;
        this.b = string2;
    }

    @Override
    public final Object a() {
        return this.a.c(this.b);
    }
}

